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
public class Nodo<T>{
    private Nodo<T> next = null;
    private T valor;
    
    public Nodo(T v) {
        valor = v;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}