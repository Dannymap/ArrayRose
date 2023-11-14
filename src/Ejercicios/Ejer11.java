package Ejercicios;

public class Ejer11 {
    public static void main(String[] args) {
        //Crea un array de números de 65 posiciones, que contendrá los números del 1 al 65. Obtén
        //la suma de todos ellos y la media
        int suma;
        double media;

        int[] numeros = new int[65];

        // Llenar el array con los números del 1 al 65
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de los números
        suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        // Calcular la media
        media = (double) suma / numeros.length;

        // Mostrar la suma y la media
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
    }
}
