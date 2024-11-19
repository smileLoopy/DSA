package datastructures.heaps;

public class Main {

    public static void main(String[] args) {

//        Heap myHeap = new Heap();
//        myHeap.insert(99);
//        myHeap.insert(72);
//        myHeap.insert(61);
//        myHeap.insert(58);
//
//        System.out.println(myHeap.getHeap());
//
//
//        myHeap.insert(100);
//
//        System.out.println(myHeap.getHeap());
//
//
//        myHeap.insert(75);
//
//        System.out.println(myHeap.getHeap());
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            [99, 72, 61, 58]
//            [100, 99, 61, 58, 72]
//            [100, 99, 75, 58, 72, 61]
//
//        */

//        Heap myHeap = new Heap();
//        myHeap.insert(95);
//        myHeap.insert(75);
//        myHeap.insert(80);
//        myHeap.insert(55);
//        myHeap.insert(60);
//        myHeap.insert(50);
//        myHeap.insert(65);
//
//        System.out.println(myHeap.getHeap());
//
//
//        myHeap.remove();
//
//        System.out.println(myHeap.getHeap());
//
//
//        myHeap.remove();
//
//        System.out.println(myHeap.getHeap());
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            [95, 75, 80, 55, 60, 50, 65]
//            [80, 75, 65, 55, 60, 50]
//            [75, 60, 65, 55, 50]
//
//        */

//        MinHeap myHeap = new MinHeap();
//        myHeap.insert(99);
//        myHeap.insert(72);
//        myHeap.insert(61);
//        myHeap.insert(58);
//
//        System.out.println(myHeap.getHeap());
//
//        myHeap.insert(10);
//
//        System.out.println(myHeap.getHeap());
//
//        myHeap.insert(75);
//
//        System.out.println(myHeap.getHeap());
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            [58, 61, 72, 99]
//            [10, 58, 72, 99, 61]
//            [10, 58, 72, 99, 61, 75]
//        */

        MinHeap myHeap = new MinHeap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        myHeap.insert(10);
        myHeap.insert(75);

        System.out.println(myHeap.getHeap());

        Integer removedValue1 = myHeap.remove();

        System.out.println("First Removed Value: " + removedValue1);
        System.out.println(myHeap.getHeap());

        Integer removedValue2 = myHeap.remove();

        System.out.println("Second Removed Value: " + removedValue2);
        System.out.println(myHeap.getHeap());

        /*
            EXPECTED OUTPUT:
            ----------------
            [10, 58, 72, 99, 61, 75]
            First Removed Value: 10
            [58, 61, 72, 99, 75]
            Second Removed Value: 58
            [61, 75, 72, 99]
        */

    }
}
