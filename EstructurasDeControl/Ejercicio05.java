package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un numero limite");
        
        int limite = read.nextInt();
        
        int suma=0;
        
        do {
            System.out.println("Escriba numeros a sumar");
            suma=suma+read.nextInt(); 
            System.out.println("La sumatoria actual es:" + suma);
        } while (limite>suma);
        
        
    }

}
