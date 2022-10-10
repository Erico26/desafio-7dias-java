package Desafio5;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);
    Integer[] vetor = new Integer[10];
    
    Integer menor=9999999, SegundoMenor=999999;
    
    System.out.println("Digite 10 números: ");
    for (int i = 0; i < 4; i++) {
 
        Integer num = Integer.valueOf(leitura.nextLine());
        vetor[i] = num;
                 
         if ( vetor[i] < menor) {
             menor = vetor[i];
            }  else if(  vetor[i] < SegundoMenor ) {
        	SegundoMenor =  vetor[i];
    }
    
         
    } 
    
    
    System.out.println("Menor valor = "+ (menor));
    System.out.println("Segundo menor valor = "+ (SegundoMenor));
    

}
}