package EstructurasDeControl;

import java.util.Scanner;

public class Extra07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, max, min, num, suma=0, a = 0;

        System.out.println("Ingrese N");
        n = read.nextInt();

        System.out.println("Ingrese los numeros");
        num = read.nextInt();        
//        suma=num;
        max = num;
        min = num;

        do {            
            System.out.println("Ingrese otro numero");            
            num = read.nextInt();            
            suma=suma+num;
            a++;
        } while (a < n-1);

        if (max > num) {
            max = num;
        }

        if (min < num) {
            min = num;
        }
        
        System.out.println("El mnimo num es: " + max);
        System.out.println("El promedio es: " + suma/n);
        System.out.println("El maximo numero es: " + min);
    }

}
