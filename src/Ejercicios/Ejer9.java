package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        // Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos
        //el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada
        //posición y la suma de todos los valores.
        int tamanioArray, suma;

        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño del array desde el teclado
        System.out.print("Ingrese el tamaño del array: ");
        tamanioArray = scanner.nextInt();

        // Crear el array con el tamaño especificado
        int[] numeros = new int[tamanioArray];

        // Llenar el array con números aleatorios entre 0 y 9
        Random random = new Random();
        for (int i = 0; i < tamanioArray; i++) {
            numeros[i] = random.nextInt(10); // Números aleatorios entre 0 y 9
        }

        // Mostrar los valores del array y calcular la suma
        suma = 0;
        System.out.println("Valores del array:");
        for (int i = 0; i < tamanioArray; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];
        }

        // Mostrar la suma de todos los valores
        System.out.println("La suma de todos los valores es: " + suma);

        scanner.close();

        System.out.println("Fin de Programa...");
    }
}
