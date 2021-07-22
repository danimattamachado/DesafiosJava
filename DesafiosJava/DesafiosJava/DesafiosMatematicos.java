package DesafiosJava;

import java.util.Scanner;

public class DesafiosMatematicos {

	public static void main(String[] args) {
		double raio;
		double area;
        
		System.out.print("Entre um valor double para o raio: ");
		Scanner scan = new Scanner(System.in);
		raio = scan.nextDouble();
		
			
		area = Math.PI * (Math.pow( raio ,2));

		System.out.printf("A=%.4f\n", area);
		
		


	}

}
