package time;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2020/4/15 10:19 AM
 **/
public class BTest {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        List<String> list = new ArrayList<>();

        list.add("123");

        list.add("456");

        list.add("789");

        map.put("key",list);

        System.out.println(map.toString());
    }
}
