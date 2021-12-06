package pratica_facul;

import java.util.Scanner;

public class Question01 {
      public static void main(String[]args){
            Scanner teclado = new Scanner(System.in);
            int x;
            int y;
            int soma;
            int prod;

       System.out.print("Informe um número: ");
       x = teclado.nextInt();
       System.out.print("Informe outro número: ");
       y = teclado.nextInt();

       soma = x + y;
       prod = x * y;

       System.out.println("A soma entre os números é: "+soma);
       System.out.println("O produto é: "+prod);

       teclado.close();


      }
}

/*

Faça um programa que receba dois números e 
retorne a soma e a multiplicação dos dois 
numeros.

*/
