package datastructures.rbinarysearchtree;

public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
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

    private boolean rContains(Node currentNode, int value) {
        // If node is null, return false
        if (currentNode == null) return false;

        // If current node's value equals search value, return true
        if (currentNode.value == value) return true;

        // If search value is less than node's value,
        // search in the left subtree
        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            // If search value is more than node's value,
            // search in the right subtree
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value) { return rContains(root, value); }


    private Node rInsert(Node currentNode, int value) {
        // If the node is null, create a new node with the value
        if (currentNode == null) return new Node(value);

        // If the value is less than current node's value,
        // try to insert it in the left subtree
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        }
        // If the value is greater than current node's value,
        // try to insert it in the right subtree
        else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        // Return the current node after insertion
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    public int minValue(Node currentNode) {
        // Traverse left subtree until null is encountered
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        // Return the value of the leftmost node
        return currentNode.value;
    }
}
