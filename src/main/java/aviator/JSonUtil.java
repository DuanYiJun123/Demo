package aviator;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @Author yijun.dyj
 * @Date 2021/2/18 11:57 AM
 **/
public class JSonUtil {

    public static Object getJsonValueByKey(String json, String key) {
        JSONObject jsonObject = JSONObject.parseObject(json);
        Object result = jsonObject.get(key);
        return result;
    }

    public static Object getJSonArrayValueByKey(String json, String number, String key) {
        JSONArray jsonArray = JSONArray.parseArray(json);
        JSONObject jsonObject = (JSONObject)jsonArray.get(Integer.valueOf(number));
        Object result = jsonObject.get(key);
        return result;
    }

    //public static void main(String[] args) {
    //    String b = "[{\"cnt\":1,\"fee\":0,\"prdId\":77461,\"settle\":10}]";
    //    //String settle = JSonUtil.getJsonValueByKey(b, "settle");
    //    Object settle = getJSonArrayValueByKeyForLong(b, "settle");
    //    System.out.println(settle);
    //}
}
