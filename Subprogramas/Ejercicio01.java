package Subprogramas;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num1, num2, opc;
        double resultado=0;

        System.out.println("Ingrese dos numeros");

        num1 = read.nextInt();
        num2 = read.nextInt();

        System.out.println("Menu");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");

        System.out.println("Elija una opcion");

        opc = read.nextInt();
        
        switch (opc) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
        }
        
        System.out.println(resultado);

    }

    public static int sumar(int a, int b) {

        int suma = a + b;

        return suma;
    }
    
    
    public static int restar(int a, int b) {

        int resta = a - b;

        return resta;
    }
    
    
    public static int multiplicar(int a, int b) {

        int mult = a + b;

        return mult;
    }
    
    
    public static double dividir(double a, double b) {

        double div = a / b;
               
        return div;
    }
    
    
}
