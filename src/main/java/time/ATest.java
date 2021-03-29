package time;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2020/3/31 9:55 AM
 **/
public class ATest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(2)) {
                iterator.remove();
            }
        }

        System.out.println(list.toString());
    }
}
