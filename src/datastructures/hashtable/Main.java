package datastructures.hashtable;

public class Main {

    public static void main(String[] args) {

//        HashTable myHashTable = new HashTable();
//
//        myHashTable.printTable();
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            0:
//            1:
//            2:
//            3:
//            4:
//            5:
//            6:
//
//    	*/
//
//        HashTable myHashTable = new HashTable();
//
//        // HASH METHOD MUST BE SET TO PUBLIC FOR THESE LINES TO WORK
//        System.out.println( myHashTable.hash("paint") );
//        System.out.println( myHashTable.hash("bolts") );
//        System.out.println( myHashTable.hash("nails") );
//        System.out.println( myHashTable.hash("stuff") );
//        System.out.println( myHashTable.hash("lumber") );
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            2
//            4
//            6
//            5
//            6
//
//        */

//        HashTable myHashTable = new HashTable();
//
//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);
//        myHashTable.set("bolts", 200);
//        myHashTable.set("screws", 140);
//
//        myHashTable.printTable();
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            0:
//            1:
//            2:
//            3:
//               {screws= 140}
//            4:
//               {bolts= 200}
//            5:
//            6:
//               {nails= 100}
//               {tile= 50}
//               {lumber= 80}
//
//        */

        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( myHashTable.get("bolts") );

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */

    }
}
