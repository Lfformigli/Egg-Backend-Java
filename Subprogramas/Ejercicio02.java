    package Subprogramas;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String nombre, ans;
        int edad;

        do {

            System.out.println("Ingrese el nombre y la edad de la persona");
            nombre = read.next();
            edad = read.nextInt();

            System.out.println(nombre + " es " + MayOMen(nombre, edad) + " de edad.");

            System.out.println("Desea realizar otro ingreso?");
            ans = read.next();

            while (!ans.equalsIgnoreCase("si") && !ans.equalsIgnoreCase("no")) {
                System.out.println("Ingreso incorrecto");
                ans = read.next();
            }

        } while (!ans.equals("no"));

    }

    public static String MayOMen(String nombre, int edad) {
        String info;

        if (edad < 18) {
            info = "menor";
        } else {
            info = "mayor";
        }

        return info;
    }

}
