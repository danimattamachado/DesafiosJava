package DesafiosJava;

import java.io.IOException;
import java.util.Scanner;

public class AreaDireta {

	
		 public static void main(String[] args) throws IOException {
			 
		        Scanner scan = new Scanner(System.in);
		        double soma = 0;
		        char O = scan.next().toUpperCase().charAt(0);
		          
		        double[][] Matriz = new double[12][12];
		        
		        
		        for (int i = 0; i < Matriz.length; i++) {
		        	for (int j = 0; j < Matriz[i].length; j++) {
		        		Matriz[i][j] = scan.nextDouble();
		        	}
		        }
		        
		        for (int i = 0; i < Matriz.length; i++) {
		        	for (int j = 0; j < Matriz[i].length; j++) {
		        		if (j > i && j > Matriz.length-i-1) soma += Matriz[i][j];
		        	}
		        }

		        if (O == 'M') soma /= 30;
		    	System.out.println(String.format("%.1f", soma));
		    }
			
		

	}


