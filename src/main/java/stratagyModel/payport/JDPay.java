package stratagyModel.payport;

public class JDPay extends Payment {
    @Override
    public String getName() {
        return "JDPay";
    }

    @Override
    protected double queryBalance(String orderId) {
        return 500;
    }
}
