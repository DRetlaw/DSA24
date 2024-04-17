package ds.recursion.random;

public class Tree {

    Node root;
    private int size;
    private int height;
    private int min;
    private int max;
    private int sum;
    private int count;
    private int level;

    public Tree() {

    }

    public Tree(Node root) {
        this.root = root;
    }


    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        System.out.println("done");
        Tree tree = new Tree();
        tree.insert(100);
        tree.insert(3);
        tree.insert(103);
        tree.insert(77);
        tree.insert(50);
        tree.insert(133);
        tree.insert(190);
        tree.inOrder(tree.root);
        System.out.println();
        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    private boolean insert(int value) {
        if (root == null) {
            root = new Node(value);
            return true;
        }
        return insert(root, value);
    }

    private boolean insert(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.data) {
            return false;
        }
        if (value < node.data) {
            if (node.left == null) {
                node.left = new Node(value);
                return true;
            }
            return insert(node.left, value);
        } else {
            if (node.right == null) {
                node.right = new Node(value);
                return true;
            }
            return insert(node.right, value);
        }
    }
    
}
