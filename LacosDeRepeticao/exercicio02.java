package br.com.generation.exercicioAula03;

import java.util.Scanner;

public class exercicio02 {

		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
	
		public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double par = 0, impar = 0, number;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite um número: ");
			number = entrada.nextDouble();
			
			if (number % 2 == 0) {
				
				par++;
				
		}
			else {
				impar++;
			}
			
		}
		
		System.out.println("O total de numeros pares são: " + par);
		System.out.println("\nO total de numeros impares são: " + impar);
		
		entrada.close();

	}

}
