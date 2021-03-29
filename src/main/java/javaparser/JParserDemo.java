package javaparser;

/**
 * @Author yijun.dyj
 * @Date 2020/1/6 7:29 PM
 **/
public class JParserDemo {

    public Double calcPlus(Double a, Double b) {
        return a + b;
    }

    /**
     * comments calcMinus
     * @param a
     * @param b
     * @return
     */
    public Double calcMinus(Double a, Double b) {
        return a - b;
    }

    public Double calcMulti(Double a, Double b) {
        return a * b;
    }

    public Double allCall(Double a, Double b) {
        Double plus = calcPlus(a, b);
        Double minus = calcMinus(a, b);
        Double multi = calcMulti(plus, minus);
        return multi;
    }
}
