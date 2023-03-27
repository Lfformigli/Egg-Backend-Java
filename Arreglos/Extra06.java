package Arreglos;

import java.util.Scanner;

public class Extra06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String sopa[][] = new String[20][20];

        boolean space = true;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = " ";
            }
        }

        for (int n = 0; n < 5; n++) {

            System.out.println("Ingrese 5 palabras de 3 a 5 caracteres");
            String palabra = read.next();

            if (palabra.length() > 5 || palabra.length() < 3) {
                do {
                    System.out.println("Ingreso incorrecto, intente nuevamente");
                    palabra = read.next();
                } while (palabra.length() > 5 || palabra.length() < 3);
            }

            int posY = (int) (Math.random() * 14);
            int posX = (int) (Math.random() * 19);
            int posAux = posY;

            do {

                space = true;

                for (int i = 0; i < palabra.length(); i++) {

                    do {

                        if (sopa[posX][posY].equals(" ")) {
                            space = true;
                            posY++;
                        } else {
                            space = false;
                        }
                        
                    } while (space && i>palabra.length());

                }

                if (!space) {
                    posY = (int) (Math.random() * 14);
                }

            } while (!space);

            if (space) {

                posY -= palabra.length();

                for (int i = 0; i < palabra.length(); i++) {
                    sopa[posX][posAux] = palabra.substring(i, i + 1);
                    posAux++;
                }
            }

        }

        showmatriz(sopa);
    }

    public static void showmatriz(String vector[][]) {

        for (String[] vector1 : vector) {
            for (int j = 0; j < vector.length; j++) {
                System.out.print("[" + vector1[j] + "]");
            }
            System.out.println("");
        }

    }

}
