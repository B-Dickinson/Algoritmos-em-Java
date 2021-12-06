
package questao47;

import java.util.Scanner;

public class Questao47 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int a[] = new int[10];
           int soma = 0;
           int i;
           
    for(i=0; i < a.length;i++){
           System.out.print("Informe um numero: ");
           a[i] = teclado.nextInt();
    }       
           System.out.println("");
           System.out.println("");
           
           
    for(i=0; i < a.length;i++){
        if (a[i] % 5 == 0){
             soma += a[i];
        }     
        System.out.println(a[i]);    
    }       
      
        System.out.println("A soma dos múltiplos de 5 = "+soma);
    
    
    }    
}

/*

Escreva um algoritmo que leia um vetor A com 10 elementos inteiros, e faça a soma 
dos elementos armazenados neste vetor que são múltiplos de 5.


*/