package Stack;

public class ArrayStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stackArr = new ArrayStack<>();
        stackArr.push(5);
        stackArr.push(10);
        System.out.println(stackArr.size());
        System.out.println(stackArr.pop());
    }
}
