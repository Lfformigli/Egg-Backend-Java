package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int correctas = 0, incorrectas = 0;
        String palabra;

        do {
            System.out.println("Ingrese palabras");
            palabra = read.next();

            if (palabra.startsWith("x") && palabra.endsWith("o") && palabra.length() == 5) {
                correctas++;
            } else if (!palabra.equals("&&&&&")) {
                incorrectas++;
            }
        } while (!palabra.equals("&&&&&"));

        System.out.println("El numero de ingresos correctos es: " + correctas);
        System.out.println("El numero de ingresos incorrectos es " + incorrectas);

    }

}
