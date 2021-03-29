package time;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author yijun.dyj
 * @Date 2020/2/3 11:44 AM
 **/
public class Ttest {

    public void test() throws Exception {
        throw new Exception();
    }

    public int test1() throws Exception {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }
        return 1;

    }

    public static void main(String[] args) {
        Ttest t = new Ttest();
        int i = 0;
        try {
            i = t.test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
