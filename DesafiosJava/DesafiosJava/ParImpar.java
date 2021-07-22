package DesafiosJava;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		

     Scanner ent = new Scanner(System.in);

     int num, par = 0, impar = 0,positivo=0, negativo=0;

       for(int i = 1; i <= 5; i++){

         System.out.println("Digite o " + i + "º número");

         num = ent.nextInt();

         if(num % 2 == 0){

            par++;

         } else  {

     

             impar++;

         }
         

         if (num > 0) {
 			positivo++;
 		}
 		if (num < 0) {
 			negativo++;
 		}

       }

     
       System.out.println( par + " valor(es) par(es)");
       System.out.println( impar + " valor(es) impar(es)");
       System.out.println(positivo + " valor(es) positivo(s)");
       System.out.println(negativo + " valor(es) negativo(s)");

     

 }
	}


