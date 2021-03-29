package time;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2020/3/25 3:31 PM
 **/
public class Interval {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        String str = "str";

        for (int i = 0; i < list.size(); i++) {
            str += list.get(i);
            if (i != list.size()-1) {
                str += "&";
            }
        }
        System.out.println(str);
    }
}
