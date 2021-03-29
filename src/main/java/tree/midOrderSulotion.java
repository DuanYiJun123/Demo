package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author yijun.dyj
 * @Date 2020/11/5 11:10 AM
 **/
public class midOrderSulotion {

    public List<Integer> midOrderSulotion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        while (root != null) {
            List<Integer> left = midOrderSulotion(root.left);
            List<Integer> right = midOrderSulotion(root.right);

            result.addAll(left);
            result.add(root.value);
            result.addAll(right);
        }
        return result;
    }


    public List<Integer> midOrderSulotion1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.value);
            current = current.right;
        }
        return result;
    }
}
