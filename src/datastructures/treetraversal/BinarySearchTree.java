package datastructures.treetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        // Initialize currentNode with the root of the tree
        Node currentNode = root;

        // Create a queue to store nodes for BFS traversal
        Queue<Node> queue = new LinkedList<>();

        // Initialize an ArrayList to store visited node values
        ArrayList<Integer> results = new ArrayList<>();

        // Add the root node to the queue
        queue.add(currentNode);

        // Main loop for BFS traversal, continues until the queue is empty
        while (queue.size() > 0) {
            // Remove the first node from the queue and set it as currentNode
            currentNode = queue.remove();

            // Add the value of currentNode to the results ArrayList
            results.add(currentNode.value);

            // If currentNode has a left child, add it to the queue
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            // If currentNode has a right child, add it to the queue
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        // Return the results ArrayList containing the values of visited nodes in BFS order
        return results;
    }

}
