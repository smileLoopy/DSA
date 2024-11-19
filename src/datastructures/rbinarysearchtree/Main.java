package datastructures.rbinarysearchtree;

public class Main {

    public static void main(String[] args) {

//        BinarySearchTree myBST = new BinarySearchTree();
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);
//
//
//        System.out.println("BST Contains 27:");
//        System.out.println(myBST.rContains(27));
//
//        System.out.println("\nBST Contains 17:");
//        System.out.println(myBST.rContains(17));
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            BST Contains 27:
//            true
//
//            BST Contains 17:
//            false
//
//        */

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */



        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */

    }
}
