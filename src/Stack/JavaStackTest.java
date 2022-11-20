package Stack;

import java.util.Stack;

public class JavaStackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.empty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size()); //3
        System.out.println(stack.empty()); //false
        System.out.println(stack.peek());  // 30
        System.out.println(stack.pop());   // 30
        System.out.println(stack.peek());  // 20
        System.out.println(stack.size());  // 2
    }
}
