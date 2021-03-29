package lrucache;

/**
 * @Author yijun.dyj
 * @Date 2020/10/15 9:53 AM
 **/
public class App {

    public static void showNode(CacheNode cacheNode) {
        if (cacheNode == null) {
            System.out.println("no node");
        }
        while (cacheNode != null) {
            System.out.println(cacheNode.value);
            cacheNode = cacheNode.next;
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);

        lruCache.put(4,4);

        showNode(lruCache.head);
    }
}
