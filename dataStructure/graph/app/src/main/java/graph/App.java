/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex vertex = new Vertex(1);
        Vertex outputAdd = graph.addNode(vertex);
        System.out.println(outputAdd);

    }
}
