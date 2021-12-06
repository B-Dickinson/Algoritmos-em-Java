package pratica_facul;

import java.util.Scanner;

public class Questao11 {

             private static Scanner sc;   
       
       public static void main(String[]args){
              sc = new Scanner(System.in);
              int v[] = new int[10];
              int i;
              
              for(i=0; i < v.length; i++) {
                    System.out.print("Informe um valor: ");
                    v[i] = sc.nextInt();
              }
              
                    System.out.println("");
                    System.out.println("Vetor: ");
                    System.out.println("");
                    

              for(i=0; i < v.length; i++){
                    System.out.println(v[i]);   
              } 





    }     
}

/*

Criar um programa para ler e armazenar o valor 
de 10 números inteiros em um vetor

*/
