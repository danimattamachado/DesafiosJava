package DesafiosJava;

import java.io.IOException;
import java.util.Scanner;

public class Divisores {

	
		
			
		    public static void main(String[] args) throws IOException {
		        Scanner leitor = new Scanner(System.in);
		        System.out.println("entre com um numero");
		        int N = leitor.nextInt();
		        
		        for(int i = 1; i<=N; i++){
		            if(N%i==0){
		                System.out.println(i);
		            }
		        	
		        }
		    }
			
		}

	

