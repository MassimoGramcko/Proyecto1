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
    private Boolean sucursal;
    private int indice;

    public NodoGrafo(Lista<NodoGrafo> vecinos, String nombreEstacion, String nombreDeLinea, int indice) {
        this.vecinos = vecinos;
        this.nombreEstacion = nombreEstacion;
        this.nombreDeLinea = nombreDeLinea;
        this.sucursal = false;
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
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

    public Boolean getSucursal() {
        return sucursal;
    }

    public void setSucursal(Boolean sucursal) {
        this.sucursal = sucursal;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
}
