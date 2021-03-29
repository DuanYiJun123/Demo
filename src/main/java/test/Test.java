package test;

import java.util.Random;

/**
 * @Author yijun.dyj
 * @Date 2020/4/20 5:14 PM
 **/
public class Test {

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Random random = new Random();
            int i1 = random.nextInt(11);
            System.out.println(i1);
        }
    }
}
