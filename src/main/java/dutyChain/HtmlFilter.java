package dutyChain;

public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.requestStr.replace('<', '[').replace('>', ']') + "---HtmlFilter";
        chain.doFilter(request, response, chain);
        response.responseStr += "---HTMLFilter()";
    }
}
