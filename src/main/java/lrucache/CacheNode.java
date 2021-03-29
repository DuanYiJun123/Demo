package lrucache;

/**
 * @Author yijun.dyj
 * @Date 2020/10/15 9:35 AM
 **/
public class CacheNode {

    public int key;

    public int value;

    public CacheNode pre;

    public CacheNode next;

    public CacheNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.pre = null;
        this.next = null;
    }
}
