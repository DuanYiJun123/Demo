package myProxy;

import java.lang.reflect.InvocationHandler;

public class MyProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) {

        try {
            String src = generateSrc(interfaces);

        } catch (Exception e) {

        }

        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {
        //用代码写代码
        StringBuffer sb = new StringBuffer();
        sb.append("package myProxy.MyProxy" + ln);
        sb.append("import proxyDemo.Person" + ln);
        sb.append("");
        return null;

    }
}
