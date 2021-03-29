package abc;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2020/4/30 11:23 AM
 **/
public class Test {

    public static void main(String[] args) {

        String template = "{\"argsTypes\":[cn.damai.ec.trade.ds.client.param.report.QueryProjectSaleReportParam],"
            + "\"argsObjs\":[\"itemId\":${itemId},\"orderCreateEndDate\":${orderCreateEndDate},"
            + "\"orderCreateStartDate\":1546272000000,\"option\":{\"querySaleInventory\":true,"
            + "\"queryFansMissTicket\":true,\"needRealTime\":true,\"queryChannelSummary\":true,\"class\":\"cn.damai"
            + ".ec.trade.ds.client.param.report.QueryProjectSaleReportOption\",\"queryTicketChooseSeat\":true}]}";

        Map<String, String> map = new HashMap<>();
        map.put("${itemId}", "123456");
        map.put("${orderCreateEndDate}", "5555");
        String parse = PattenConfig.parse(template, map);

        System.out.println(parse);

    }
}
