package testdemo;

/**
 * @Author yijun.dyj
 * @Date 2021/1/29 2:25 PM
 **/
public class Test {

    public static void main(String[] args) {

        boolean test = test();
        System.out.println(test);

    }

    public static boolean test() {

        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
