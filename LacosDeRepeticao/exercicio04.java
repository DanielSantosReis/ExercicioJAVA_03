package br.com.generation.exercicioAula03;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		int idade, sexo, opcoes;
		int cont=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
		
		while(cont != 150) {
			System.out.println("Escreva sua idade: ");
			idade=entrada.nextInt();
			
			System.out.println("Escolha seu gênero: \n 1:feminino \n 2:masculino \n 3:outros ");
			System.out.println("");
			sexo=entrada.nextInt();
			
			System.out.println("Escolha uma característica psicológica: \n 1:calma \n 2:nervosa \n 3:agressiva ");
			System.out.println("");
			opcoes=entrada.nextInt();
			
			if(opcoes == 1) {
				cont2++;
			}
			if(sexo == 1 && opcoes == 2){
				cont3++;
			}
			if(sexo == 2 && opcoes == 3) {
				cont4++;
			}
			if(sexo == 3 && opcoes == 1) {
				cont5++;
			}
			if(idade > 40 && opcoes == 2) {
				cont6++;
			}
			if(idade < 18 && opcoes == 1) {
				cont7++;
			}
			cont++;
		}
		System.out.println("Número de pessoas calmas: "+ cont2 +""+ "\nNúmero de mulheres nervosas: "+ cont3
				+"\nNúmero de homens agressivos: " + cont4 +"\nNúmero de outros calmos: " + cont5
				+"\nNúmero de pessoas nervosas com mais de 40 anos: "+ cont6
				+"\nNúmero de pessoas calmas com menos de 18 anos: "+ cont7);
				
		entrada.close();
	}
}
