/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author andre
 */
public class ClassNodo {
    
}

class Nodo <T>{
    Nodo<T> siguiente = null;
    T valor;    
    public Nodo (T v) {
        valor = v ;
    }
    
}