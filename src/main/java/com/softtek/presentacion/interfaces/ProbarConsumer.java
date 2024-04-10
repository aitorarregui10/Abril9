package com.softtek.presentacion.interfaces;

import java.util.function.Consumer;
import com.softtek.modelo.Producto;
import javax.swing.JOptionPane;

public class ProbarConsumer {

        private void imprMayus () {
            Consumer<String> imprMayus = x -> System.out.println(x.toUpperCase());
            imprMayus.accept("Holi");
        }

            private void imprNum () {
            Consumer<Integer> imprNumCuadr = x -> {
                int y = x*x;
                System.out.println("El cuadrado del número entero " + x + " es " + y);

            };
            imprNumCuadr.accept(5);
        }

    public static class ImpProducto implements Consumer<Producto> {
        @Override
        public void accept(Producto producto) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
        }
    }

    public static void main(String[] args) {
        ProbarConsumer p1 = new ProbarConsumer();
        ProbarConsumer p2 = new ProbarConsumer();
        ProbarConsumer p3 = new ProbarConsumer();

            Producto producto = new Producto("Pc", 1000.0);
            ImpProducto impProducto = new ImpProducto();
            impProducto.accept(producto);

        p1.imprMayus();
        p2.imprNum();
        //p3.cuaDialog;

    }
}
