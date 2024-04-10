package com.softtek.presentacion.interfaces;


import java.util.function.Predicate;

public class ProbarPredicate {

    private void enteroPositivo(){
            Predicate<Integer> numeroPositivo = x -> x >= 0;
            boolean resultado = numeroPositivo.test(3);
            System.out.println(resultado);
    }
    private void textoEmpty(){
        Predicate<String> textoEmpty = x -> x != "";
        boolean resultado = textoEmpty.test("vacío");
        System.out.println(resultado);
    }
    private void enteroPar(){
        Predicate<Integer> numeroPar = x -> x % 2 == 0;
        boolean resultado = numeroPar.test(3);
        System.out.println(resultado);
    }
    private void mayorQue(){
        Predicate<Integer> mayor10 = x -> x > 10;
        boolean resultado = mayor10.test(3);
        System.out.println(resultado);
    }
    private void numeroPrimo() {
        Predicate<Integer> numeroPrimo = x -> {
            if (x <= 1) {
                return false;
            }
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        };
        boolean resultado = numeroPrimo.test(3);
        System.out.println(resultado);
    }
}
