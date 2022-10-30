package LinkedList;

public class SinglyLinkedList <E> {
    private static class Node<E> {
        private E element; // reference to the element stored at this node
        private Node<E> next; // reference to the subsequent node in the list
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> n) {
            next = n;
        }
    }
    private Node<E> head = null; // head node of the list (or null if empty)
    private Node<E> tail = null; // last node of the list (or null if empty)
    private int size = 0; // number of nodes in the list

    // access methods
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { // returns but does not remove the first element
        if (isEmpty())
            return null;
        else
            return head.getElement();
    }

    public E last() { // returns but does not remove the last element
        if (isEmpty())
            return null;
        else
            return tail.getElement();
    }

    // insert methods
    public void addFirst(E e) { // adds element e to the front of the list
        head = new Node<>(e, head); // create and link a new node
        if (size == 0)
            tail = head; // special case: new node becomes tail also
        size++;
    }
    public void addLast(E e) { // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null); // node will eventually be the tail
        if (isEmpty())
            head = newest; // special case: previously empty list
        else
            tail.setNext(newest); // new node after existing tail
        tail = newest; // new node becomes the tail
        size++;
    }
    public E removeFirst() { // removes and returns the first element
        if (isEmpty()) return null; // nothing to remove
        E answer = head.getElement();
        head = head.getNext(); // will become null if list had only one node
        size--;
        if (size == 0)
            tail = null; // special case as list is now empty
        return answer;
    }

    //print and search methods
    public void printElements()
    {
        Node current = head;
        while(current != null){
            System.out.print(current.element + "-->" );
            current = current.next;
        }  System.out.println("***");
    }
    public void searchElement(E element)
    {
        Node current = head;
        int counter=0;
        while(current != null){
            counter++;
            if(element == current.element)
                System.out.println("We found element " + element +
                        " at " + counter + ". LinkedList.Node");
            current = current.next;
        }  System.out.println("***");
    }

}
