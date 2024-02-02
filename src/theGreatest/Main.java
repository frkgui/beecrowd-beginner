package theGreatest;

import java.io.IOException;
import java.util.Scanner; 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
        
        int valorA = entrada.nextInt();
        int valorB = entrada.nextInt();
        int valorS = entrada.nextInt();
        
        int maiorValor = valorA;
            
        if(valorA<valorB || valorA<valorS){
            if(valorB<valorS){
                maiorValor = valorS; 
            }else{maiorValor = valorB;}
        }
            
        System.out.printf("%d eh o maior%n", maiorValor);
    }
 
}