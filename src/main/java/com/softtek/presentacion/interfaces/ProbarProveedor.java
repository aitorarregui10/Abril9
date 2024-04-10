package com.softtek.presentacion.interfaces;


import java.util.function.Supplier;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class ProbarProveedor {

    private void NumAleatorio (){
        Supplier<Integer> fx = () -> new Random().nextInt(10);
        System.out.println(fx.get());
    }


    public static void main(String[] args) {

        ProbarProveedor p1 = new ProbarProveedor();
        p1.NumAleatorio();
    }
}
