package test.interview;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * cas = compareAndSet(比较并交换)
 */
public class CASDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.compareAndSet(2,9999);
    }
}
