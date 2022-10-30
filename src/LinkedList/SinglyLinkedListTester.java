package LinkedList;

public class SinglyLinkedListTester {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll=new SinglyLinkedList<>();
        System.out.println(sll.getSize());
        sll.addFirst(10);
        sll.addLast(20);
        sll.addLast(30);
        System.out.println(sll.getSize());
        sll.printElements();
        sll.searchElement(30);
    }

}
