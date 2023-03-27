package Arreglos;

import java.util.Scanner;

public class Extra07 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Numeros a mostrar de la secuencia de fibonacci");
        int n = read.nextInt();

        int fibo[] = new int[n];

        for (int i = 0; i < n; i++) {
           
            
            if (i>1) {                
            fibo[i]=fibo[i-1]+fibo[i-2];
            }
            
            if (i<=1) {
                fibo[i]=1;
            }
            
            
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(fibo[i]);
        }
        
    }

}
