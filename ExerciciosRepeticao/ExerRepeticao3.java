package turma29;

import java.util.Scanner;

public class ExerRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int idade,  anos21=0, anos50=0 ;
		
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\n Entre com a idade: ");
		 idade = leia.nextInt();
		 
		 while(idade!=-99)
		 {
			 if(idade<21) 
			 {
				 anos21++; 
			 }	 
				 
			 else if (idade>50)
			 {
				 anos50++;
			 }
			 
			 else {
				 System.out.print("\n Idade fora do escopo");
			 }
			 
			 System.out.println("\n Entre com a idade: ");
			 idade = leia.nextInt();
			 
         }  
		 
		 System.out.println("\n Quantidade de Pessoas com  menos de 21: "+anos21);
		 System.out.println("\n Quantidade de Pessoas acima de 50: "+anos50);
		 }
	}


