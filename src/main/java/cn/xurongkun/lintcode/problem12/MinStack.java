package cn.xurongkun.lintcode.problem12;

import java.util.Stack;

/**
 * 实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。

 你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。
 */
public class MinStack {

    private Stack<Integer> data;
    private Stack<Integer> tmp;


    public MinStack() {
        // do initialize if necessary
        this.data = new Stack<>();
        this.tmp = new Stack<>();
    }

    public void push(int number) {
        // write your code here
        this.data.push(number);
        if (this.tmp.isEmpty()) {
            this.tmp.push(number);
        } else {
            Integer num = this.tmp.peek();
            if (num > number) {     // 保证tmp的栈顶值一定是最小的那个
                this.tmp.push(number);
            } else {
                this.tmp.push(num);
            }
        }
    }

    public int pop() {
        this.tmp.pop();
        return data.pop();
    }

    public int min() {
        return this.tmp.peek();
    }
}
