package DesafiosJava;

import java.util.Scanner;

public class ExibindoNumerosPares {

	public static void main(String[] args) {
	 int N = 0;
	
	   Scanner ent = new Scanner(System.in);
	 
	  N = ent.nextInt();
    
 
	for (int i = 1  ; i <=N  ; i++) {
		if (i % 2 == 0){
          System.out.println(i);
      }
		
		
	}
}
}
