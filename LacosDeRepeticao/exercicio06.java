package br.com.generation.exercicioAula03;

import java.util.Scanner;

	/*Escrever um programa que receba vários números inteiros no teclado. E no
	 nal imprimir a média dos números múltiplos de 3. Para sair digitar
	 0(zero).(DO...WHILE)
	*/

public class exercicio06 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
			
			int numero, soma = 0;
		    int contador = 0;
		    
		     do {
		    	
		    	System.out.print("Digite um número: ");	       
		        numero = entrada.nextInt();
		        
		        if(numero % 3 == 0 && numero != 0) {               
		        soma += numero;
		        contador++;
		        	}       
		        }
		    
		     	while (numero != 0);
		    
		     		if (contador == 0) {
		     			System.out.println("Número inválido");
		     		} else {
		     		
		     				System.out.print("Média dos números são: " + (soma / contador));
		     		}	   
		     		entrada.close();
	
		     	
		    }

}
