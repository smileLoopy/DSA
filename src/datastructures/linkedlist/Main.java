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

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.makeEmpty();
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
//
//        /*
//       		EXPECTED OUTPUT:
//        	----------------
//        	Head: 1
//        	Tail: 2
//        	Length: 2
//
//        	Linked List:
//        	1
//        	2
//
//     	*/

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeLast());
//
//
//    	/*
//        	EXPECTED OUTPUT:
//        	----------------
//        	2
//        	1
//        	null
//
//     	*/

//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
//
//        myLinkedList.prepend(1);
//
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        System.out.println("\nLinked List:");
//        myLinkedList.printList();
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
//            Linked List:
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
//            Linked List:
//            1
//            2
//            3
//
//        */

//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(1);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myLinkedList.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myLinkedList.removeFirst());
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

//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//
//        System.out.println(myLinkedList.get(3).value);
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            3
//
//        */

//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//
//        System.out.println("Linked List before set():");
//        myLinkedList.printList();
//
//        myLinkedList.set(2, 99);
//
//        System.out.println("\nLinked List after set():");
//        myLinkedList.printList();
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Linked List before set():
//            0
//            1
//            2
//            3
//
//            Linked List after set():
//            0
//            1
//            99
//            3
//
//        */

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(3);

        System.out.println("LL before insert():");
        myLinkedList.printList();

        myLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in middle:");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4

        */

    }
}
