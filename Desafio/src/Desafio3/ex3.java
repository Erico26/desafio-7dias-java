package Desafio3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
	    Scanner leitura = new Scanner(System.in);
	    int Soma = 0;
	    
	    System.out.println("Digite 4 números para achar a média deles: ");
		for (int i = 0; i < 4 ; i++ ) {
			//efetuando a soma
			Integer ValorNum = Integer.valueOf(leitura.nextLine());
			Soma += ValorNum;
		}
		
		//Achar a média dos números
		double media = Soma/4; 
		//Comando de saída para o valor das somas:
		System.out.println("Valor da média: "+ media);
	
	}
}

