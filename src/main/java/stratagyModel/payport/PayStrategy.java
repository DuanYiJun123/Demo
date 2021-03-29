package stratagyModel.payport;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    public static final String DEFAULT = "ALI_PAY";
    public static final String ALI_PAY = "ALI_PAY";
    public static final String JDPAY = "JDPAY";
    public static final String WECHATPAY = "WECHATPAY";

    private static Map<String, Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(JDPAY, new JDPay());
        payStrategy.put(WECHATPAY, new WeChatPay());
        payStrategy.put(DEFAULT, new AliPay());
    }

    public static Payment get(String payKey) {
        if (payStrategy.containsKey(payKey)) {
            return payStrategy.get(payKey);
        } else {
            return payStrategy.get(DEFAULT);
        }
    }
}
