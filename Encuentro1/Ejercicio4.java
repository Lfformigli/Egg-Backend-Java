package Encuentro1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centigrados");
        
        int grados = leer.nextInt();
        
        System.out.println("La temperatura en grados farenheit es: " + (32+(grados*9/5)));
    }

}
