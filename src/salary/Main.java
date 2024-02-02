package salary;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner input = new Scanner(System.in);
      
    Integer empNumber = input.nextInt();
    Integer empHours = input.nextInt();
    float empPerHour = input.nextFloat();
 
    float empSalary = (empHours * empPerHour);
    
    System.out.printf("NUMBER = %d%n", empNumber);
    System.out.printf("SALARY = U$ %.2f%n", empSalary);
 
    }
 
}