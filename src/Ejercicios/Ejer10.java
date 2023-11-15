package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        //Crea un array de números de un tamaño pasado por teclado, el array contendrá números
        //aleatorios entre los números deseados, por último nosindica cual es el mayor de todos y la suma
        //de todos ellos.
        int tamanio, suma = 0, min, max, maximo = Integer.MIN_VALUE;;

        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        tamanio = sc.nextInt();

        // Crear el array del tamaño especificado
        int[] numeros = new int[tamanio];

        // Generar números aleatorios entre 0 y 9 y llenar el array
        System.out.println("Ingrese el rango para los números aleatorios:");
        System.out.print("Ingrese el número mínimo: ");
        min = sc.nextInt();
        System.out.print("Ingrese el número máximo: ");
        max = sc.nextInt();

        // Llenar el array con números aleatorios en el rango dado y calcular la suma y el máximo
        for (int i = 0; i < tamanio; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1)) + min;
            suma += numeros[i];

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Mostrar los valores del array
        System.out.println("Valores del array:");
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        // Mostrar el número máximo y la suma
        System.out.println("El número máximo es: " + maximo);
        System.out.println("La suma de los números es: " + suma);

        sc.close();
        System.out.println("Fin de Programa...");

    }
}
