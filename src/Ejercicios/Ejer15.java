package Ejercicios;

public class Ejer15 {
    public static void main(String[] args) {
        //- Rellena un array bidimensional de 10x10 con los números del 1 al 100 en orden invertido y
        //recorre la matriz mostrando los valores con su posición.
        
        int[] arr = new int[100];

        // Rellenar el array con los números del 1 al 100 en orden invertido
        for (int i = 0; i < 100; i++) {
            arr[i] = 100 - i;
        }

        // Recorrer el array y mostrar los valores con su posición
        for (int i = 0; i < 100; i++) {
            //System.out.print(arr[i] + " ");
            System.out.print((arr[i] < 10 ? "  " : (arr[i] < 100 ? " " : "")) + arr[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); // Agregar salto de línea después de cada fila
            }
        }
    }
}
