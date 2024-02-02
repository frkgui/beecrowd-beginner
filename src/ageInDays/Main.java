package ageInDays;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int ageInDays = input.nextInt();

        int ageInYears = ageInDays / 365;
        System.out.printf("%d ano(s)\n", ageInYears);

        int ageInMonths = (ageInDays % 365) / 30;
        System.out.printf("%d mes(es)\n", ageInMonths);

        int ageInDaysFinal = (ageInDays % 365) % 30;
        System.out.printf("%d dia(s)\n", ageInDaysFinal);
    }

}