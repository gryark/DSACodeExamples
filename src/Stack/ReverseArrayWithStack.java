package Stack;
import java.util.Arrays;
public class ReverseArrayWithStack {
    public static <E> void reverse(E[] a) {
        MyStack<E> stackArr = new ArrayStack<>(a.length);
        for (int i = 0; i < a.length; i++)
            stackArr.push(a[i]);
        for (int i = 0; i < a.length; i++)
            a[i] = stackArr.pop();
    }
    /**
     * Tester routine for reversing arrays
     */
    public static void main(String args[]) {
        Integer[] a = {4, 8, 15, 16, 23, 42}; // autoboxing allows this
        String[] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("s = " + Arrays.toString(s));
    }
}
