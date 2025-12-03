package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }
    // EJERCICIO 1

    public static void ejercicio1() {
        System.out.println("\n===== EJERCICIO 1 =====");

        List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        frutas.add(2, "Uva");

        System.out.println("Primera fruta: " + frutas.get(0));

        frutas.set(3, "Kiwi");

        System.out.println("Tamaño de la lista: " + frutas.size());

        System.out.println("Lista completa: " + frutas);
    }

    // EJERCICIO 2

    public static void ejercicio2() {
        System.out.println("\n===== EJERCICIO 2 =====");

        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20));

        nums.remove(2); // eliminar por índice

        nums.remove(Integer.valueOf(20)); // eliminar primera aparición

        boolean contiene40 = nums.contains(40);
        System.out.println("¿Contiene 40?: " + contiene40);

        System.out.println("Tamaño final: " + nums.size());

        System.out.println("Lista resultante: " + nums);
    }

    // EJERCICIO 3

    public static void ejercicio3() {
        System.out.println("\n===== EJERCICIO 3 =====");

        List<String> nombres = new ArrayList<>(Arrays.asList("Tatiana", "Luis", "María", "Carlos", "Elena"));

        int contador = 0;

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Posición " + i + ": " + nombres.get(i));

            if (nombres.get(i).length() > 4) {
                contador++;
            }
        }

        System.out.println("Nombres con más de 4 caracteres: " + contador);
    }

    // EJERCICIO 4

    public static void ejercicio4() {
        System.out.println("\n===== EJERCICIO 4 =====");

        List<Double> valores = new ArrayList<>(Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4));

        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (double v : valores) {
            suma += v;

            if (v > max)
                max = v;
            if (v < min)
                min = v;
        }

        double promedio = suma / valores.size();

        System.out.println("Suma total: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }

    // EJERCICIO 
    
    public static void ejercicio5() {
        System.out.println("\n===== EJERCICIO 5 =====");

        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++)
            lista.add(i);

        System.out.println("Lista original: " + lista);

        Iterator<Integer> it = lista.iterator();
        int eliminados = 0;

        while (it.hasNext()) {
            int valor = it.next();
            if (valor % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }

        System.out.println("Lista después de eliminar pares: " + lista);
        System.out.println("Cantidad eliminada: " + eliminados);
    }

    // EJERCICIO 6

    public static void ejercicio6() {
        System.out.println("\n===== EJERCICIO 6 =====");

        List<String> lenguajes = new ArrayList<>(Arrays.asList(
                "Java", "Python", "C++", "JavaScript", "Python", "Go"));

        int primeraPython = lenguajes.indexOf("Python");
        int ultimaPython = lenguajes.lastIndexOf("Python");
        boolean contieneRuby = lenguajes.contains("Ruby");

        List<String> sublista = lenguajes.subList(1, 4);

        System.out.println("Primera aparición de Python: " + primeraPython);
        System.out.println("Última aparición de Python: " + ultimaPython);
        System.out.println("¿Contiene Ruby?: " + contieneRuby);
        System.out.println("Sublista (1 a 4): " + sublista);
    }

    // EJERCICIO 7

    public static void ejercicio7() {
        System.out.println("\n===== EJERCICIO 7 =====");

        List<Integer> nums = new ArrayList<>(Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56));

        Collections.sort(nums);
        System.out.println("Ascendente: " + nums);

        nums.sort(Collections.reverseOrder());
        System.out.println("Descendente: " + nums);

        List<String> nombres = new ArrayList<>(Arrays.asList("Tatiana", "Luis", "María", "Carlos", "Elena"));
        Collections.sort(nombres);
        System.out.println("Nombres alfabéticamente: " + nombres);

        nombres.sort(Comparator.comparingInt(String::length));
        System.out.println("Nombres por longitud: " + nombres);
    }

    // EJERCICIO 8

    public static void ejercicio8() {
        System.out.println("\n===== EJERCICIO 8 =====");

        List<String> palabras = new ArrayList<>(Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren"));

        palabras.removeIf(p -> p.length() < 5);
        System.out.println("Palabras (>=5 letras): " + palabras);

        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++)
            numeros.add(i);

        numeros.removeIf(x -> x % 3 == 0);
        System.out.println("Números no divisibles por 3: " + numeros);
    }

    // EJERCICIO 9

    public static void ejercicio9() {
        System.out.println("\n===== EJERCICIO 9 =====");

        List<String> dias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes"));

        Object[] arreglo1 = dias.toArray();
        String[] arreglo2 = dias.toArray(new String[0]);

        System.out.println("Longitud arreglo1 (Object): " + arreglo1.length);
        System.out.println("Longitud arreglo2 (String): " + arreglo2.length);

        System.out.println("Elementos arreglo1:");
        for (Object o : arreglo1)
            System.out.println(o);

        System.out.println("Elementos arreglo2:");
        for (String s : arreglo2)
            System.out.println(s);

        List<String> desdeArreglo = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Lista desde Arrays.asList: " + desdeArreglo);
    }

    // EJERCICIO 10

    public static void ejercicio10() {
        System.out.println("\n===== EJERCICIO 10 - Gestión de Estudiantes =====");

        List<String> estudiantes = new ArrayList<>();
        List<Double> notas = new ArrayList<>();

        agregarEstudiante(estudiantes, notas, "Tatiana", 4.5);
        agregarEstudiante(estudiantes, notas, "Luis", 2.8);
        agregarEstudiante(estudiantes, notas, "María", 3.7);
        agregarEstudiante(estudiantes, notas, "Carlos", 4.2);
        agregarEstudiante(estudiantes, notas, "Elena", 2.5);

        System.out.println("\nListado de estudiantes:");
        listarEstudiantes(estudiantes, notas);

        System.out.println("\nPromedio general: " + calcularPromedio(notas));

        System.out.println("\nEstudiantes aprobados:");
        estudiantesAprobados(estudiantes, notas);

        eliminarEstudiante(estudiantes, notas, 1);

        int posMaria = buscarEstudiante(estudiantes, "María");
        System.out.println("\nPosición de María: " + posMaria);

        System.out.println("\nListado final:");
        listarEstudiantes(estudiantes, notas);
    }

    // --- Métodos auxiliares Ejercicio 10 ---
    public static void agregarEstudiante(List<String> est, List<Double> nota, String nombre, Double calificacion) {
        est.add(nombre);
        nota.add(calificacion);
    }

    public static void eliminarEstudiante(List<String> est, List<Double> nota, int indice) {
        if (indice >= 0 && indice < est.size()) {
            est.remove(indice);
            nota.remove(indice);
        }
    }

    public static int buscarEstudiante(List<String> est, String nombre) {
        return est.indexOf(nombre);
    }

    public static double calcularPromedio(List<Double> nota) {
        double suma = 0;
        for (double n : nota)
            suma += n;
        return suma / nota.size();
    }

    public static void listarEstudiantes(List<String> est, List<Double> nota) {
        for (int i = 0; i < est.size(); i++) {
            System.out.println(est.get(i) + " - " + nota.get(i));
        }
    }

    public static void estudiantesAprobados(List<String> est, List<Double> nota) {
        for (int i = 0; i < est.size(); i++) {
            if (nota.get(i) >= 3.0) {
                System.out.println(est.get(i) + " - " + nota.get(i));
            }
        }
    }
}
