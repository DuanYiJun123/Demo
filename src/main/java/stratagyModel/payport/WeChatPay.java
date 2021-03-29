package stratagyModel.payport;

public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "WeChatPay";
    }

    @Override
    protected double queryBalance(String orderId) {
        return 600;
    }
}
