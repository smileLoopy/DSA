package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Head: 4
//            Tail: 4
//            Length: 1
//
//            Linked List:
//            4
//
//        */

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2

        	Linked List:
        	1
        	2

     	*/

    }
}
