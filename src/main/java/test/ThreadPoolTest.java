package test;

/**
 * @Author yijun.dyj
 * @Date 2019/12/3 2:52 PM
 **/
public class ThreadPoolTest {

    public static void main(String[] args) {

        ThreadPool.run(() -> {
            //test(i);
        });

    }

    public static void test(int i) {
        for (int j = 0; j < 100; j++) {
            System.out.println("i的值为：" + i + "在处理中");
        }
    }
}
