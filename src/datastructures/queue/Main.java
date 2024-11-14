package datastructures.queue;

public class Main {

    public static void main(String[] args) {

//        Queue myQueue = new Queue(4);
//
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        System.out.println("\nQueue:");
//        myQueue.printQueue();
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            First: 4
//            Last: 4
//            Length: 1
//
//            Queue:
//            4
//
//        */

//        Queue myQueue = new Queue(2);
//
//        System.out.println("Before enqueue():");
//        System.out.println("--------------");
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        System.out.println("\nQueue:");
//        myQueue.printQueue();
//
//        myQueue.enqueue(1);
//
//        System.out.println("\n\nAfter enqueue():");
//        System.out.println("-------------");
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();
//
//        System.out.println("\nQueue:");
//        myQueue.printQueue();
//
//        /*
//            EXPECTED OUTPUT:
//
//            Before enqueue():
//            --------------
//            First: 2
//            Last: 2
//            Length: 1
//
//            Queue:
//            2
//
//
//            After enqueue():
//            -------------
//            First: 2
//            Last: 1
//            Length: 2
//
//            Queue:
//            2
//            1
//
//        */

        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());


        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null

        */

    }
}
