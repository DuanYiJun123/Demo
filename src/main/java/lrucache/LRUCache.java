package lrucache;

import java.util.HashMap;

import java.util.Map;

/**
 * @Author yijun.dyj
 * @Date 2020/10/15 9:36 AM
 **/
public class LRUCache {

    private int capacity;

    private Map<Integer, CacheNode> cacheNodeMap;

    public CacheNode head;

    public CacheNode tail;

    public LRUCache(int capacity) {
        head = new CacheNode(-1, -1);
        tail = new CacheNode(-1, -1);
        this.capacity = capacity;
        this.cacheNodeMap = new HashMap<>();
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        if (!cacheNodeMap.containsKey(key)) {
            return -1;
        }
        CacheNode current = cacheNodeMap.get(key);
        current.pre.next = current.next;
        current.next.pre = current.pre;
        moveToTail(current);
        return current.value;
    }

    public void put(int key, int value) {
        //get里面调用过moveToTail
        if (get(key) != -1) {
            cacheNodeMap.get(key).value = value;
            return;
        }

        if (capacity == cacheNodeMap.size()) {
            cacheNodeMap.remove(head.next.key);
            head.next = head.next.next;
            head.next.pre = head;
        }

        CacheNode insert = new CacheNode(key, value);
        cacheNodeMap.put(key, insert);
        moveToTail(insert);
    }

    private void moveToTail(CacheNode current) {
        current.pre = tail.pre;
        tail.pre = current;
        current.pre.next = current;
        current.next = tail;
    }
}
