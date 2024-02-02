package simpleCalculate;

import java.io.IOException;
import java.util.Scanner;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner input = new Scanner(System.in);
    
    int p1Code = input.nextInt();
    int p1Units = input.nextInt();
    double p1Price = input.nextDouble();
    
    int p2Code = input.nextInt();
    int p2Units = input.nextInt();
    double p2Price = input.nextDouble();
    
    double totalPrice = (p1Price*p1Units+p2Price*p2Units);
    
    System.out.printf("VALOR A PAGAR: R$ %.2f%n",totalPrice);
    
    }
 
}