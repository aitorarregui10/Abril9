package com.softtek.presentacion.function.EjerciciosInterfaceFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEj1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        Function<Integer, Boolean> fx = x -> x % 2 == 0;

        List<Integer> esPar = new ArrayList<>();
        for (Integer numero : numeros) {
            if (fx.apply(numero)) {
                esPar.add(numero);
            }
        }

        System.out.println(esPar);
    }
}


/*

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Predicate<Integer> isEven = num -> num % 2 == 0;

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (isEven.test(number)) {
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers); // [2, 4]
    }
}




import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

    //R apply(T t);
    public class FunctionApp {

        private void m1Apply() {
            Function<String, Integer> fx = x -> x.length();
            Integer rpta = fx.apply("mitocode");
            System.out.println(rpta);
        }

        private void m2AndThen() {
            Function<String, Integer> fx1 = x -> x.length();
            Function<Integer, Integer> fx2 = x -> x + 10;

            Integer rpta = fx1.andThen(fx2).apply("mitocode");
            System.out.println(rpta);
        }

        private void m2AndThenV2() {
            Function<Integer, Integer> fx1 = x -> x * 2;
            Function<Integer, Integer> fx2 = x -> x + 10;

            Integer rpta = fx1.andThen(fx2).apply(5);
            System.out.println(rpta);
        }

        private void m3Compose() {
            Function<Integer, Integer> fx1 = x -> x * 2;
            Function<Integer, Integer> fx2 = x -> x + 10;

            Integer rpta = fx1.compose(fx2).apply(5);
            System.out.println(rpta);
        }

        public void m4Identity() {
            //f(x) = x
            Function<Client, Client> fx = Function.identity();
            System.out.println(fx.apply(new Client()));
        }

        public void m5Identity() {
            List<Person> list = new ArrayList<>();
            list.add(new Person(1, "Mito", 32));
            list.add(new Person(2, "Code", 33));
            list.add(new Person(3, "Jaime", 34));

            Map<Integer, Person> map = list.stream()
                    .collect(Collectors.toMap(Person::getId, Function.identity())); //e-> e.getId()

            System.out.println(map);
        }

        public void m6Identity() {
            Function<Integer, Integer> f1 = Function.identity();
            Function<Integer, Integer> f2 = Function.identity();
            Function<Integer, Integer> f3 = Function.identity();

            Function<Integer, Integer> f4 = t -> t;
            Function<Integer, Integer> f5 = t -> t;
            Function<Integer, Integer> f6 = t -> t;

            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f3);
            System.out.println("====================================");
            System.out.println(f4);
            System.out.println(f5);
            System.out.println(f6);
        }

        private void m7IntDoubleLongFunction() {
            IntFunction<Double> fn1 = x -> x * 2.5;
            DoubleFunction<String> fn2 = x -> "Value is " + x;
            LongFunction<String> fn3 = x -> "Value is " + x;

            double result1 = fn1.apply(5);
            String result2 = fn2.apply(30.99);
            String result3 = fn3.apply(50);

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
        }

        private void m8OthersFunctions() {
            ToIntFunction<Person> showAge = Person::getAge;
            ToIntBiFunction<Person, Integer> calculateNewAge = (p, i) -> p.getAge() + i;
            DoubleToIntFunction fx = x -> 5;

            System.out.println(fx.applyAsInt(10));

            Integer newAge = calculateNewAge.applyAsInt(new Person(1, "mito", 15), 20);
            System.out.println(newAge);
        }

        public static void main(String[] args) {
            FunctionApp app = new FunctionApp();
            app.m8OthersFunctions();
        }

*/


