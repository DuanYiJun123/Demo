package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author yijun.dyj
 * @Date 2020/11/3 9:56 AM
 **/
public class preOrderSulotion {

    /**
     * 递归法
     *
     * @param root
     * @return
     */
    public List<Integer> preOrderSolution(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        while (root != null) {
            List<Integer> left = preOrderSolution(root.left);
            List<Integer> right = preOrderSolution(root.right);

            result.add(root.value);
            result.addAll(left);
            result.addAll(right);
        }
        return result;
    }

    /**
     * 非递归法
     */

    public List<Integer> preOrderSolution1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            result.add(stack.pop().value);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return result;
    }

}
