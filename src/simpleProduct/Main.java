package simpleProduct;

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
 
        Scanner read = new Scanner(System.in);
 
        int value1, value2, result;
        
        value1 = read.nextInt();
        value2 = read.nextInt();
 
        result = value1*value2;
        
        System.out.printf("PROD = %d%n",result);
 
    }
 
}