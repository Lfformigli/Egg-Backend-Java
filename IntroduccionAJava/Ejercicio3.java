package IntroduccionAJava;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
                
        System.out.println("La frase en mayusculas es " + frase.toUpperCase()); 
        System.out.println("La frase en minusculas es " + frase.toLowerCase());
    }
    }
