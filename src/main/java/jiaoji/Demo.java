package jiaoji;

import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2021/1/25 8:34 PM
 **/
public class Demo {

    public String name;

    public List<Demo> childrens;

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Demo> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Demo> childrens) {
        this.childrens = childrens;
    }
}
