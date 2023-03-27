package Arreglos;

import java.util.Scanner;

public class Extra02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int i = 0;
        int vector1[] = {1, 2, 3};
        int vector2[] = {1, 3, 3};
        boolean confirm = true;

        do {
            
            if (vector1[i] != vector2[i]) {
                confirm = false;
            }
            i++;

        } while (i<3 && confirm);
        
        if (!confirm) {
            System.out.println("Hay discrepancia");
        } else {
            System.out.println("No hay discrepancia");
        }

    }

}
