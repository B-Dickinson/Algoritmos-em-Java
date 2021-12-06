package atividade;

import java.util.Scanner;

public class Questao02 {
      
       public static void main(String[]args){
              Scanner leia = new Scanner(System.in); 
              int n1,n2,n3;
              int menor;
              
              System.out.print("Informe um número: ");
              n1 = leia.nextInt();
              System.out.print("Informe outro número: ");
              n2 = leia.nextInt();
              System.out.print("Informe mais um número: ");
              n3 = leia.nextInt();

        if ( n1 < n2 && n1 < n3){
              menor = n1;
        } else if (n2 < n1 && n2 < n3){
              menor = n2;
        } else {
              menor = n3;
        }   

              System.out.println("O menor número é: "+menor);


        leia.close();

    }
}

/*

Faça um algoritmo que receba três números e retorne 
o menor entre eles.

*/
