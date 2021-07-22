package DesafiosJava;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PreenchimentoVetor {

	
		public static void main(String[] args) throws IOException {
			 
			 
			 Scanner scan = new Scanner(System.in);
	
   double n = scan.nextDouble();
   String str = Double.toString(n);
   
	   int i;
	   int v[] = new int[100];

	   
	    
	    
DecimalFormat df = new DecimalFormat("0.0000");  

	    for (i=0; i < 100; i++) {

	    
	   System.out.println("N[" + i + "] = " + df.format(new BigDecimal(n)));
	      n /= 2;
	     
	        
	  
	
	     
	    }

	   }

	}