package test.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class TestComplateFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, ParseException {
        testThenApplyAsync02();
        SimpleDateFormat.getInstance();
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(c.getTime()));


        Thread.sleep(500); //主线程不要立马结束 等待时间大于另外线程不然打印动作可能不会执行
    }
    public static void testCompletableFutrue(){ //测试基本completableFutrue
        CompletableFuture<String> completableFuture01 = new CompletableFuture().supplyAsync(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hollysys smf";
        });
        completableFuture01.thenAccept((x)->{//如果执行正常
            System.out.println(x+"---TEST001");
        });
        completableFuture01.exceptionally((x)->{
            x.printStackTrace();
            return String.valueOf(x);
        });
    }
    public static void testThenApplyAsync01(){ //测试串行功能
        CompletableFuture<String> completableFuture01 = new CompletableFuture().supplyAsync(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hollysys smf";
        });
        CompletableFuture<String> completableFuture02 = completableFuture01.thenApplyAsync((code)->{
            return code+"+++nice" ;
        });
        completableFuture02.thenAccept((object)->{
            System.out.println(object);
        });
    }
    public static void testThenApplyAsync02() throws ExecutionException, InterruptedException { //测试串行功能
        CompletableFuture<String> completableFuture01 = new CompletableFuture().supplyAsync(()->{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "数据查询成功01";
        });
        CompletableFuture<String> completableFuture02 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "数据查询成功02";
        });
        System.out.println(completableFuture01.get()+completableFuture02.get());
        CompletableFuture<Object> completableFuture03 = CompletableFuture.anyOf(completableFuture01,completableFuture02);
        completableFuture03.thenAccept((object)->{ //两个futrue任意一个执行完就返回结果 哪个计算结束早返回哪个。
            System.out.println("数据查询成功03");
        });

    }

}
