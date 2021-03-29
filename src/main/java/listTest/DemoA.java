package listTest;

/**
 * @Author yijun.dyj
 * @Date 2019/11/25 11:01 AM
 **/
public class DemoA {

    int numleft;
    int numright;

    public DemoA(int numleft, int numright) {
        this.numleft = numleft;
        this.numright = numright;
    }

    public DemoA() {
        numleft = 10;
        numright = 100;
    }

    public int add() {
        int sum = 0;
        sum = numleft + numright;
        return sum;
    }

    public int add(int anum) {
        numright += anum;
        numleft += anum;
        return numleft + numright;
    }

    @Override
    public String toString() {
        return "DemoA{" +
            "numleft=" + numleft +
            ", numright=" + numright +
            '}';
    }
}
