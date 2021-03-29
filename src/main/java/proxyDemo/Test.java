package proxyDemo;

public class Test {

    public static void main(String[] args) {
        DemoProxy demoProxy = new DemoProxy();
        Person person = (Person)demoProxy.getInstance(new Girl());
        person.findLove();
    }
}
