package Arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int cifras1 = 0, cifras2 = 0, cifras3 = 0, cifras4 = 0, cifras5 = 0;

        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt();

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = aleatorio.nextInt(500-1);

            if (String.valueOf(vector[i]).length() == 1) {
                cifras1++;
            }
            if (String.valueOf(vector[i]).length() == 2) {
                cifras2++;
            }
            if (String.valueOf(vector[i]).length() == 3) {
                cifras3++;
            }
            if (String.valueOf(vector[i]).length() == 4) {
                cifras4++;
            }
            if (String.valueOf(vector[i]).length() == 5) {
                cifras5++;
            }

        }
        
        System.out.println("Se encontraron:");
        System.out.println(cifras1 + " numeros de una cifra");
        System.out.println(cifras2 + " numeros de dos cifra");
        System.out.println(cifras3 + " numeros de tres cifra");
        System.out.println(cifras4 + " numeros de cuatro cifra");
        System.out.println(cifras5 + " numeros de cinco cifra");

        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        
        
    }  

}
