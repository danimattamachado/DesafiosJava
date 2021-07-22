package DesafiosJava;

import java.util.Scanner;

public class QuantidadeNumerosPositivos {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("digitige 6 numeros quaisquer");
    	
    	int cont=0;

    	for (int i=0; i<6; i++) {
    		double numero = scann.nextDouble();
    		if (numero > 0.0) {
    			cont++;
    			
    		}
    	}
    	
    	System.out.println(cont + " " + "valores positivos");
    	
    }
}


