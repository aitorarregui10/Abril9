package com.softtek.presentacion.interfaces;

import java.util.function.Supplier;
import java.time.LocalDateTime;

public class FechaHoraActual {
    public static void main(String[] args) {
        Supplier<LocalDateTime> fx = () -> LocalDateTime.now();
        System.out.println("La fecha y hora actual es: " + fx.get());
    }
}
