package Encuentro5;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1) {
                    System.out.print("*");
                }   else {
                    if (j==0 || j==n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }


// METODO 2

//        for (int i = 0; i < n; i++) {
//            if (i == 0 || i == n - 1) {
//                for (int j = 0; j < n; ++j) {
//                    System.out.print("*");
//                }
//            } else {
//                System.out.print("*");
//                for (int j = 0; j < n - 2; ++j) {
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println("");
//
//        }

    }
}
