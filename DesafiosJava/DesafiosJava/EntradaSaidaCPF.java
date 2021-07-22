package DesafiosJava;

import java.util.Locale;
import java.util.Scanner;

public class EntradaSaidaCPF {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);
		
		String STR = sc.next();
		String A = STR.substring(0, 3);
		String B = STR.substring(4, 7);
		String C = STR.substring(8, 11);
		String D = STR.substring(12, 14);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);


		String[] cpf = new String[4]; 
		cpf = sc.nextLine().split("-");
		
		for(int i= 0; i < cpf.length; i++) {
		  System.out.println(cpf[i].replace(".","\n"));
	  }
	  
		sc.close();

	
	}
	}


