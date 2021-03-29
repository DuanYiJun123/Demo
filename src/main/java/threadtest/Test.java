package threadtest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yijun.dyj
 * @Date 2020/1/7 3:29 PM
 **/
public class Test {

    private static List<Integer> list = new ArrayList<>();

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        //list.add(100);
        //list.add(200);
        //list.add(300);
        //list.add(400);
        //list.add(500);
        //
        //for (int i = 0; i < list.size(); i++) {
        //    int finalI = i;
        //    executorService.submit(() -> {
        //        System.out.println(list.get(finalI));
        //    });
        //}

        //for (int j = 0; j < 100; j++) {
        //    int finalJ = j;
        //    executorService.submit(() -> {
        //        try {
        //            System.out.println(finalJ);
        //        } catch (Exception e) {
        //
        //        }
        //    });
        //
        //}
        //
        //executorService.shutdown();
        //
        //while (executorService.isTerminated()){
        //    try {
        //        Thread.sleep(10);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //}

        Thread t1 = new Thread(() -> {
            System.out.println(doBuild());
        });
        Thread t2 = new Thread(() -> {
            System.out.println(doBuild());
        });
        Thread t3 = new Thread(() -> {
            System.out.println(doBuild());
        });

        t1.start();
        t2.start();
        t3.start();

        //for (int i = 0; i < 3; i++) {
        //    executorService.submit(() -> {
        //        System.out.println(doBuild());
        //    });
        //}

    }

    public static String doBuild() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200; i++) {
            sb.append(i);
            sb.append(",");
        }
        return sb.toString() + Thread.currentThread().getName();
    }
}


