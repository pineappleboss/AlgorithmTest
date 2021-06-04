package test.interview;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
* @Description: 自旋锁实现
* @Param:
* @Author: Tiankaiqiang
* @Return:
* @Date: 2021/6/3 - 10:40
*/
public class FinanceSpinLock implements Lock {
  AtomicBoolean islock = new AtomicBoolean(true);
  //false时一直自旋
  @Override
  public void lock() {
    boolean lock;
    do{
      lock = islock.compareAndSet(true,false);
    }
    while (!lock);{}//lock是false时一直循环
  }

  @Override
  public void lockInterruptibly() throws InterruptedException {

  }

  @Override
  public boolean tryLock() {
    return false;
  }

  @Override
  public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
    return false;
  }

  @Override
  public void unlock() {
    islock.compareAndSet(false,true);
  }

  @Override
  public Condition newCondition() {
    return null;
  }
}
