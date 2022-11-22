package Stack;
import java.util.Stack;
public class ArrayStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stackArr = new ArrayStack<>();
        stackArr.push(5);
        stackArr.push(10);
        System.out.println(stackArr.size());
        System.out.println(stackArr.pop());

        Stack<Integer> stack=new Stack<>();

        stack.push(10);

        stack.push(20);

        System.out.println(stack.empty());//return false

        stack.pop(); //20 -->





    }
}
