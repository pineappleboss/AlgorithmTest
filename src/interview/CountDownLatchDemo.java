package src.interview;

import java.util.concurrent.CountDownLatch;

/**
 * VIVO被干掉了！！！
 * XIAOMI被干掉了！！！
 * OPPO被干掉了！！！
 * HUAWEI被干掉了！！！
 * APPLE被干掉了！！！
 * XIAOMI
 */
public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 1; i <=5; i++) {
            new Thread(()->{
                countDownLatch.countDown();
                System.out.println(Thread.currentThread().getName());
                },TestEnum.searchPhone(i).getRetName()+"被干掉了！！！").start();
        }
        countDownLatch.await();
        System.out.println(TestEnum.XIAOMI.getRetName());
    }
    public static  void countDownLatych(){


    }
}
