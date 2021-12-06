package questao14;

import java.util.Scanner;

public class Questao14 {

    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int a;
          
          System.out.print("Informe um valor: ");
                 a = teclado.nextInt();
          if ((a < 10)&& a % 2 == 0) {
                 System.out.println("Número Par menor que 10");
          } else if ((a < 10) && a % 2 == 1) {
                 System.out.println("Número ímpar menor que 10");
          } else {
                 System.out.println("Número fora do intervalo");
          }
    }
    
}

/*

Faça um algoritmo que leia um número qualquer. Caso o número seja par menor 
que 10, escreva ‘Número par menor que Dez’, caso o número digitado seja ímpar menor 
que 10 escreva ‘Número Ímpar menor que Dez’, caso contrário Escreva ‘Número fora 
do Intervalo’.

*/