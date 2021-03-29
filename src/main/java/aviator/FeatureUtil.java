package aviator;



import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2021/2/7 3:59 PM
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

            while (var2.hasNext()) {
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

    /**
     * @deprecated
     */
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

                for (int var5 = 0; var5 < var4; ++var5) {
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

}
