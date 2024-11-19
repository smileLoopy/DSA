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

    private Node deleteNode(Node currentNode, int value) {
        // Base case, tree is empty
        if (currentNode == null) return null;

        // Recurse down the tree
        if (value < currentNode.value) {
            // If less, go left
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            // If more, go right
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            // Value is same as current's value, node to delete
            if (currentNode.left == null && currentNode.right == null) {
                // Node is a leaf node
                return null;
            } else if (currentNode.left == null) {
                // Node has only right child
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                // Node has only left child
                currentNode = currentNode.left;
            } else {
                // Node has two children
                int subTreeMin = minValue(currentNode.right);
                // Replace with min in right subtree
                currentNode.value = subTreeMin;
                // Delete the minimum in right subtree
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        // Return the modified tree
        return currentNode;
    }

    public void deleteNode(int value) { root = deleteNode(root, value); }
}
