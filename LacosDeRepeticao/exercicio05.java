package br.com.generation.exercicioAula03;

import java.util.Scanner;
	
	/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
	 */

public class exercicio05 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
        int numero, soma = 0;
        
        System.out.print("Digite um n�mero a ser somado: ");
        numero = entrada.nextInt();
        soma = soma + numero;

        do {
        	System.out.print("Digite outro n�mero a ser somado: ");
            
            numero = entrada.nextInt();
            
            soma += numero;
            }
        
        while (numero != 0);
        
        System.out.print("A soma de ambos os n�meros: " + soma);
        
        entrada.close();

	}

}
