package Ejercicios;

import java.util.Scanner;

public class Ejer6_Rombo {
    public static void main(String[] args) {
        //Crea un programa que dibuje un rombo de asteriscos. Nosotros le pasamos la medida de la
        //mitad de la diagonal por teclado
        int mitadDiag;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la mitad de la diagonal: ");
        mitadDiag = sc.nextInt();

        //Primera parte
        for (int i = 0; i <= mitadDiag; i++) {
            for (int j = 0; j < mitadDiag - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Segunda parte
        for (int i = mitadDiag - 1; i >= 0; i--) {
            for (int j = 0; j < mitadDiag - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}