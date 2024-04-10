package com.softtek.modelo.Ej2;

public class Calculadora {
        public static double sumar(double num1, double num2) {
            return num1 + num2;
        }

        public static double restar(double num1, double num2) {
            return num1 - num2;
        }

        public static double multiplicar(double num1, double num2) {
            return num1 * num2;
        }

        public static double dividir(double num1, double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("No puedes dividir entre 0");
            }
            return num1 / num2;
        }
}
