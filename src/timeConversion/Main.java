package timeConversion;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int timeInSeconds = input.nextInt();

        int hours = timeInSeconds / 3600;
        int minutes = (timeInSeconds % 3600) / 60;
        int seconds = timeInSeconds % 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    }
 

}