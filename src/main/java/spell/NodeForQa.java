package spell;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2021/3/2 5:33 PM
 **/
public class NodeForQa {

    private Integer num;

    private List<NodeForQa> childrens = new ArrayList<>();

    private String name;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<NodeForQa> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<NodeForQa> childrens) {
        this.childrens = childrens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NodeForQa{" +
            "num=" + num +
            ", name='" + name + '\'' +
            '}';
    }
}
