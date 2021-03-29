package time;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2020/3/30 7:56 PM
 **/
public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer i : list) {
            if (i.equals(3)) {
                continue;
            }
            System.out.println(i);
        }

        String str = null;
        if (StringUtils.isEmpty(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
