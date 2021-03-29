package listTest;

/**
 * @Author yijun.dyj
 * @Date 2019/11/25 10:19 AM
 **/
public class ParserTest {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("sign(x)=" + sign(x));
    }

    private static int sign(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
