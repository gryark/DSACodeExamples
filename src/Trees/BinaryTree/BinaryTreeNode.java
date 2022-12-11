package Trees.BinaryTree;

class Node {
    Node left;
    int data;
    Node right;
    Node(int value) {
        this.data = value;
        right = null;
        left = null;
    }
}
public class BinaryTreeNode {
    Node root;

    //add value to binary tree
    public void add(int value) {
        root = addRecursive(root, value);
    }
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.data) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = addRecursive(current.right, value);
        } else {
            // same value
            return current;
        }
        return current;
    }

    //find value
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.data) {
            return true;
        }
        return value < current.data
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }


    //delete a node
    /*Once we find the node to delete, there are 3 main different cases:

    a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
    a node has exactly one child – in the parent node, we replace this node with its only child.
    a node has two children – this is the most complex case because it requires a tree reorganization*/

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.data) {
            // Node to delete found
            // ... code to delete the node will go here


        }
        if (value < current.data) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }
}

//test class
class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTreeNode bt = new BinaryTreeNode();
        bt.add(16);
        bt.add(14);
        bt.add(18);
        bt.add(13);
        bt.add(15);
        bt.add(17);
        bt.add(19);
    }
}