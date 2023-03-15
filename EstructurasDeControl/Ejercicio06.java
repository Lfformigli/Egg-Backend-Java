package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        boolean salida = false;
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        double result;

        do {

            if (!salida) {
                System.out.println("MENU");
                System.out.println("1-Sumar");
                System.out.println("2-Restar");
                System.out.println("3-Multiplicar");
                System.out.println("4-Dividir");
                System.out.println("5-Salir");
            }
            
            int option = read.nextInt();


            switch (option) {
                case 1:
                    result = (num1 + num2);
                    System.out.println(result);
                    break;
                case 2:
                    result = (num1 - num2);
                    System.out.println(result);
                    break;
                case 3:
                    result = (num1 * num2);
                    System.out.println(result);
                    break;
                case 4:
                    result = (num1 / num2);
                    System.out.println(result);
                    break;
                case 5:
                    System.out.println("Esta seguro? (Y/N)");
                    String ans = read.next();
                    if  (ans.toLowerCase().equals("y")) {
                        salida = true;
                    }
            }
        } while (!salida);

    }

}
