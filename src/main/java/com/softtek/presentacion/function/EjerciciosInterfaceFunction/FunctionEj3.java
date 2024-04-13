package com.softtek.presentacion.function.EjerciciosInterfaceFunction;
import java.util.function.Function;

public class FunctionEj3 {
    public static void main(String[] args) {
        // Aquí falta un caracter
        //String password = "1234567Aa";
        // Aquí falta una minúscula
        //String password = "1234567A@";
        // Aquí falta una Mayúscula
        //String password = "1234567a@";
        // Aquí faltan caracteres
        //String password = "1234Aa@";
        // Aquí falta un número
        //String password = "Adkjashfisahfa@";
        // Esta es la válida
        String password = "1234567Aa@";

        Function<String, Boolean> validatePassword = input -> {
            String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
            return input.matches(regex);
        };
        boolean esValida = validatePassword.apply(password);
        System.out.println("¿La contraseña es válida? " + esValida);
    }
}
