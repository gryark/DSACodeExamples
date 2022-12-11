package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
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
   Node root;
    public static void main(String[] args) {

    }

    //Breadth First Search
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.print(" " + node.data);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
}
