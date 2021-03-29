package test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<Long> a=new HashSet<>();
        Set<Long> b=new HashSet<>();

        a.add(123123123L);
        a.add(456456456L);
        b.add(123123123L);
        b.add(456456456L);

        System.out.println(a.equals(b));
    }
}
