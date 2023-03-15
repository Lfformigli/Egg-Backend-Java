package IntroduccionAJava;

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos Numeros");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int suma = numero1+numero2; 
        System.out.println("La suma de los numeros es " + suma);
    }
}
