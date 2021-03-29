package reversechain;

/**
 * @Author yijun.dyj
 * @Date 2020/10/10 9:48 AM
 **/
public class App {

    public static void main(String[] args) {
        Node head = initNode();
        //showNode(head);
       // Node reverseChain = reverseChain(head);
        //showNode(reverseChain);
        Node reverseChainM = reverseChainM(head, 2, 4);
        showNode(reverseChainM);

    }

    public static Node initNode() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        return node1;
    }

    public static void showNode(Node head) {
        if (head == null) {
            System.out.println("no node show");
        }
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node reverseChain(Node head) {

        if (head == null) {
            return null;
        }

        Node mNode = head;
        Node nNode = head.next;
        mNode.next = null;

        while (nNode != null) {
            Node next = nNode.next;
            nNode.next = mNode;
            mNode = nNode;
            nNode = next;
        }

        return mNode;
    }

    public static Node reverseChainM(Node head, int m, int n) {
        if (head == null || m > n) {
            return null;
        }

        Node dummy = new Node(-1);
        dummy.next = head;
        head = dummy;

        for (int i = 1; i < m; i++) {
            head = head.next;
        }

        Node pmNode = head;
        Node mNode = head.next;
        Node nNode = mNode;
        Node nnNode = mNode.next;

        for (int i = m; i < n; i++) {
            if (nnNode != null) {
                Node next = nnNode.next;
                nnNode.next = nNode;
                nNode = nnNode;
                nnNode = next;
            }
        }
        pmNode.next = nNode;
        mNode.next = nnNode;
        return dummy.next;
    }
}
