package Desafio1;

import java.util.Arrays;

public class ex1 {

	public static void main(String[] args) {
		
		int[] Array_Num = {
				 1, 2, 3, 4};
		
		String[] Array_Palavras = {
				"Engraçado", "Felicidade", "Criatividade"
		};

		 Arrays.sort(Array_Num);
		 System.out.println("Número sorteado: "+Arrays.toString(Array_Num));
		 
		 Arrays.sort(Array_Palavras);
		 System.out.println("Número sorteado: "+Arrays.toString(Array_Palavras));
		
	}

}
