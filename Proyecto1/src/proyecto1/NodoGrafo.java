/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author massi
 */
public class NodoGrafo {
   
            private Lista<NodoGrafo> vecinos;
            private String nombreEstacion;
            private String nombreDeLinea;

            public NodoGrafo(Lista<NodoGrafo> vecinos, String nombreEstacion, String nombreDeLinea) {
                this.vecinos = vecinos;
                this.nombreEstacion = nombreEstacion;
                this.nombreDeLinea = nombreDeLinea;
            }

            public Lista<NodoGrafo> getVecinos() {
                return vecinos;
            }

            public void setVecinos(Lista<NodoGrafo> vecinos) {
                this.vecinos = vecinos;
            }

            public String getNombreEstacion() {
                return nombreEstacion;
            }

            public void setNombreEstacion(String nombreEstacion) {
                this.nombreEstacion = nombreEstacion;
            }

            public String getNombreDeLinea() {
                return nombreDeLinea;
            }

            public void setNombreDeLinea(String nombreDeLinea) {
                this.nombreDeLinea = nombreDeLinea;
            }
}

