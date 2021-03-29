package stack;

import java.util.Stack;

/**
 * @Author yijun.dyj
 * @Date 2020/10/16 9:47 AM
 **/
public class MinumStack {

    private Stack<Integer> stack;
    private Stack<Integer> minumStack;

    public MinumStack() {
        this.stack = new Stack<>();
        this.minumStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minumStack.isEmpty() || x < minumStack.peek()) {
            minumStack.push(x);
        } else {
            minumStack.push(minumStack.peek());
        }
    }

    public Integer pop() {
        stack.pop();
        return minumStack.pop();
    }

    public Integer getMin() {
        return minumStack.peek();
    }

    public static void main(String[] args) {
        MinumStack minumStack = new MinumStack();

        minumStack.push(4);
        minumStack.push(5);
        minumStack.push(3);
        minumStack.pop();
        System.out.println(minumStack.getMin());
    }
}
