package Ejercicios;

import java.util.Scanner;

public class Ejer13 {
    public static void main(String[] args) {
        //Crea una aplicación que pida un numero por teclado y después comprobaremos si el
        //numero introducido es capicúa utilizando arrays.
        boolean esCapicua = true;
        int numero, longitud;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        numero = scanner.nextInt();

        longitud = String.valueOf(numero).length(); // Obtener la longitud del número
        int[] digitos = new int[longitud]; // Crear un array para almacenar los dígitos

        // Almacenar los dígitos del número en el array
        for (int i = longitud - 1; i >= 0; i--) {
            digitos[i] = numero % 10;
            numero /= 10;
        }

        // Verificar si el número es capicúa comparando los dígitos
        for (int i = 0; i < longitud / 2; i++) {
            if (digitos[i] != digitos[longitud - i - 1]) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
    }
}
