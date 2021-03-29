package observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

    private List<Observer> list;

    private String message;

    public WechatServer() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()) {
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInformation(String a) {
        this.message = a;
        System.out.println("微信服务更新消息：" + a);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
