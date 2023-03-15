//Crear un programa que dado un número determine si es par o impar.
package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero para determinar si es par");

        Scanner read = new Scanner(System.in);

        int num= read.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }

}
