package spell;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2021/3/2 2:59 PM
 **/
public class Node {

    private Integer num;

    private List<Node> childrens = new ArrayList<>();

    public Node(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public List<Node> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Node> childrens) {
        this.childrens = childrens;
    }

    @Override
    public String toString() {
        return "Node{" +
            "num=" + num +
            '}';
    }
}
