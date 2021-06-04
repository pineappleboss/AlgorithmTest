package test.interview;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * 要使多线程操作ArrayList线程安全
 * 1.Vector
 * 2.collections.synchronizedList(new ArrayList<>())
 * 3.new CopyOnWriteArrayList<>()
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 4; i++) {
            new Thread(()->{
                list.add(Math.random()+"SSSSSSSSS");
                list.forEach(x->System.out.println(x));
            }).start();

        }
    }
}
