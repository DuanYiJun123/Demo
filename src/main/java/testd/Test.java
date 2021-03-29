package testd;

import org.apache.commons.collections4.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2021/3/4 11:23 AM
 **/
public class Test {

    public static void main(String[] args) {
        // double coverage = 0;
        int drill = 1;
        int size = 13;
        // coverage = (drill / size) * 100;

        String format = String.format("%.2f", (float)(drill) / (float)(size) * 100);
        System.out.println(format);

    }

}
