package atividade;

import java.util.Scanner;

public class Questao06{
       
       public static void main(String[]args){
              Scanner teclado = new Scanner(System.in);
              int a;
              int b;
              int c;
              int d;
              int e;
              float media;
              
              System.out.print("Digite um número: ");
              a = teclado.nextInt();

              System.out.print("Digite um número: ");
              b = teclado.nextInt();

              System.out.print("Digite um número: ");
              c = teclado.nextInt();

              System.out.print("Digite um número: ");
              d = teclado.nextInt();

              System.out.print("Digite um número: ");
              e = teclado.nextInt();

              media = (a + b + c + d + e) / 5;
              
              System.out.println("A média aritmética = "+media);




        teclado.close();

    }
}


/*

Faça um algoritmo que leia 5 números e calcule a 
média aritmética deles.

*/