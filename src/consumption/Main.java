package consumption;

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
    
    Scanner read = new Scanner(System.in); 
    
    int valueX = read.nextInt();
    double valueY = read.nextDouble();
        
    double averageConsumption = valueX/valueY;    
    
    System.out.printf("%.3f km/l%n", averageConsumption);
    }
 
}