package LinkedList;

//Simple Linked list example with tail
public class LinkedList2 {
    //Represent a node of the singly linked list
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    public int size;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);
        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else { //It means add last
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
        size++;
    }

    //addAtStart() will add a new node to the beginning of the list
    public void addAtStart(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //Node temp will point to head
            Node temp = head;
            //newNode will become new head of the list
            head = newNode;
            //Node temp(previous head) will be added after new head
            head.next = temp;
        }
    }

    //addAtEnd() will add a new node to the end of the list
    public void addAtEnd(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    //display() will display all the nodes present in the list
    public void printList() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        //Add nodes to the list
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        //Displays the nodes present in the list
        list.printList();
    }

    //deleteFromStart() will delete a node from the beginning of the list
    public void deleteFromStart() {

        //Checks if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            //Checks whether the list contains only one node
            //If not, the head will point to next node in the list and tail will point to the new head.
            if (head != tail) {
                head = head.next;
            }
            //If the list contains only one node
            //then, it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
            size--;
        }
    }

    //deleteFromMid() will delete a node from the middle of the list
    void deleteFromMid() {
        Node temp, current;
        //Checks if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            //Store the mid-position of the list
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            //Checks whether the head is equal to the tail or not, if yes then the list has only one node.
            if (head != tail) {
                //Initially, temp will point to head
                temp = head;
                current = null;
            //Current will point to node previous to temp
                //If temp is pointing to node 2 then current will point to node 1.
                for (int i = 0; i < count - 1; i++) {
                    current = temp;
                    temp = temp.next;
                }
                if (current != null) {
                    //temp is the middle that needs to be removed.
                    //So, current node will point to node next to temp by skipping temp.
                    current.next = temp.next;
            //Delete temp
                    temp = null;
                }
                //If current points to NULL then, head and tail will point to node next to temp.
                else {
                    head = tail = temp.next;
            //Delete temp
                    temp = null;
                }

            }
            //If the list contains only one element
            //then it will remove it and both head and tail will point to NULL
            else {
                head = tail = null;
            }
            size--;
        }

    }

    //deleteFromEnd() will delete a node from end of the list
    public void deleteFromEnd() {

        //Checks if the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks whether the list contains only one element
            if(head != tail ) {
                Node current = head;
                //Loop through the list till the second last element such that current.next is pointing to tail
                while(current.next != tail) {
                    current = current.next;
                }
                //Second last element will become new tail of the list
                tail = current;
                tail.next = null;
            }
            //If the list contains only one element
            //Then it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
            size--;
        }
    }

    //minNode() will find out the minimum value node in the list
    public void minNode() {
        Node current = head;
        int min;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Initializing min with head node data
            min = head.value;

            while(current != null){
                //If current node's data is smaller than min
                //Then, replace value of min with current node's data
                if(min > current.value) {
                    min = current.value;
                }
                current= current.next;
            }
            System.out.println("Minimum value node in the list: "+ min);
        }
    }
    //maxNode() will find out the maximum value node in the list
    public void maxNode() {
        Node current = head;
        int max;

        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            //Initializing max with head node data
            max = head.value;

            while(current != null){
                //If current node's data is greater than max
                //Then, replace value of max with current node's data
                if(max < current.value) {
                    max = current.value;
                }
                current = current.next;
            }
            System.out.println("Maximum value node in the list: "+ max);
        }
    }

    //This function will add the new node at the middle of the list.
    public void addInMid(int data){
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail would point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            Node temp, current;
            //Store the mid position of the list
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            //Node temp will point to head
            temp = head;
            current = null;

            //Traverse through the list till the middle of the list is reached
            for(int i = 0; i < count; i++) {
                //Node current will point to temp
                current = temp;
                //Node temp will point to node next to it.
                temp = temp.next;
            }

            //current will point to new node
            current.next = newNode;
            //new node will point to temp
            newNode.next = temp;
        }
        size++;
    }

    //removeDuplicate() will remove duplicate nodes from the list
    public void removeDuplicate() {
        //Node current will point to head
        Node current = head, index = null, temp = null;

        if(head == null) {
            return;
        }
        else {
            while(current != null){
                //Node temp will point to previous node to index.
                temp = current;
                //Index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is equal to index node's data
                    if(current.value == index.value) {
                        //Here, index node is pointing to the node which is duplicate of current node
                        //Skips the duplicate node by pointing to next node
                        temp.next = index.next;
                    }
                    else {
                        //Temp will point to previous node of index.
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //searchNode() will search for a given node in the list
    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                //Compares node to be found with each node present in the list
                if(current.value == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if(flag)
            System.out.println("Element is present in the list at the position : " + i);
        else
            System.out.println("Element is not present in the list");
    }


}
