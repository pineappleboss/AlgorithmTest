package test.interview;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁，自旋与阻塞的概念相对，指访问不到某一块资源时，循环的尝试
 * 手写自旋锁
 */
public class SpinLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Demo demo = new Demo();
        Thread thread = Thread.currentThread();
        new Thread(()->{
            demo.Lock(thread);
            System.out.println("AA获得资源");
            try {
                Thread.sleep(3000);
                demo.unLock(thread);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(1000);//保证AA先启动
        new Thread(()->{
            demo.Lock(thread);
            System.out.println("BB获得资源");
            try {
                Thread.sleep(3000);
                demo.unLock(thread);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
class Demo{
    AtomicReference<Thread> atomicReference = new AtomicReference<>();
    public void Lock(Thread thread){
        while (!(atomicReference.compareAndSet(null,thread))){//首次访问跳出循环。其他线程访问时会进入循环直至执行完unLock方法
            System.out.println(Thread.currentThread().getId()+"TM GKD");//没有资源的线程不停打印
        }
    }
    public void unLock(Thread thread){
        atomicReference.compareAndSet(thread,null);
    }
}
