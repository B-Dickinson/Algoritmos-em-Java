package atividade;

import java.util.Scanner;

public class Question09 {

       public static void main(String[]args){
              Scanner teclado = new Scanner(System.in);  
              int x;
              int i;
              int r;
              int maior = 0;
              System.out.println("Quantos números deseja digitar ? ");
              r = teclado.nextInt();
              System.out.println("");
              for(i=1; i <= r;i++){
                  System.out.print("Informe um número: ");
                  x = teclado.nextInt();
              if (maior < x){
                  maior = x;
              }
                  teclado.close();      
              }
                  System.out.println("O maior número digitado é: "+maior);
     
    }

}

/* 

Faça um algoritmo que leia um conjunto de números 
(X) e imprima o maior entre eles. 


*/
