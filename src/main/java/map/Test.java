package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2021/2/20 11:38 AM
 **/
public class Test {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","a");
        map.put("1","b");

        System.out.println(map.get("1"));
    }
}
