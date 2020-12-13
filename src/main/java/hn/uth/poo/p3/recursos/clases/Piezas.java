/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.poo.p3.recursos.clases;

/**
 *
 * @author ORLANDO
 */
public class Piezas {
    private int Codigo;
    private String Nombre ,Existencia;
    private double Precio;

    public Piezas() {
    }

    public Piezas(int Codigo, String Nombre, double Precio, String Existencia) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Existencia = Existencia;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getExistencia() {
        return Existencia;
    }

    public void setExistencia(String Existencia) {
        this.Existencia = Existencia;
    }
    
    
    
}
