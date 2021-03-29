package testc;

import java.util.concurrent.*;

/**
 * @Author yijun.dyj
 * @Date 2020/1/14 10:28 AM
 **/
public class TestC {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 4; i++) {
            int finalI = i;
            executorService.submit(() -> {

                System.out.println("i: " + finalI + " " + Thread.currentThread().getName());
                latch.countDown();

            });

        }

        try {
            System.out.println("主线程 "+Thread.currentThread().getName()+"等待子线程执行完毕");
            latch.await();
            System.out.println("子线程执行完毕，主线程开始执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ooooooooooooooo");

    }
}
