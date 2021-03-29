package spell;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yijun.dyj
 * @Date 2021/3/1 4:37 PM
 **/
public class Spell {

    public static void main(String[] args) {
        Node root = new Node(0);

        Node node1 = new Node(1);
        Node node2 = new Node(2);

        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        Node node9 = new Node(3);
        Node node10 = new Node(4);

        List<Node> children1 = new ArrayList<>();
        children1.add(node9);
        children1.add(node10);

        node1.setChildrens(children1);

        List<Node> children = new ArrayList<>();
        children.add(node1);
        children.add(node2);
        children.add(node3);
        children.add(node4);
        children.add(node5);
        children.add(node6);
        children.add(node7);
        children.add(node8);

        root.setChildrens(children);

        //Node idRecursion = getIdRecursion(10, root);

        NodeForQa nodeForQa = rebuildTree(root);
        printTree(nodeForQa);

        // printTree(root);

        //System.out.println();
    }

    public static NodeForQa rebuildTree(Node node) {
        NodeForQa root = new NodeForQa();
        if (node.getNum() != 0) {
            root.setName("name");
        }
        root.setNum(node.getNum());
        List<Node> childrens = node.getChildrens();
        if (!childrens.isEmpty()) {
            List<NodeForQa> nodeForQas = new ArrayList<>();
            for (Node node1 : childrens) {
                nodeForQas.add(rebuildTree(node1));
            }
            root.setChildrens(nodeForQas);
        }
        return root;
    }

    //public static List<NodeForQa> setChildrenTree(List<Node> childrens) {
    //    List<NodeForQa> result = new ArrayList<>();
    //    for (Node node : childrens) {
    //        NodeForQa nodeForQa = new NodeForQa();
    //        nodeForQa.setName("name");
    //        nodeForQa.setNum(node.getNum());
    //        result.add(nodeForQa);
    //    }
    //    return result;
    //}

    public static Node getIdRecursion(Integer id, Node node) {
        if (node.getNum().equals(id)) {
            return node;
        }
        List<Node> childrens = node.getChildrens();
        if (!childrens.isEmpty()) {
            for (Node node1 : childrens) {
                Node idRecursion = getIdRecursion(id, node1);
                if (idRecursion != null) {
                    return idRecursion;
                }
            }
        }
        return null;
    }

    public static void printTree(NodeForQa root) {
        if (root != null) {
            System.out.println(root.toString());
        }

        List<NodeForQa> childrens = root.getChildrens();
        if (!childrens.isEmpty()) {
            for (NodeForQa nodeForQa : childrens) {
                printTree(nodeForQa);
            }
        }
    }

    public static void printTree(Node root) {
        if (root != null) {
            System.out.println(root.toString());
        }

        List<Node> childrens = root.getChildrens();
        if (!childrens.isEmpty()) {
            for (Node nodeForQa : childrens) {
                printTree(nodeForQa);
            }
        }
    }

}
