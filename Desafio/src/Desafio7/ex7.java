package Desafio7;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		 Integer[] vetor = new Integer[10];
		 Integer soma = 0;
		 int i;
		 
		 System.out.println("Digite 7 números: ");
		 for ( i = 0; i < 7; i++) {
			 Integer num = Integer.valueOf(leitura.nextLine());
			 vetor[i] = num;
		
			 if(vetor[i] == 10) {
				 soma = soma + 10;
			 }
		 }
		 
		 if(soma == 30) {
			 System.out.println("Verdadeiro! O valor da soma de todos os 10 é: 30!");
		 } else {
		System.out.println("Falso! A soma total é: "+soma);
		 }
	}
}
