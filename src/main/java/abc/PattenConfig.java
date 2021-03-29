package abc;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author yijun.dyj
 * @Date 2020/4/30 11:51 AM
 **/
public class PattenConfig {

    private static Pattern p = Pattern.compile("(\\$\\{)([\\w]+)(\\})");

    public static String parse(String content, Map<String, String> kvs) {
        Matcher m = p.matcher(content);
        StringBuffer sr = new StringBuffer();
        while (m.find()) {
            String group = m.group();
            if (kvs.get(group) != null) {
                m.appendReplacement(sr, kvs.get(group));
            }
        }
        m.appendTail(sr);
        return sr.toString();
    }
}
