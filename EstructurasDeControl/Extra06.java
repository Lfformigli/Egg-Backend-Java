package EstructurasDeControl;

import java.util.Scanner;

public class Extra06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a evaluar");
        int n = read.nextInt();
        int alt;
        int altG = 0;
        int alt2 = 0;
        int cont = 0;
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Ingrese la altura de la persona:");
            alt = read.nextInt();
            altG = altG + alt;
            if (alt < 160) {
                cont = cont + 1;
                alt2 = alt2 + alt;
            }
        }
        System.out.println("El promedio de personas debajo de 1,60 es de: " + alt2 / cont);
        System.out.println("El promedio general es de:" + altG / n);
    }

}



