package Subprogramas;

import java.util.Scanner;

public class EjercicioPdf01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String letra, frase2;

        System.out.println("Ingrese una frase");

        String frase = read.nextLine();

        frase2 = "";

        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);

            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            frase2 = frase2 + letra;
        }
        System.out.println(frase2);

    }

}
