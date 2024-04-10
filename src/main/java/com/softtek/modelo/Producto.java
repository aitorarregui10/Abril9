package com.softtek.modelo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public final class Producto {

    //Atributos
//    private final int ID; //Atributo constante
    private String nombre;
    private double precio;
    public static int CONTADOR=1;

    public Producto() {

    }

    //Constructor

/*
    public Producto() {
        this.ID = ++CONTADOR;
    }
*/
    public double importe (int cantidad) {
        return cantidad*precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
