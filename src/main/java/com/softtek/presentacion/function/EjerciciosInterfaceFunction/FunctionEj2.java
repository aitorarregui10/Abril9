package com.softtek.presentacion.function.EjerciciosInterfaceFunction;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class FunctionEj2 {


    public static class Stats {
        // Atributos
        private final double min;
        private final double max;
        private final double avg;

        // Constructor
        public Stats(double min, double max, double avg) {
            this.min = min;
            this.max = max;
            this.avg = avg;
        }

        // Metodo para calcular las Stats
        public static Stats calcularStats(List<Double> numbers, Function<List<Double>, Stats> function) {
            Objects.requireNonNull(numbers, "numbers cannot be null");
            Objects.requireNonNull(function, "function cannot be null");

            return function.apply(numbers);
        }

        // Metodo para calcular las Stats de la Lista
        private static Stats calcularStatsLista(List<Double> numbers) {
            double min = numbers.stream().mapToDouble(Double::doubleValue).min().getAsDouble();
            double max = numbers.stream().mapToDouble(Double::doubleValue).max().getAsDouble();
            double avg = numbers.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);

            return new Stats(min, max, avg);
        }

        // Getters
        public double getMin() {
            return min;
        }

        public double getMax() {
            return max;
        }

        public double getAvg() {
            return avg;
        }
    }


    public static void main(String[] args) {

        //Instanciamos lista doubles, Function para calcular y traer Stats y finalmente imprimimos
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        Function<List<Double>, Stats> function = Stats::calcularStatsLista;
        Stats stats = Stats.calcularStats(numbers, function);

        System.out.println("Minimum: " + stats.getMin());
        System.out.println("Maximum: " + stats.getMax());
        System.out.println("Average: " + stats.getAvg());
    }
}
