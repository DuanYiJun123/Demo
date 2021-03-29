package dutyChain;

public class FaceFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        //request.requestStr = request.requestStr.replace(":):", "^v^") + "----facaFilter";
        //chain.doFilter(request, response, chain);
        //response.responseStr += "---FaceFilter()";
    }

    public void test() {
        test2();

        test3();
    }

    //private int innerTest() {
    //    return 0;
    //}

    public void test2() {
        System.out.println("123");
    }

    public void test3() {
        System.out.println("456");
    }

}
