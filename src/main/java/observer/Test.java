package observer;

public class Test {

    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer();
        Observer a = new User("张三");
        Observer b = new User("李四");
        Observer c = new User("王五");
        wechatServer.registerObserver(a);
        wechatServer.registerObserver(b);
        wechatServer.registerObserver(c);

        wechatServer.setInformation("推送消息");
    }
}
