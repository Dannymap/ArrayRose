package Ejercicios;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        // Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos
        //el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada
        //posición y la suma de todos los valores.
        int tamanioArray, numero;

        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño del array desde el teclado
        System.out.print("Ingrese el tamaño del array: ");
        tamanioArray = scanner.nextInt();

        // Crear el array con el tamaño especificado
        int[] numeros = new int[tamanioArray];

        // Rellenar el array con números entre 0 y 9 ingresados por el usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entre 0 y 9 para la posición " + i + ": ");
            numero = scanner.nextInt();

            while (numero < 0 || numero > 9) {
                System.out.print("El número debe estar entre 0 y 9. Inténtelo nuevamente: ");
                numero = scanner.nextInt();
            }
            numeros[i] = numero;
        }

        // Mostrar los valores del array y calcular la suma
        int suma = 0;
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
