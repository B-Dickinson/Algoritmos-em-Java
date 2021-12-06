package questao29;

import java.util.Scanner;


public class Questao29 {

   
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);  
          int n1;
          
    do {
        
          System.out.print("Informe um número: ");
          n1 = teclado.nextInt();
          
    if (n1 < 0 || n1 == 1000){
          break;
    } else if (n1 % 2 == 0){
          System.out.println("Número Par");
          System.out.println("");
    } else {
          System.out.println("Número Ímpar");
          System.out.println("");
    }    
    
    
    } while (n1 != 1000);
    
    
    
  }
}

/*

Elaborar um algoritmo que leia um número e indique se ele é par ou impar. O algoritmo só 
deve levar em consideração valores positivos. Enquanto o valor digitado for diferente de 1000, 
o algoritmo deverá repetir o procedimento para verificar se o novo número é par ou impar.

*/
