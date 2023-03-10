package Encuentro3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String clave2 = "eureka";
        String clave1;

        System.out.println("Ingrese la clave");

        do {
            clave1 = read.next();
            if (!clave1.equals(clave2)) {
                System.out.println("La clave es incorrecta, intente nuevamente");
            }

        } while (!clave1.equals(clave2));

        System.out.println("La clave ingresada es correcta :)");

    }

}
