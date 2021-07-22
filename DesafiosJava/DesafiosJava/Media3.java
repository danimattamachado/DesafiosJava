package DesafiosJava;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {
	
	
		
		  public static void main(String[] args) throws IOException {

				Scanner leitor = new Scanner(System.in);
					DecimalFormat df = new DecimalFormat("0.0");
					double N1 = leitor.nextDouble();
					double N2 = leitor.nextDouble();
					double N3 = leitor.nextDouble();
					double N4 = leitor.nextDouble();
				
					
			    double MEDIA1 = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
			        
					System.out.println("Media: " + df.format(MEDIA1));
			       
					
					if (MEDIA1 < 5) {
			        	System.out.println("Aluno reprovado.");
			        	
			        } else if (MEDIA1 >= 5 && MEDIA1<=6.9) {
			        	
			          System.out.println("Aluno em exame.");
			        	
			        	double NExame = leitor.nextDouble();
						    System.out.println("Nota do exame: " + df.format(NExame));
						    
			        	
					    	if ((NExame + MEDIA1)/2 >= 5) { 
					    	  
					    	  System.out.println("Aluno aprovado.");
					    	  
					    	} else { 
					    	 System.out.println("Aluno reprovado.");
					    	}
					    	
					    	System.out.println("Media final: " + df.format((NExame + MEDIA1)/2));
					    	 
					    	  
					    	  
					    	  	 
				        
					    	 
				    }
			        
				    
			        
				    
				    if (MEDIA1 > 7) { System.out.println("Aluno aprovado.");
				}
				
				

				}
			}

