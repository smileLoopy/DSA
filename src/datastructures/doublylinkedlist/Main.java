package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {

//        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//
//        System.out.println("\nDoubly Linked List:");
//        myDLL.printList();
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Head: 7
//            Tail: 7
//            Length: 1
//
//            Doubly Linked List:
//            7
//
//        */

//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//
//        System.out.println("\nDoubly Linked List:");
//        myDLL.printList();
//
//        /*
//       		EXPECTED OUTPUT:
//        	----------------
//        	Head: 1
//        	Tail: 2
//        	Length: 2
//
//        	Doubly Linked List:
//        	1
//        	2
//
//     	*/

//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(3);
//
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//
//        System.out.println("\nDoubly Linked List:");
//        myDLL.printList();
//
//        myDLL.prepend(1);
//
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//
//        System.out.println("\nDoubly Linked List:");
//        myDLL.printList();
//
//        /*
//            EXPECTED OUTPUT:
//
//            Before prepend():
//            -----------------
//            Head: 2
//            Tail: 3
//            Length: 2
//
//            Doubly Linked List:
//            2
//            3
//
//
//            After prepend():
//            ----------------
//            Head: 1
//            Tail: 3
//            Length: 3
//
//            Doubly Linked List:
//            1
//            2
//            3
//
//        */

//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(1);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myDLL.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myDLL.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myDLL.removeFirst());
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            2
//            1
//            null
//
//        */

        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);


        System.out.println(myDLL.get(3).value);


        /*
            EXPECTED OUTPUT:
            ----------------
            3

        */

    }
}
