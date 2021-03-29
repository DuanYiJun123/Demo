package stratagyModel.payport;

import stratagyModel.MsgResult;

public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String orderId);

    public MsgResult pay(String orderId,double price){
        if(queryBalance(orderId)<price){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,price,"支付成功");
    }
}
