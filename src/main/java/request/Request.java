package request;

/**
 * @Author yijun.dyj
 * @Date 2019/12/1 3:19 PM
 **/

public class Request {

    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Request{" +
            "name='" + name + '\'' +
            ", value='" + value + '\'' +
            '}';
    }
}
