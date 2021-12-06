package atividade;

import java.util.Scanner;

public class Questao04 {
    
      public static void main(String[]args){
             Scanner teclado = new Scanner(System.in);
             int x;
             
             System.out.print("Digite um número: ");
             x = teclado.nextInt();

        if (x % 2 == 0){
             System.out.println("Número Par"); 
        } else {
             System.out.println("Número Ímpar"); 
        }   



        teclado.close();

    }
}
    
/*

Faça um algoritmo para receber um número qualquer 
e informar na tela se é par ou ímpar.


*/