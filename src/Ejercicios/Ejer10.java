package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Ingresa el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Pedir los límites para los números aleatorios
        System.out.print("Ingresa el número mínimo: ");
        int min = scanner.nextInt();
        System.out.print("Ingresa el número máximo: ");
        int max = scanner.nextInt();

        // Crear el array con el tamaño especificado
        int[] numeros = new int[tamaño];
        Random rand = new Random();

        // Llenar el array con números aleatorios dentro del rango especificado
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = rand.nextInt((max - min) + 1) + min;
        }

        // Encontrar el número mayor y calcular la suma
        int maximo = numeros[0];
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
            if (numero > maximo) {
                maximo = numero;
            }
        }

        // Mostrar el número mayor y la suma de todos los números
        System.out.println("El número mayor es: " + maximo);
        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}
