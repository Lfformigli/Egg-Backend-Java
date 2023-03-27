package Arreglos;

import java.util.Scanner;

public class Extra01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = read.nextInt(), suma = 0;

        int vector[] = new int[n];

        System.out.println("Ingrese los valores del vector");
        for (int i = 0; i < n; i++) {
            vector[i] = read.nextInt();
            suma += vector[i];
        }

        System.out.println(suma);
    }

}
