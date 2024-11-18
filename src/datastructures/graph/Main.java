package datastructures.graph;

public class Main {

    public static void main(String[] args) {

//        Graph myGraph = new Graph();
//
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//
//        System.out.println("\nGraph:");
//        myGraph.printGraph();
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Graph:
//            {A=[], B=[]}
//
//        */

//        Graph myGraph = new Graph();
//
//        myGraph.addVertex("A");
//        myGraph.addVertex("B");
//
//
//        System.out.println("\nGraph before addEdge():");
//        myGraph.printGraph();
//
//
//        myGraph.addEdge("A", "B");
//
//
//        System.out.println("\nGraph after addEdge():");
//        myGraph.printGraph();
//
//
//        /*
//            EXPECTED OUTPUT:
//            ----------------
//            Graph before addEdge():
//            {A=[], B=[]}
//
//            Graph after addEdge():
//            {A=[B], B=[A]}
//
//        */

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");


        System.out.println("\nGraph before removeEdge():");
        myGraph.printGraph();

        myGraph.removeEdge("A", "B");

        System.out.println("\nGraph after removeEdge():");
        myGraph.printGraph();

        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before removeEdge():
            {A=[B, C], B=[A, C], C=[A, B]}

            Graph after removeEdge():
            {A=[C], B=[C], C=[A, B]}

        */

    }
}
