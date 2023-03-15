package EstructurasDeControl;

import java.util.Scanner;

public class Extra11 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int suma=0;
    double number=read.nextDouble();
    
        while (number>1) {   
           number=number/10;
           suma++;
        }
        System.out.println(suma);
        
    }

}
