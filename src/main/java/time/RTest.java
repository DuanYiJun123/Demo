package time;

/**
 * @Author yijun.dyj
 * @Date 2020/3/17 11:09 AM
 **/
public class RTest {

    Long a = 1000L;

    private void test(Long b) {
        b = 1000000L;
    }

    public static void main(String[] args) {
        RTest r = new RTest();
        r.test(r.a);
        System.out.println(r.a);
    }
}
