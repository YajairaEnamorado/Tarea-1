/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

/**
 *
 * @author Michel Enamorado
 */
public class Tarea {
    public static void main(String[] args) {
        // 1. Imprimir mensaje de saludo
        System.out.println("Hola, soy YAJAIRA MICHEL ENAMORADO TORRES");
        System.out.println("-----------------------------------------");

        // 2. Operaciones aritméticas de dos números enteros
        int num1 = 10;
        int num2 = 5;

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
        System.out.println("-----------------------------------------");
        // 3. Evaluación de expresiones con variables M, T, K
        int M = 6;
        int T = 1;
        int K = -10;

        System.out.println("M > T: " + (M > T));                   // Verdadero
        System.out.println("T / K == -5: " + (T / K == -5));       // Falso
        System.out.println("(M + T == 7) || (M - T == 5): " + ((M + T == 7) || (M - T == 5)));  // Verdadero
        System.out.println("-----------------------------------------");
        // 4. Arreglo que guarda e imprime 10 nombres de compañeros de clase
        String[] nombres = {"Carlos", "Ana", "Luis", "Maria", "Juan", "Diana", "Pedro", "Sara", "Miguel", "Laura"};

        System.out.println("Nombres de companeros de clase:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        System.out.println("-----------------------------------------");
        // 5. Arreglo multidimensional con datos personales de 5 compañeros
        String[][] datosPersonales = {
            {"Daniel", "Medina", "Electronica", "TEST"},
            {"Monica", "Jiz", "Computacion", "IMSA"},
            {"Carlos", "Perez", "Mecatronica", "XYZ Corp"},
            {"Ana", "Lopez", "Industrial", "ABC Inc"},
            {"Luis", "Gomez", "Civil", "DEF Ltd"}
        };

        System.out.println("\nDatos personales de companeros de clase:");
        for (String[] persona : datosPersonales) {
            System.out.println("Nombre: " + persona[0]);
            System.out.println("Apellido: " + persona[1]);
            System.out.println("Carrera: " + persona[2]);
            System.out.println("Lugar de Trabajo: " + persona[3]);
            System.out.println();
        }
        System.out.println("-----------------------------------------");
                // Parte 1: Evaluación de nota de estudiantes
        String[] nombres2 = {"Daniel", "Monica"};
        int[] notas = {65, 89};

        for (int i = 0; i < nombres2.length; i++) {
            System.out.println(nombres[i]);
            System.out.println(notas[i]);
            if (notas[i] >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        // Parte 2: Imprimir números pares del 2 al 100
        System.out.println("Numeros pares del 2 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------");
        
        
    } 
}
