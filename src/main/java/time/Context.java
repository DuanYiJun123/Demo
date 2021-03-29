package time;

/**
 * @Author yijun.dyj
 * @Date 2020/2/12 5:53 PM
 **/

public class Context {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Context{" +
            "str='" + str + '\'' +
            '}';
    }
}
