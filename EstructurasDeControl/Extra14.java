package EstructurasDeControl;

import java.util.Scanner;

public class Extra14 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
    int n = read.nextInt(); //familias
    int m=0;                //integrantes
    
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la cantidad de integrantes de la " + i + "° familia" );
            m = m+read.nextInt();            
        }
        System.out.println("La media de integrantes por familia es " + m/n);    
    }

}
