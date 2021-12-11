package br.com.generation.exercicioAula03;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
			
			Scanner entrada = new Scanner(System.in);
			int idade = 0, maiorQ50 = 0, menorQ21 = 0;
			
			while(idade != -99) {
				System.out.print("Insira a idade: ");
				idade = entrada.nextInt();
				
				if(idade < 21 && idade > 0) {
					
					menorQ21++;
				} else if (idade > 50) {
					
					maiorQ50++;
				}
			}
			System.out.printf("\nMenores de 21: %d\nMaiores de 50: %d", menorQ21, maiorQ50);
			entrada.close();
		

	}

}
