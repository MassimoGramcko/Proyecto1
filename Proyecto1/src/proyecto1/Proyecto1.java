/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;
      
/**
 *
 * @author massi
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Nodo <T>{
    Nodo<T> siguiente = null;
    T valor;    
    public Nodo (T v) {
        valor = v ;
    }
    
}

class Lista <T> {
    Nodo<T> inicio = null; 
    Nodo<T> cola = null;
    
    public void Agregar (T v){
        if (this.inicio== null){
            this.inicio= new Nodo<T>(v);
            this.inicio.siguiente= this.cola;
            this.cola = this.inicio;
            return;
                
                    
        }
        this.cola.siguiente= new Nodo<T>(v);
        this.cola= this.cola.siguiente;
    }
    
}

class NodoGrafo {
    Lista <NodoGrafo> vecinos; 
    String nombreEstacion; 
    String nombreDeLinea;
    
    public NodoGrafo(Lista<NodoGrafo> vecino, String nombreEstacion, String nombreDeLinea){
        this.vecinos = vecinos;
        this.nombreEstacion = nombreEstacion;
        this.nombreDeLinea = nombreDeLinea;
              
    }
}

 class Grafo {
     public boolean esNulo = true;
     //Singleton
     private static Grafo instancia = null;
     
     public static Grafo ObtenerInstancia() {
         if (instancia==null){
             instancia= new Grafo();
             
         }
         return instancia; 
     }
     Lista<NodoGrafo> nodos; 
     int T;
     String nombreSistemaDeTransporte;
 }

