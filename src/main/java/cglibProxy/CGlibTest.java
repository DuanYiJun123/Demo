package cglibProxy;

import proxyDemo.Girl;
import proxyDemo.Person;

public class CGlibTest {

    public static void main(String[] args) {
        Customer getinstance = (Customer)new CGlibProxy().getinstance(Customer.class);
        getinstance.findLove();
    }
}
