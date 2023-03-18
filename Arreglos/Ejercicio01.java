package Arreglos;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [] vector = new int [100];
    
        for (int i = 0; i < 100; i++) {
            vector[i]= i+1;
        }
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        
    }

}
