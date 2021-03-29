package dutyChain;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();

    int index = 0;

    public FilterChain addFilter(Filter f) {
        filters.add(f);
        return this;
    }

    public List<Filter> getList() {
        return filters;
    }

    public void setList(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return;
        }

        Filter f = filters.get(index);
        index++;
        f.doFilter(request, response, chain);
    }
}
