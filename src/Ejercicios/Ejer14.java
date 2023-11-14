package Ejercicios;

public class Ejer14 {
    public static void main(String[] args) {

        int[] originalArray = {1,2,3,4,5,6};
        int[] invertedArray = new int[originalArray.length];

        // Guardar los valores en el segundo array en orden inverso
        for (int i = 0; i < originalArray.length; i++) {
            invertedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Mostrar el segundo array con los valores invertidos
        System.out.print("Array invertido: {");
        for (int i = 0; i < invertedArray.length; i++) {
            System.out.print(invertedArray[i]);
            if (i < invertedArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
