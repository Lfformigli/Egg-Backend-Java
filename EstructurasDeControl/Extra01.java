package EstructurasDeControl;

import java.util.Scanner;

public class Extra01 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int dias = 0, horas = 0, min;

        System.out.println("Ingrese el tiempo en minutos");

        min = read.nextInt();

        while (min >= 1440) {
            dias = dias + 1;
            min = min - 1440;
        }

        while (min >= 60) {
            horas = horas + 1;
            min = min - 60;
        }

        System.out.println("Dias: " + dias + "Horas: " + horas);

    }
}
