package LinkedList;

public class Node<T> {
    T element;
    Node<T> next;
    Node(T element){ //Constructor
        this.element=element;
        next=null;
    }
}
