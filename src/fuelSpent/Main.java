package fuelSpent;

import java.io.IOException;
import java.util.Scanner;     

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
            
        int timeInTrip = read.nextInt();
        int averageSpeed = read.nextInt();
        
        double litersNeeded = (timeInTrip * averageSpeed)/12.0;
        
        System.out.printf("%.3f%n",litersNeeded);                            
    }
 
}