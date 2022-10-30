package LinkedList;

public class LinkedListSimple <E> {
    Node<E> head; // head of list
    public static void main(String[] args) {
        LinkedListSimple<Integer> linkedList= new LinkedListSimple<>();
        //create nodes
        linkedList.head= new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        //Combine nodes
        linkedList.head.next = secondNode; // Link first node with the second node
        secondNode.next = thirdNode; // Link second node with the third node
        linkedList.printList();
    }
    public void printList(){
        Node currentNode=head;
        while (currentNode != null) {
            System.out.print(currentNode.element + " -> ");
            currentNode = currentNode.next;
        }
    }
}
