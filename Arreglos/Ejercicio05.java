package Arreglos;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int matriz[][] = new int[3][3], cont=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               matriz[i][j]=read.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] != 0) {
                    cont++;
                }
            }
        }

        if (cont>1) {
            System.out.println("La matriz no es antisimetrica");
        }   else {
            System.out.println("La matriz si es antisimetrica");
        }
        
        
    }

}
