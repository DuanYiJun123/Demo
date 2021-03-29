package testc;

import com.alibaba.fastjson.JSONObject;
import sun.jvm.hotspot.debugger.ThreadAccess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author yijun.dyj
 * @Date 2020/1/9 6:02 PM
 **/
public class App {

    public static void main(String[] args) throws ParseException {
        //ExecutorService service = Executors.newCachedThreadPool();
        //
        //for (int i = 0; i < 4; i++) {
        //
        //    int finalI = i;
        //    service.submit(() -> {
        //        try {
        //            Thread.sleep(100);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }
        //        System.out.println("j  " + finalI + "  " + Thread.currentThread().getName());
        //
        //    });
        //}
        //try {
        //    Thread.currentThread().join(1);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //System.out.println("ooooooo");
        //service.shutdown();
        //
        //while (!service.isTerminated()) {
        //    try {
        //        Thread.sleep(100);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //}
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            ThreadPool.run(() -> {
                //try {
                //    Thread.sleep(1000);
                //} catch (InterruptedException e) {
                //    e.printStackTrace();
                //}
                System.out.println("i: " + finalI + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        //try {
        //    Thread.currentThread().join(10);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //
        //System.out.println("ooooooooooooooooooo");

        //for (int j = 0; j < 4; j++) {
        //    int finalJ = j;
        //    ThreadPool.run(() -> {
        //        System.out.println("j: " + finalJ + " " + Thread.currentThread().getName());
        //    });
        //}

    }
}