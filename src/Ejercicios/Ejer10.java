package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        //Crea un array de números de un tamaño pasado por teclado, el array contendrá números
        //aleatorios entre los números deseados, por último nosindica cual es el mayor de todos y la suma
        //de todos ellos.
        int tamanio, num, suma, maximo;

        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        tamanio = sc.nextInt();

        // Crear un array del tamaño especificado por el usuario
        int[] numeros = new int[tamanio];

        // Pedir al usuario los números para llenar el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entre 0 y 9 para la posición " + i + ": ");
            num = sc.nextInt();

            // Validar que el número esté en el rango permitido
            while (num < 0 || num > 9) {
                System.out.print("Número fuera de rango. Ingrese un número entre 0 y 9 para la posición " + i + ": ");
                num = sc.nextInt();
            }

            // Almacenar el número en el array
            numeros[i] = num;
        }

        // Mostrar los valores del array y calcular la suma
        suma = 0;
        maximo = numeros[0];
        System.out.println("\nValores del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];

            // Encontrar el número máximo
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Mostrar el número máximo y la suma de los valores
        System.out.println("\nEl número mayor es: " + maximo);
        System.out.println("La suma de los valores es: " + suma);

        sc.close();
        System.out.println("Fin de Programa...");

    }
}
