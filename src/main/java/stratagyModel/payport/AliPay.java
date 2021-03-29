package stratagyModel.payport;

public class AliPay extends Payment {
    @Override
    public String getName() {
        return "AliPay";
    }

    @Override
    protected double queryBalance(String orderId) {
        return 900;
    }
}
