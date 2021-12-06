package pratica_facul;

import java.util.Scanner;

public class Question02 {
       public static void main(String[]args){
             Scanner teclado = new Scanner(System.in);
             int x;
             int r;

             System.out.println("");
             System.out.print("Informe um número: ");
             x = teclado.nextInt();
             
             r = (int) Math.pow(x,2);

             System.out.println("O quadrado desse número é: "+r);


             teclado.close();
   }     
}

/*

Faça um programa que receba um número e 
retorne o seu valor elevado ao quadrado

*/