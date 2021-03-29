package time;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @Author yijun.dyj
 * @Date 2020/3/19 10:57 AM
 **/
public class Re {

    private static String parse(String content, Map<String, String> kvs) {
        Pattern p = Pattern.compile("(\\$\\{)([\\w]+)(\\})");
        Matcher m = p.matcher(content);
        StringBuffer sr = new StringBuffer();
        while (m.find()) {
            String group = m.group();
            m.appendReplacement(sr, kvs.get(group));
        }
        m.appendTail(sr);
        return sr.toString();
    }

    public static void main(String[] args) {
        String str="[{\"templateId\":1,\"templateName\":\"票务云交易\","
            + "\"templateContent\":\"今天${BEGINTIME}后，票务云压测交易下单链路，如出现交易成交量明显下跌等异常，会立即停止压测，请关注~，如有问题，请联系@${ANNOUNCER"
            + "}～\"},\n"
            + "\n"
            + "{\"templateId\":2,\"templateName\":\"选座\","
            + "\"templateContent\":\"今天晚上${BEGINTIME}后选座链路压测，如出现影响选座体验及下单等异常，会立即停止压测，请关注~如问题请联系@${ANNOUNCER}~\"},\n"
            + "\n"
            + "{\"templateId\":3,\"templateName\":\"大麦交易\","
            + "\"templateContent\":\"今天晚上${BEGINTIME}后大麦交易压测票务云数字库存下单链路，如出现交易成交量明显下跌等异常，会立即停止压测，请关注~如问题请联系@$"
            + "{ANNOUNCER}～\"},\n"
            + "\n"
            + "{\"templateId\":4,\"templateName\":\"大麦交易，商品，用户中心\","
            + "\"templateContent\":\"今天${BEGINTIME"
            + "}左右大麦用户中心、商品详情、交易链路整体压测，如出现商品详情访问成功率下跌、交易成交量明显下跌等异常，会立即停止压测，请关注，谢谢~如问题请联系@${ANNOUNCER}～\"},\n"
            + "\n"
            + "{\"templateId\":5,\"templateName\":\"自定义\","
            + "\"templateContent\":\"今天${BEGINTIME}后${who}压测${what}链路，依赖外部${what}内部${what}，如出现${what"
            + "}等异常，会立即停止压测，请关注如问题请联系@${ANNOUNCER}～\"}]";

        Map<String, String> m = new HashMap<>();
        m.put("${BEGINTIME}", "hanhanhanhann");
        m.put("${ANNOUNCER}", "zhongzhongzhong");
        System.out.println(parse(str, m));
    }
}
