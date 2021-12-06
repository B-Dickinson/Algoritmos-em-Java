package pratica_facul;

import java.util.Scanner;

public class Question04 {
       public static void main(String[]args){
              Scanner teclado = new Scanner(System.in);  
              int x;
              int y;
              int z;
              float r;

              System.out.println("");

              System.out.print("Informe um número para x: ");
              x = teclado.nextInt();

              System.out.print("Informe um número para y: ");
              y = teclado.nextInt();

              System.out.print("Informe um número para z: ");
              z = teclado.nextInt();

              r = (float)(x + y + z) / 3;

              System.out.println("");
              System.out.printf("A média aritmética é: %.3f \n",r);
             








             teclado.close();

    }     
}

/*

Faça um programa que receba três números e 
retorne a média aritmética deles

*/