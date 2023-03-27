package Arreglos;

import java.util.Scanner;

public class Extra03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int vector1[] = new int[n];

        Rellenar(vector1);

        Showvector(vector1);

    }

    public static void Rellenar(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }
    }

    public static void Showvector(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print("(" + vector[i] + ")");
        }

    }

}
