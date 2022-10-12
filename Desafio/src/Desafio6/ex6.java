package Desafio6;

public class ex6 {

	public static void main(String[] args) {
	
		int[] num= {2, 4, 5, 6, 9, 11};
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				System.out.println("Pares: "+num[i]);
		} else { 
			System.out.println("Impar: "+num[i]);
		}
		
		}

	}
}