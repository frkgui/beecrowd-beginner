package average2;

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
        
        Double gradeA,gradeB,gradeC,finalGrade;
        
        gradeA = read.nextDouble();
        gradeB = read.nextDouble();
        gradeC = read.nextDouble();
        
        finalGrade = ((2*gradeA + 3*gradeB + 5*gradeC)/10);
        
        System.out.printf("MEDIA = %.1f%n",finalGrade);
    }
 
}