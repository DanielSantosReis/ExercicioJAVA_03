package br.com.generation.exercicioAula03;

import java.util.Scanner;

	/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	 nal imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	 0(zero).(DO...WHILE)
	*/

public class exercicio06 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
			
			int numero, soma = 0;
		    int contador = 0;
		    
		     do {
		    	
		    	System.out.print("Digite um n�mero: ");	       
		        numero = entrada.nextInt();
		        
		        if(numero % 3 == 0 && numero != 0) {               
		        soma += numero;
		        contador++;
		        	}       
		        }
		    
		     	while (numero != 0);
		    
		     		if (contador == 0) {
		     			System.out.println("N�mero inv�lido");
		     		} else {
		     		
		     				System.out.print("M�dia dos n�meros s�o: " + (soma / contador));
		     		}	   
		     		entrada.close();
	
		     	
		    }

}
