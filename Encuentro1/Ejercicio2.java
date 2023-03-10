package Encuentro1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Escriba su nombre");

        String nombre;

        Scanner leer = new Scanner(System.in);

        nombre = leer.next();

        System.out.println("Su nombre es " + nombre);
    }

}
