package listTest;

import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2019/11/21 5:07 PM
 **/
public class Type {

    public static void main(String[] args) {
        Type type = new Type();
        Param p = new Param();
        type.caps(p);

        System.out.println(p.toString());
    }

    public void caps(Param param) {
        Param2 param2 = new Param2();
        param.setA(param2.getC());
        param.setB(param2.getD());
        param.setC(param2.getF());
    }
}
