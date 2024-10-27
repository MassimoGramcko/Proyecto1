/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author Maassimo Gramcko
 * @author Alessandro Gramcko
 * @author Andrea Pareles
 * @author Diego Tamayo
 * 
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo.ObtenerInstancia().nodos = new Lista<NodoGrafo>();
        Grafo.ObtenerInstancia().esNulo = true;
        Grafo.ObtenerInstancia().nombreSistemaDeTransporte = "";
    }
}