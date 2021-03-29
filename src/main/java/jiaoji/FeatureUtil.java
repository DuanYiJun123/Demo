package jiaoji;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2021/2/1 2:36 PM
 **/
public class FeatureUtil {
    static final String SP = ";";
    static final String SSP = ":";
    public static final String SSSP = "|";
    static final String R_SP = "#3A";
    static final String R_SSP = "#3B";

    public FeatureUtil() {
    }

    public static final String upsertValue(String features, String key, String val) {
        Map<String, String> map = toMap(features);
        map.put(key, val);
        return toString(map);
    }

    public static final String toString(Map<String, String> attrs) {
        StringBuilder sb = new StringBuilder();
        if (null != attrs && !attrs.isEmpty()) {
            sb.append(";");
            Iterator var2 = attrs.keySet().iterator();

            while(var2.hasNext()) {
                String key = (String)var2.next();
                String val = (String)attrs.get(key);
                if (StringUtils.isNotEmpty(val)) {
                    sb.append(encode(key)).append(":").append(encode(val)).append(";");
                }
            }
        }

        return sb.toString();
    }

    public static final String toString(String key, String val) {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotEmpty(key) && StringUtils.isNotEmpty(val)) {
            sb.append(";");
            sb.append(encode(key)).append(":").append(encode(val));
            sb.append(";");
        }

        return sb.toString();
    }

    /** @deprecated */
    @Deprecated
    public static final Map<String, String> fromString(String str) {
        return toMap(str);
    }

    public static final Map<String, String> toMap(String str) {
        Map<String, String> attrs = new HashMap();
        if (StringUtils.isNotBlank(str)) {
            String[] arr = str.split(";");
            if (null != arr) {
                String[] var3 = arr;
                int var4 = arr.length;

                for(int var5 = 0; var5 < var4; ++var5) {
                    String kv = var3[var5];
                    if (StringUtils.isNotBlank(kv)) {
                        String[] ar = kv.split(":");
                        if (null != ar && ar.length == 2) {
                            String key = decode(ar[0]);
                            String val = decode(ar[1]);
                            if (StringUtils.isNotEmpty(val)) {
                                attrs.put(key, val);
                            }
                        }
                    }
                }
            }
        }

        return attrs;
    }

    public static final String getValueByKey(String features, String key) {
        Map<String, String> featureMap = toMap(features);
        return featureMap.containsKey(key) ? (String)featureMap.get(key) : null;
    }

    public static final Integer getIntValue(String features, String key) {
        String rt = getValueByKey(features, key);
        if (StringUtils.isEmpty(rt)) {
            rt = "0";
        }

        try {
            return Integer.parseInt(rt);
        } catch (NumberFormatException var4) {
            return 0;
        }
    }

    public static String encode(String val) {
        return StringUtils.replace(StringUtils.replace(val, ";", "#3A"), ":", "#3B");
    }

    public static String decode(String val) {
        return StringUtils.replace(StringUtils.replace(val, "#3A", ";"), "#3B", ":");
    }

    public static Map<String, String> putFirst(String key, String value) {
        if (StringUtils.isNotBlank(value)) {
            Map<String, String> map = new HashMap();
            map.put(key, value);
            return map;
        } else {
            return new HashMap();
        }
    }

    public static String upsertFeature(String oriFeatureStr, Map<String, String> increInfoMap) {
        Map<String, String> oriMap = toMap(oriFeatureStr);
        return upsertFeature(oriMap, increInfoMap);
    }

    public static String upsertFeature(Map<String, String> oriFeatureMap, Map<String, String> increInfoMap) {
        oriFeatureMap.putAll(increInfoMap);
        return toString(oriFeatureMap);
    }

    public static void main(String[] args) {
        String features=";showPhoto:i2/TB1j8cLcVooBKNjSZPhXXc2CXXa_.jpg;sfee:202;hall:2厅;cinemaPhone:0571-88155188,"
            + "2456 13612341234;cityId:5829;pic:1732;sc_detail:2088721417907785-1071-C,2088621958695283-2-M,"
            + "2088421220964248-200-TPP;deviceId:Akz3GPphinzJdcqGHgnaAu5qrbfeiEArSUX1RWMBsuws;LOCK_TIME:1611908887;"
            + "zero:false;cinemaName:淘票票测试影院三;tgpi:67BA65E6-F5B2-48AE-A48E-34E49E812510;from:alipay;"
            + "ticketContent:{\"codes\"#3B{\"取票号\"#3B\"2021012975969593\"},"
            + "\"info\"#3B\"请使用取票号在影院取票机或柜台取票，如有问题致电淘宝客服：0571-88157838\"};scheduleFlag:12;"
            + "longitude:121.45586899458138;seatIds:2543;lattude:31.165145189521425;_order_version_:App_5.0;"
            + "aliPassId:264342341344;std:459;utdid:Xz+czCxqj8MDAAFjVpKcnOVh;tcfee:20;cinemaAct:2088721417907785;"
            + "mixup_order_detail(gson):{\"activtyList\"#3B[{\"activtyId\"#3B189564,\"seatSize\"#3B1,\"type\"#3B1,"
            + "\"cost\"#3B2}],\"couponContentList\"#3B[{\"activityId\"#3B235888,\"fcodeProductId\"#3B87369,"
            + "\"type\"#3B2,\"fCode\"#3B\"29NB9B67MP7\",\"cost\"#3B100}],\"normalSeatSize\"#3B0,\"price\"#3B1732};"
            + "sptp:2;version:英语 2D;ttid:apple-iphone@alipay_iphone_10.2.6.693;cardSeatNum:1;"
            + "mixSeatDetail:[{\"al\"#3B[{\"d\"#3B2,\"i\"#3B\"189564\",\"t\"#3B1},{\"d\"#3B100,"
            + "\"m\"#3B\"29NB9B67MP7\",\"t\"#3B2}],\"machineFee\"#3B2,\"pic\"#3B1273,\"seatId\"#3B\"2543\","
            + "\"systemFee\"#3B0,\"tppFee\"#3B200}];cinemaPhoto:https#3B//taobaodianying.alicdn"
            + ".com/cpic/1609221231310comPic.jpg;ult:V1;LOCK_VERSION:1;rt:10;tfbuy:1;t_sc:2088721417907785-1071-C,"
            + "2088621958695283-2-M,2088421220964248-200-TPP;sqm:dianying.ap.arhat.home;cinemaAddress:淘票票二区3号（地址不能改）;"
            + "duration:126;result:true;api_flag:o;aliPymt:true;showEndTime:1611929760000;mcId:2107;showName:超人总动员2;"
            + "seqno:2021012975969593;sName:淘票票-淘出好时光;sellerAc:2088421220673979;sUid:2935370446;S_Fg:0;isNew:1;"
            + "_p_pf:my;env:pre;emcId:2107;userTag:3;";
        String mixup_order_detail = FeatureUtil.getValueByKey(features, "mixup_order_detail(gson)");

        System.out.println(mixup_order_detail);
    }
}
