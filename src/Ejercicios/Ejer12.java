package Ejercicios;

import java.util.Scanner;
public class Ejer12 {
    public static void main(String[] args) {
        int posicion;

        // Crear un array para las letras de la 'A' a la 'Z'
        char[] letras = new char[26];

        // Llenar el array con las letras de la 'A' a la 'Z'
        for (int i = 0; i < 26; i++) {
            letras[i] = (char)('A' + i);
        }

        Scanner scanner = new Scanner(System.in);
        // Cadena donde se guardarán los caracteres seleccionados
        String resultado = "";

        do {
            System.out.println("Introduce la posición (0-25) del carácter ('-1' para terminar): ");
            posicion = scanner.nextInt();

            // Verificar si la posición está dentro del rango válido
            if (posicion >= 0 && posicion < 26) {
                resultado += letras[posicion]; // Agregar el carácter a la cadena resultado
            } else if (posicion != -1) {
                System.out.println("Error, inserta otro número dentro del rango (0-25).");
            }
        } while (posicion != -1);

        System.out.println("Cadena resultante: " + resultado);
    }
}
