package DesafiosJava;

import java.io.IOException;
import java.util.Scanner;

public class ValorMultiplos {
	public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int Num1  = leitor.nextInt();
        int  Num2 = leitor.nextInt();
        
        
        
       if ((Num1 % Num2 == 0) | (Num2 % Num1 == 0)) {
         
			System.out.println("Sao Multiplos");
		}
		
		else {
			System.out.println("Nao sao Multiplos");
		}
}
}
