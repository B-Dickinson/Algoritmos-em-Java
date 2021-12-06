package atividade;

import java.util.Scanner;

public class Questao05 {
  
       public static void main(String[]args){
             Scanner teclado = new Scanner(System.in);
             int a;
             int b;
             int c;
             int soma;
              
             System.out.print("Informe um número: ");
             a = teclado.nextInt();
             System.out.print("Informe outro número: ");
             b = teclado.nextInt();
             System.out.print("Informe mais um número: ");
             c = teclado.nextInt();

             soma = (c % 2 == 0)?(a + b):0;

          
             System.out.println("Resultado: "+soma);



    teclado.close();    

    }
}

/*

Faça um programa que receba três números inteiros 
(A, B e C) e retorne a soma de A + B se C for par. Senão, 
retorne zero

*/