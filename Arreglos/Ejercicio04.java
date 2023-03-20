package Arreglos;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int matriz1[][] = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz1[i][j]= (int) (Math.random()*10);
            }
        }
        
                
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("("+matriz1[j][i]+")");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("("+matriz1[i][j]+")");
            }
            System.out.println("");
        }
        
    }

}
