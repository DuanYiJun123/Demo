package listTest;

/**
 * @Author yijun.dyj
 * @Date 2019/11/22 8:54 PM
 **/

public class Param {

    private Integer a;

    private Integer b;

    private String c;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Param{" +
            "a=" + a +
            ", b=" + b +
            ", c='" + c + '\'' +
            '}';
    }
}
