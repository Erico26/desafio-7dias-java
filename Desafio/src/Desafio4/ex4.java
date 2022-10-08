package Desafio4;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);
    Integer[] vetor = new Integer[10];
    
    Integer menor=9999999, maior=-99999;
    
    System.out.println("Digite 10 números: ");
    for (int i = 0; i < 10; i++) {
 
        Integer num = Integer.valueOf(leitura.nextLine());
        vetor[i] = num;
        
         if (  vetor[i] > maior) {
              maior = vetor[i];
            }
         
         if ( vetor[i] < menor) {
              menor = vetor[i];
            }
        
    }
    
    System.out.println("Maior valor = "+ (maior));
    System.out.println("Menor valor = "+ (menor));
    
    }

}