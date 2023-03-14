package Encuentro4;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String clave;

        System.out.println("Ingrese la clave");

        do {
            clave = read.next();
            if (!clave.equals("eureka")) {
                System.out.println("La clave es incorrecta, intente nuevamente");
            }

        } while (!clave.equals("eureka"));

        System.out.println("La clave ingresada es correcta :)");

    }

}
