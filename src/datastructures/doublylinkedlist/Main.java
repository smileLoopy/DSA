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

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Doubly Linked List:
        	1
        	2

     	*/
    }
}
