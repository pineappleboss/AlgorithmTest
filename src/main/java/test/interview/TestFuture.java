package test.interview;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/3/11 13:44
 * @describe
 */
public class TestFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor(); //创建一个线程池。
        Future future = executorService.submit(()->{ //提交一个runnable或者callable会返回一个futrue，其中保存线程运行结束的结果
            System.out.println("futrue****"+Thread.currentThread().getName());
            return 20;
        });
        while (!future.isDone()) {
          Thread.sleep(200);
        }
        System.out.println(future.get()); //获取线程执行之后的返回值

        executorService.execute(()->{ //提交执行一个线程
            System.out.println("ssssssssss");
        });
        future.cancel(!future.isDone());
        if(future.isDone()){
        executorService.shutdown();}
    }


}
