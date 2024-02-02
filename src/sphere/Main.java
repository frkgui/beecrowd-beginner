package sphere;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
    Scanner input = new Scanner(System.in); 
    
    double radius = input.nextDouble();
    
    double volume = (4/3.0 * 3.14159)*(radius*radius*radius);
    System.out.printf("VOLUME = %.3f%n", volume);
    
    }
 
}