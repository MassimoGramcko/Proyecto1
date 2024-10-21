/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Djinn
 */

class Graph {
    public boolean esNulo = true;
    
    // Singleton
    private static Graph instancia = null;
    
    public static Graph ObtenerInstancia() {
        if (instancia == null) {
            instancia = new Graph();
        }
        return instancia;
    }
    
    Lista<NodoGrafo> nodos;
    int T;
    String nombreSistemaDeTransporte;
}