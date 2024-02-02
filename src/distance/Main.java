package distance;

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner read = new Scanner(System.in);
    
    int yDistance = read.nextInt();
    
    int distanceInMinutes = (int) (yDistance / ((90 / 60.0) - (60 / 60.0)));
    
    System.out.printf("%d minutos%n",distanceInMinutes); 
    }
 
}