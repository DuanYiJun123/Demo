package dutyChain;

public class Test {

    public static void main(String[] args) {
        String msg = ":):,<script>,敏感,被就业,网络授课";

        Request request = new Request();
        request.setRequestStr(msg);

        Response response = new Response();
        response.setResponseStr("response");

        FilterChain fc = new FilterChain();
        fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());

        fc.doFilter(request, response, fc);

        System.out.println(request.getRequestStr());

        System.out.println(response.getResponseStr());
    }
}
