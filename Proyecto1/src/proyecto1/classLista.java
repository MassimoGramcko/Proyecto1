/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author andre
 */
public class classLista {
    
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