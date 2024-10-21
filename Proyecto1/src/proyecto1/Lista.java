/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author massi
 */


public class Lista<T> {
    
            private Nodo<T> head = null;
            private Nodo<T> tail = null;

            public Lista() {
                this.head = null;
                this.tail = null;
            }

            public Nodo<T> getHead() {
                return head;
            }

            public void setHead(Nodo<T> Head) {
                this.head = Head;
            }

            public Nodo<T> getTail() {
                return tail;
            }

            public void setTail(Nodo<T> Tail) {
                this.tail = Tail;
            }


            public void Agregar(T v) {
                if (this.head == null) {
                    this.head = new Nodo<T>(v);
                    this.head.setNext(this.tail);
                    this.tail = this.head;
                    return;
                }

                this.tail.setNext(new Nodo<T>(v));
                this.tail = this.tail.getNext();
            }

}
