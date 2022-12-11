package Trees.BinaryTree;

class TreeBinary {
    public TreeBinary left;
    public int data;
    public TreeBinary right;
}

public class BinaryTreeSimple {
    // create a Binary Node
    TreeBinary createBinaryNode(int data){
        TreeBinary node = new TreeBinary();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }
}

class BinaryTreesimpleTest{

    public static void main(String[] args) {
        BinaryTreeSimple bt=new BinaryTreeSimple();
        TreeBinary root = null;
        root = bt.createBinaryNode(4);
        root.left = bt.createBinaryNode(6);
        root.right = bt.createBinaryNode(12);
        root.left.left = bt.createBinaryNode(45);
        root.right.left = bt.createBinaryNode(7);
        root.right.right = bt.createBinaryNode(1);
    }
}
