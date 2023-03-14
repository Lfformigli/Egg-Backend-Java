package Encuentro4;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String frase;

        do {

            frase = read.nextLine();

            if (!"".equals(frase)) {

                if (frase.length() == 8) {
                    System.out.println("CORRECTO");
                } else {
                    System.out.println("INCORRECTO");
                }

            }

        } while (!"".equals(frase));

    }

}
