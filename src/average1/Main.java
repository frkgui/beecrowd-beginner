package average1;

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
    
    Double gradeA, gradeB, studentAverage;

    gradeA = read.nextDouble();
    gradeB = read.nextDouble();
    
    studentAverage = (((3.5 * gradeA) + (7.5 * gradeB)) /11);
    
    
    System.out.printf("MEDIA = %.5f%n", studentAverage);
    

    }
 
}