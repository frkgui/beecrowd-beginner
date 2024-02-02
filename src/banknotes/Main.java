package banknotes;

import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        
        int inputValue = read.nextInt();
        int aux;
        
        System.out.printf("%d%n", inputValue);
        
        System.out.printf("%d nota(s) de R$ 100,00%n", inputValue/100);
        aux = inputValue%100;
        
        System.out.printf("%d nota(s) de R$ 50,00%n", aux/50);
        aux = aux%50;
        
        System.out.printf("%d nota(s) de R$ 20,00%n", aux/20);
        aux = aux%20;
        
        System.out.printf("%d nota(s) de R$ 10,00%n", aux/10);
        aux = aux%10;
        
        System.out.printf("%d nota(s) de R$ 5,00%n", aux/5);
        aux = aux%5;
        
        System.out.printf("%d nota(s) de R$ 2,00%n", aux/2);
        aux = aux%2;
        
        System.out.printf("%d nota(s) de R$ 1,00%n", aux/1);
    }
 
}