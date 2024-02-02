package area;

import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        double numA, numB, numC;
        
        double triangulo, circulo, trapezio, quadrado, retangulo;
        
        numA = input.nextDouble();
        numB = input.nextDouble();
        numC = input.nextDouble();
        
        triangulo = ((numA*numC)/2.0);
        circulo = 3.14159*(numC*numC);
        trapezio = ((numA+numB)*numC)/2;
        quadrado = numB*numB;
        retangulo = numA*numB;
        
        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangulo,circulo,trapezio,quadrado,retangulo);
    }
 
}