package test.interview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 非公平锁不是按顺序
 * 可重入锁（递归锁）进入内层会自动获取外层的锁：防止死锁
 *
 */
class Phone{
    /**
     * 线程操作资源类
     */
    public synchronized void sendMessage(){
        System.out.println(Thread.currentThread().getId()+"-----sendMessage");
        call();
    }
    public synchronized void call(){
        System.out.println(Thread.currentThread().getId()+"-----sendMessage");
    }
}

public class ReentrantLookDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(()->{
            phone.sendMessage();
        }).start();
        new Thread(()->{
            phone.sendMessage();
        }).start();
        shouJI shouJI = new shouJI();
        new Thread(shouJI).start();
        new Thread(shouJI).start();
    }
}
class shouJI implements Runnable{
    /**
     * 线程操作资源类
     */
    Lock lock = new ReentrantLock();
    public  void sendMessage(){
        lock.lock();
        System.out.println(Thread.currentThread().getId()+"-----sendMessage");
        call();
        lock.unlock();
    }
    public  void call(){
        lock.lock();
        System.out.println(Thread.currentThread().getId()+"-----sendMessage");
        lock.unlock();
    }

    @Override
    public void run() {
        sendMessage();
    }
}
