package aviator;

/**
 * @Author yijun.dyj
 * @Date 2021/2/18 2:58 PM
 **/
public class ParserUtil {

    public static boolean compareWithNoNest(String feature, String key, String amount) {
        String prdInfos = FeatureUtil.getValueByKey(feature, key);
        return compare(amount, prdInfos);
    }

    public static boolean compareWithOneNest(String feature, String key1, String key2, String number, String amount) {
        String prdInfos = FeatureUtil.getValueByKey(feature, key1);
        Object jSonArrayValueByKey = JSonUtil.getJSonArrayValueByKey(prdInfos, number, key2);
        return compare(amount, jSonArrayValueByKey);
    }

    private static boolean compare(String amount, Object result) {
        Integer aValue = Integer.valueOf(amount);
        if (aValue.equals(result)) {
            return true;
        }
        return false;
    }

    public static String[] split(String str, String regex) {
        String[] split = str.split(regex);
        return split;
    }
}
