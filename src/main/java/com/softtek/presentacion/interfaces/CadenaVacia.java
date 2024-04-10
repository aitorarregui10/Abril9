package com.softtek.presentacion.interfaces;

import java.util.function.Supplier;

public class CadenaVacia {

    public static void main(String[] args) {
        Supplier<String>  fx = () -> "";
        String cadenaLlena ="Hola mundo";

        if (cadenaLlena == "") {
            System.out.println(fx.get());
        } else {
            System.out.println(fx.get());
        }
    }
}
