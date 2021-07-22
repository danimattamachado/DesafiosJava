package DesafiosJava;

import java.io.BufferedReader;
import java.io.Console;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorridaTartarugas {
	 public static void main(String args[]) throws IOException {
		    
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int quantidadeTartarugas;

		    do {
		      quantidadeTartarugas = Integer.parseInt(br.readLine()); //número de tartarugas

		      String tartarugas[] = br.readLine().split(" ");
		      //definimos a maior velocidade como o primeiro item no vetor(string)
		      int maiorVelocidade = Integer.parseInt(tartarugas[0]);

		      for (int i = 1; i < quantidadeTartarugas; i++) {

		        //lista que irá guardar todas as velocidades das tartarugas
		        int listaVelocidades = Integer.parseInt(tartarugas[i]);

		        // percorrer a array e identificar a maior velocidade
		        if (listaVelocidades > maiorVelocidade) {
		          maiorVelocidade = listaVelocidades;
		        }

		      }

		      if (maiorVelocidade < 10) System.out.println("1");
		      else if (maiorVelocidade > 10 && maiorVelocidade < 20) System.out.println("2");
		      else System.out.println("3");

		    } while (br.ready());
		  }
		}