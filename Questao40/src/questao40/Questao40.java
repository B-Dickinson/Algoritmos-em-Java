package questao40;

import java.util.Scanner;


public class Questao40 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[25];
           int i;
           
    for(i=0; i < v.length; i++){
           System.out.print("Informe um valor: ");
           v[i] = teclado.nextInt();
    }       
           System.out.println("");
           System.out.println("Ordem normal:");
           System.out.println("");
           
    for(i=0; i < v.length;i++){
           System.out.println(v[i]);
    }       
           System.out.println("");
           System.out.println("Ordem contrária:");
           System.out.println("");
    for(i=24; i >= 0; i--){
           System.out.println(v[i]);
    }       
            
           
           
           
    }
}

/*

Faça um algoritmo que leia 25 valores e os escreva na ordem contrária à que foram 
digitados.

*/