package laab7.pkg8;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {

    Node root;

    public class Node {

        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }

   
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
         root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
     public void insert(int value) {
        root = insertRec(root, value);
    }


    public int countNodes() {
        return countNodesRec(root);
    }

    private int countNodesRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodesRec(node.left) + countNodesRec(node.right);
    }

    // Inorder Traversal
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Preorder Traversal
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    // Postorder Traversal
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
        }
    }

    // Level-order Traversal
    public void levelOrder() {
        if (root == null) return;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.value + " ");

            if (tempNode.left != null) queue.add(tempNode.left);
            if (tempNode.right != null) queue.add(tempNode.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the tree:");
        tree.inorder();

        System.out.println("Pre-order traversal of the tree:");
        tree.preorder();

        System.out.println("Post-order traversal of the tree:");
        tree.postorder();

        System.out.println("Level-order traversal of the tree:");
        tree.levelOrder();

        System.out.println("Total number of nodes in the tree: " + tree.countNodes());
    }
}
