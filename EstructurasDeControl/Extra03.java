package EstructurasDeControl;

import java.util.Scanner;

public class Extra03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una letra");
        String letra = read.next();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }        
    }
}
