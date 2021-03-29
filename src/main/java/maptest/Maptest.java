package maptest;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @Author yijun.dyj
 * @Date 2020/9/22 4:01 PM
 **/
public class Maptest {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("params", "123");
        map.put("feature", "321");
        String s = JSONObject.toJSONString(map);
        System.out.println(s);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("params", "123");
        jsonObject.put("feature", "321");
        String s1 = jsonObject.toJSONString();
        System.out.println(s1);
    }
}
