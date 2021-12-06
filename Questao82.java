package pratica_facul;

import java.util.Scanner;

public class Questao08 {

       public static void main(String[]args){
              Scanner teclado = new Scanner(System.in);
              int v2[] = new int[3];
              int dia;
              int mes;
              int ano;
              int i;
              int r2 = 0;
              

              System.out.print("Digite quantos anos você tem: ");
              ano = teclado.nextInt();
              System.out.print("Quantos meses desde que completou "+ano+" anos: ");
              mes = teclado.nextInt();
              System.out.print("Quantos dias: ");
              dia = teclado.nextInt();

              
              teclado.close();

              for(i=0; i < v2.length;i++){
                if (i == 0 ) {
                    v2[i] = ano ;
                    r2 += (v2[i] * 365); 
                }  
                if (i == 1) {
                    v2[i] = mes;
                    r2 += (v2[i] * 30);
                }
                if (i == 2) {
                    v2[i] = dia;
                    r2 += v2[i];
                }
             }

              System.out.println("");
              System.out.println("Hoje você está com "+r2+" dias de idade");




    } 
}

/* 

Ler a idade da pessoa expressa em anos, meses e 
dias e imprimir expressa apenas em dias.

*/