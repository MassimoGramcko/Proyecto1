/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Djinn
 */

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<NodeGraph> nodes; 

    public Graph(int vertices) {
        nodes = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            nodes.add(new NodeGraph(i)); 
        }
    }
    public void addEdge(int source, int destination) {
        NodeGraph sourceNode = nodes.get(source);
        NodeGraph destinationNode = nodes.get(destination);
        sourceNode.addNeighbor(destinationNode);
        destinationNode.addNeighbor(sourceNode); 
    }
    public void display() {
        for (NodeGraph node : nodes) {
            System.out.print(node.getVertex() + ": ");
            for (NodeGraph neighbor : node.getNeighbors()) {
                System.out.print(neighbor.getVertex() + " ");
            }
            System.out.println();
        }
    }
}
