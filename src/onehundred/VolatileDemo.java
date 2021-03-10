package onehundred;

import java.util.concurrent.Future;

class number{
    //    volatile int vi = 0;
    volatile int vi = 0;
    void setNumber(){
        this.vi = 60;
        System.out.println(vi);
    }

    public void setNumberPlus() {
        this.vi++;
    }
}
public class VolatileDemo {
    public static void main(String[] args) {
        number number = new number();//写丢失，写覆盖，多次写入相同的数据。
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                   number.setNumberPlus();
                }
            }).start();
        }
     while (Thread.activeCount()>2){
         Thread.yield();//如果线程数大于2main线程暂停
     }
        System.out.println(number.vi);
    }
    //验证可见性
    static void testVolatile(){
        number num = new number();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                number.setNumber();
//            }
//        }).start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            try {num.setNumber();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"AAA").start();

        while((num.vi)!=0){
            System.out.println(Thread.currentThread().getName());
            num.setNumber();
        }
    }
}

