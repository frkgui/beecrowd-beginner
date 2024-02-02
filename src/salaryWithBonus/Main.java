package salaryWithBonus;

import java.io.IOException;
import java.util.Scanner;
                
                
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
    
        String employersName = input.nextLine();
        double employersSalary = input.nextDouble();
        double employersSold = input.nextDouble();
            
        double employersFinalSalary = employersSalary+(15*employersSold/100);
        
        System.out.printf("TOTAL = R$ %.2f%n", employersFinalSalary);
    }
 
}