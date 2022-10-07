package Desafio2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
	    Scanner leitura = new Scanner(System.in);
	    int Soma = 0;
	

		for (int i = 0; i < 4 ; i++ ) {
			//efetuando a soma
			Integer ValorNum = Integer.valueOf(leitura.nextLine());
			Soma += ValorNum;
		}

		//Comando de saída para o valor das somas:
		System.out.println("Valor das somas: "+ Soma);
	
	}
}

