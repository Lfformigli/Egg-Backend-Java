package Subprogramas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Cantidad de Euros");
        int euros = read.nextInt();
        String moneda = "";

        System.out.println("1-Convertir a Libra");
        System.out.println("2-Convertir a Dolar");
        System.out.println("3-Convertir a Yen");

        System.out.println("Elija una opcion para realizar la conversion");
        int opc = read.nextInt();

        do {
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    moneda = "Libra";
                    break;
                case 2:
                    moneda = "Dolar";
                    break;
                case 3:
                    moneda = "Yen";
                    break;
                default:
                    System.out.println("Ingreso incorrecto");
                    System.out.println("1-Convertir a Libra");
                    System.out.println("2-Convertir a Dolar");
                    System.out.println("3-Convertir a Yen");
            }
        } while (opc != 1 && opc != 2 && opc != 3);

        convertir(euros, moneda);

    }

    public static void convertir(double euros, String moneda) {

        switch (moneda) {
            case "Libra":
                System.out.println(euros + " euros equivalen a " + euros * 0.86 + " libras");
                break;
            case "Dolar":
                System.out.println(euros + " euros equivalen a " + euros * 1.28611 + " dolares");
                break;
            case "Yen":
                System.out.println(euros + " euros equivalen a " + euros * 129.852 + " yenes");
                break;

        }

    }

}
