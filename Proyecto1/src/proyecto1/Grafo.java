/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Grafo {
    
        public boolean esNulo = true;
        private static Grafo instancia = null;

        public static Grafo ObtenerInstancia() {
            if (instancia == null) {
                instancia = new Grafo();
            }
            return instancia;
        }

        Lista<NodoGrafo> nodos;
        int T;

        public int getT() {
            return T;
        }
        String nombreSistemaDeTransporte;
        
}
