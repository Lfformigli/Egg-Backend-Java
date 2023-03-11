package Encuentro3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
                
        System.out.println("Ingrese una palabra");
        
        String palabra = read.next();
                
        if (palabra.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
                
          
    }

}
