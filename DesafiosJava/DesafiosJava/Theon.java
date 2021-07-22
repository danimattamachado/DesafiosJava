package DesafiosJava;

import java.util.Scanner;

public class Theon {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println( "entre com um numero:");
		int N = leitor.nextInt();
		int T, menor = 0, posMenor = 0;
		for (int i = 1; i <= N; i++) {
			T = leitor.nextInt();
			if (i == 1) {
				posMenor = 1;
				menor = T;
			} else if (T < menor) {
				posMenor = i;
				menor = T;
			}
		}
		System.out.println(posMenor);
    }
	
}

	


