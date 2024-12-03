package javaapplication22;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    class Node {
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = insert(current.left, value);
        } else if (value > current.value) {
            current.right = insert(current.right, value);
        }
        return current;
    }

    public int countNodes() {
        return countNodes(root);
    }

   public int countNodes(Node current) {
        if (current == null) {
            return 0;
        }
        return 1 + countNodes(current.left) + countNodes(current.right);
    }

    public boolean search(int value) {
        return search(root, value);
    }

    private boolean search(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value ? search(current.left, value) : search(current.right, value);
    }

  
    public void inOrderTraversal() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.value + " ");
            inOrder(current.right);
        }
    }

  
    public void preOrderTraversal() {
        preOrderTraversal(root);
        System.out.println();
    }

    private void preOrderTraversal(Node current) {
        if (current != null) {
            System.out.print(current.value + " ");
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    public void postOrderTraversal() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.value + " ");
        }
    }

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }

    // Main method to test the BST
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insertion Test
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int value : values) {
            bst.insert(value);
            System.out.println("Inserted " + value + ", Total Nodes: " + bst.countNodes());
        }

        // Search Test
        int[] searchValues = {20, 60, 90};
        for (int value : searchValues) {
            System.out.println("Search " + value + ": " + (bst.search(value) ? "Found" : "Not Found"));
        }

        // Traversal Tests
        System.out.println("In-order Traversal:");
        bst.inOrderTraversal();

        System.out.println("Pre-order Traversal:");
        bst.preOrderTraversal();

        System.out.println("Post-order Traversal:");
        bst.postOrderTraversal();

        System.out.println("Level-order Traversal:");
        bst.levelOrderTraversal();
    }
}
