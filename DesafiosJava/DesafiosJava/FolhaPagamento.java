package DesafiosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FolhaPagamento {
	
	  public static void main(String[] args) throws IOException {
		  	int numero;
		  	int horas;
		  	double valor;
		  	double salario;
		  
			Scanner input = new Scanner(System.in);
			System.out.println("entre com o numero horas trabalhadas:");
		horas = input.nextInt();
      
        System.out.println("entre com o valor da  hora trabalhada:");
		valor = input.nextDouble();
		
		   System.out.println("entre com o seu numero de registro:");
		  numero = input.nextInt();

			salario = horas * valor;
			System.out.println("numero = " + numero);
			System.out.printf("SALARY = U$ %.2f", salario);

	    }
	}