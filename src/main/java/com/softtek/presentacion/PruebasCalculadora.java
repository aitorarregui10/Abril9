package com.softtek.presentacion;

import java.util.Scanner;
import com.softtek.modelo.Ej2.Calculadora;

public class PruebasCalculadora {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un primer número...");
            double num1 = scanner.nextInt();

            System.out.print("Introduce un segundo número...");
            double num2 = scanner.nextDouble();

            Calculadora calc = new Calculadora();

            System.out.println("Tu suma da: " + calc.sumar(num1, num2));
            System.out.println("Tu resta da: " + calc.restar(num1, num2));
            System.out.println("Tu multiplicación da: " + calc.multiplicar(num1, num2));
            System.out.println("Tu división da: " + calc.dividir(num1, num2));
        }
}
