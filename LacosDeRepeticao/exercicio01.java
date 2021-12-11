package br.com.generation.exercicioAula03;

public class exercicio01 {
	/*Informar todos os números de 1000 a 1999 que quando divididos por 11
	  obtemos resto = 5.
	*/

	public static void main(String[] args) {
	
		
		for(int num1 = 1000; num1 <= 1999; num1++ ) {
			
			
			if(num1 % 11 == 5) {
				
			
				System.out.println("\n" + num1 + " / 11 = " + (num1 / 11) + " com resto " + (num1 % 11));
			}
		
		}
		
	}

}
