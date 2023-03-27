package Arreglos;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;
        //int[][] matriz={{2,7,6},{9,5,1},{4,3,8}};
        int[] vectorFila = new int[3];
        int[] vectorColumna = new int[3];
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero entre 1 y 9 para la posicion:" + i + "-" + j);
                    num = leer.nextInt();
                } while (num < 1 || num > 9);
                matriz[i][j] = num;
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("----------");
        int sumaF;
        int sumaC;
        for (int i = 0; i < 3; i++) {
            sumaF = 0;
            sumaC = 0;
            for (int j = 0; j < 3; j++) {
                sumaF = sumaF + matriz[i][j];
                sumaC = sumaC + matriz[j][i];
                if (i == j) {
                    diagonal1 += matriz[i][j];
                }
                if (i + j == 2) {
                    diagonal2 += matriz[i][j];
                }
            }
            vectorFila[i] = sumaF;
            vectorColumna[i] = sumaC;
        }

        boolean confirmacion = true;
        System.out.print("Suma filas:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + vectorFila[i] + "]");
            if (vectorFila[i] != vectorColumna[i] || diagonal1 != vectorFila[i] || diagonal2 != vectorFila[i]) {
                confirmacion = false;
            }
        }
        System.out.println("");
        System.out.print("Suma columnas:");
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + vectorColumna[i] + "]");
        }
        System.out.println("");
        System.out.println("Suma Diagonal 1: [" + diagonal1 + "]");
        System.out.println("Suma Diagonal 2: [" + diagonal2 + "]");

        if (confirmacion) {
            System.out.println("Es magica");
        } else {
            System.out.println("No es magica");
        }
    }

}
