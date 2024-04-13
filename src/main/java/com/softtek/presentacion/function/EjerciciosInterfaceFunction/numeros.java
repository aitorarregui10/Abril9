package com.softtek.presentacion.function.EjerciciosInterfaceFunction;

public enum numeros {
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5);

    private final int value;

    numeros(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}