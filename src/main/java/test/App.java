package test;

import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class App {

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 4; i++) {
            threadPool.execute(()->{
                doWrite();
            });
        }

        while (!threadPool.isTerminated()) {
            try {
                Thread.sleep(100);
                threadPool.shutdownNow();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private static void doWrite() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "===" + i);
        }
    }
}
