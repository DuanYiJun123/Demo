package jiaoji;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2021/1/25 8:33 PM
 **/
public class Digui {

    public static void main(String[] args) {

        //Demo demo = new Demo("0");

        List<Demo> list1 = new ArrayList<>();
        list1.add(new Demo("1"));
        list1.add(new Demo("2"));
        list1.add(new Demo("3"));
        list1.add(new Demo("4"));
        list1.add(new Demo("5"));
        Demo demo2 = new Demo("6");
        List<Demo> list2 = new ArrayList<>();
        list2.add(new Demo("7"));
        list2.add(new Demo("8"));
        list2.add(new Demo("9"));
        list2.add(new Demo("10"));
        demo2.setChildrens(list2);
        list1.add(demo2);
       // demo.setChildrens(list1);

        int childrens = getChildrens(list1);
        System.out.println(childrens);

        List<String> childrenList = getChildrenList(list1);
        for (int i = 0; i < childrenList.size(); i++) {
            System.out.println(childrenList.get(i));
        }

    }

    public static int getChildrens(List<Demo> childrens) {
        int num = 0;

        if (childrens == null || childrens.isEmpty()) {
            return 0;
        }
        if (!childrens.isEmpty()) {
            num = childrens.size();
            for (int i = 0; i < childrens.size(); i++) {
                num += getChildrens(childrens.get(i).getChildrens());
            }
        }
        return num;
    }

    public static List<String> getChildrenList(List<Demo> childrens) {
        List<String> resultList = new ArrayList<>();
        if (childrens == null || childrens.isEmpty()) {
            return resultList;
        }
        if (!childrens.isEmpty()) {
            for (int i = 0; i < childrens.size(); i++) {
                resultList.add(childrens.get(i).getName());
                resultList.addAll(getChildrenList(childrens.get(i).getChildrens()));
            }
        }
        return resultList;
    }

}
