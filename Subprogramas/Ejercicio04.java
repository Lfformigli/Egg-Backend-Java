package Subprogramas;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = read.nextInt();
                
        if (primo(numero)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero NO es primo");
        }

    }

    public static boolean primo(int numero) {
        boolean a = false;
        int contador = 0;

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                contador++;
            }
        }

        if (contador <= 2) {
            a = true;
        }   
        
        return a;
        
    }

}
