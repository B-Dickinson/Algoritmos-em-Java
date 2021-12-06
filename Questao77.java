package atividade;

import java.util.Scanner;

public class Questao01{
      public static void main(String[]args){
             Scanner teclado = new Scanner(System.in);
             int n1;
             int n2;
             int maior;

             System.out.print("Informe um número: ");
             n1 = teclado.nextInt();
             System.out.print("Informe outro número: ");
             n2 = teclado.nextInt();

             maior = (n1 > n2)?n1:n2;
             
             System.out.println("O maior número é: "+maior);


    teclado.close();        

    }
}

/*
Faça um algoritmo que receba dois números e retorne 
o maior entre eles
*/