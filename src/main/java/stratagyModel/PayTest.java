package stratagyModel;

public class PayTest {

    public static void main(String[] args) {
        Order order=new Order("123",3000);
        order.pay("AliPay");
    }
}
