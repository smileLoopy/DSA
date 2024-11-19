package datastructures.treetraversal;

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
//        System.out.println("Breadth First Search:");
//        System.out.println( myBST.BFS() );
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Breadth First Search:
//            [47, 21, 76, 18, 27, 52, 82]
//
//        */

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
//        System.out.println("DFS PreOrder:");
//        System.out.println( myBST.DFSPreOrder() );
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            DFS PreOrder:
//            [47, 21, 18, 27, 76, 52, 82]
//
//        */

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
//        System.out.println("DFS PostOrder:");
//        System.out.println( myBST.DFSPostOrder() );
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            DFS PostOrder:
//            [18, 27, 21, 52, 82, 76, 47]
//
//        */


        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("DFS InOrder:");
        System.out.println( myBST.DFSInOrder() );

        /*
            EXPECTED OUTPUT:
            ----------------
            DFS InOrder:
            [18, 21, 27, 47, 52, 76, 82]

        */
    }
}
