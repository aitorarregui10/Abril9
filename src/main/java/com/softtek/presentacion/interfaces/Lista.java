package com.softtek.presentacion.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Lista {
    public static void main(String[] args) {
        Supplier<List<String>> Frutas = () -> {
            List<String> lista = new ArrayList<>();
            lista.add("manzana");
            lista.add("platano");
            lista.add("naranja");
            return lista;
        };
        List<String> ListaFruta = Frutas.get();
        System.out.println(ListaFruta);
    }
}
