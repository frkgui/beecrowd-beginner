package areaOfCircle;

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
        Scanner lerEntrada = new Scanner(System.in);

        Double r = lerEntrada.nextDouble();
        Double a = 3.14159*(r*r);

        System.out.printf("A=%.4f%n", a);

    }

}