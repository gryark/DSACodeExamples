package Stack;

public interface MyStack <E> {
    int size(); //return number of elements in the stack

    boolean isEmpty();//return true if the stack is empty, false otherwise

    void push(E e); //return top element in the stack (or null if empty)

    E top(); //return top element in the stack (or null if empty)

    E pop(); //return element removed (or null if empty)
}
