package DesafiosJava;
import java.io.IOException;
import java.util.Scanner;
		
public class Idades {

				
		    public static void main(String[] args) throws IOException {
		        
		        Scanner leitor = new Scanner(System.in);
		        System.out.println("entre com um numero");
		       
int cont = 0;
double soma = 0;
int n = 0;

while (n >= 0) {
    n = leitor.nextInt();

    if (n >= 0) { 
        soma = soma + n;
        cont++;
    }
}

double media;

if(cont == 0) {
  media = 0;
}else{
  media = soma / cont;
}

System.out.println(String.format("%.2f", media));
}

}
