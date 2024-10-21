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


public class NodeGraph {
    int vertex; 
    List<NodeGraph> neighbors;
    public NodeGraph(int vertex) {
        this.vertex = vertex;
        this.neighbors = new ArrayList<>();
    }
    public void addNeighbor(NodeGraph neighbor) {
        neighbors.add(neighbor);
    }
    public int getVertex() {
        return vertex;
    }
    public List<NodeGraph> getNeighbors() {
        return neighbors;
    }
}
