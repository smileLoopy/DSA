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

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");


        System.out.println("\nGraph before addEdge():");
        myGraph.printGraph();


        myGraph.addEdge("A", "B");


        System.out.println("\nGraph after addEdge():");
        myGraph.printGraph();


        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before addEdge():
            {A=[], B=[]}

            Graph after addEdge():
            {A=[B], B=[A]}

        */

    }
}
