package EstructurasDeControl;

import java.util.Scanner;

public class Extra02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A = 1, B = 2, C = 3, D = 4, aux;

        System.out.println(A + "-" + B + "-" + C + "-" + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println(A + "-" + B + "-" + C + "-" + D);

    }

}
