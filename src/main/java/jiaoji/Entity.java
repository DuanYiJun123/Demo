package jiaoji;

import java.util.Objects;

/**
 * @Author yijun.dyj
 * @Date 2020/11/12 8:21 PM
 **/
public class Entity {

    int a;

    int b;

    public Entity(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Entity entity = (Entity)o;
        return a == entity.a &&
            b == entity.b;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "Entity{" +
            "a=" + a +
            ", b=" + b +
            '}';
    }
}
