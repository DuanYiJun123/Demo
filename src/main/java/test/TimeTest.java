package test;

import java.util.Date;

/**
 * @Author yijun.dyj
 * @Date 2019/12/3 8:58 PM
 **/
public class TimeTest {

    public static void main(String[] args) {
        Date endtime = new Date();
        long time = endtime.getTime();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long now = System.currentTimeMillis();
        if (now < time) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
        System.out.println(time);
    }
}
