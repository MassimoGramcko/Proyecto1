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
    private Nodo<T> inicio = null; 
    private Nodo<T> cola = null;

    public Lista() {
        this.inicio = null;
        this.cola = null;
    }

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getCola() {
        return cola;
    }

    public void setCola(Nodo<T> cola) {
        this.cola = cola;
    }
    
    
    
       public void Agregar (T v){
        if (this.inicio== null){
            this.inicio= new Nodo<T>(v);
            this.inicio.setSiguiente(this.cola);
            this.cola = this.inicio;
            return;
                
                    
        }
        this.cola.setSiguiente(new Nodo<T>(v));
        this.cola= this.cola.getSiguiente();
    }
    
}