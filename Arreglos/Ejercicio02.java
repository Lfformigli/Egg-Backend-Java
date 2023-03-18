package Arreglos;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, buscar, pos=0, rep=0;

        System.out.println("Ingrese el tamaño del vector");
        n = read.nextInt();

        int vector[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i]= (int)(Math.random()*10+1);
        }
        
        System.out.println("Que numero desea buscar");
        buscar = read.nextInt();
        
        for (int i = 0; i < n; i++) {
            pos++;
            if (vector[i]==buscar) {
                rep++;
                System.out.println("Se encontro el numero en la posicion n°: " + pos);
            }            
            }
            if (rep>1) {
                System.out.println("El numero se encuentra repetido " + rep + " veces");
        }
            
            
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
            
            
    }
    
}
