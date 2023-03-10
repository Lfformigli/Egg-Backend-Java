package Encuentro1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        double numero = leer.nextInt();
        
        System.out.println("El doble es: " + (numero*2) );
        System.out.println("El triple es: " + (numero*3) );
        System.out.println("El cuadrado es: " + Math.sqrt(numero));
    }

}
