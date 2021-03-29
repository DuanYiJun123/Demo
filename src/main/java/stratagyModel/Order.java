package stratagyModel;

import stratagyModel.payport.PayStrategy;
import stratagyModel.payport.Payment;

public class Order {

    private String orderId;
    private double price;

    public Order(String orderId, double price) {
        this.orderId = orderId;
        this.price = price;
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("交易金额为"+ this.price);
        return payment.pay(orderId,price);
    }
}

