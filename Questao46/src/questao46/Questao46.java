package questao46;

import java.util.Scanner;


public class Questao46 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int a[] = new int[10];
           int b[] = new int[10];
           int c[] = new int[10];
           int soma;
           int i;
           
           
           System.out.println("Vetor A:");
           System.out.println("");
    for(i=0; i < a.length;i++){
           System.out.print("Informe um valor: ");
           a[i] = teclado.nextInt();
    }     
    
    
           System.out.println("");
           System.out.println("Vetor B:");
           System.out.println("");
    for(i=0; i < b.length;i++){
           System.out.print("Informe um número: ");
           b[i]= teclado.nextInt();
    }       
    
    
           System.out.println("");
           System.out.println("");
    for(i=0; i < c.length;i++){
           c[i] = a[i] + b[i];
           
           
           
    }       
           System.out.println("");
           System.out.println("Vetor A:");
           System.out.println("");
    for(i=0;i < a.length;i++){
           System.out.println(a[i]);
    }       
           System.out.println("");
           System.out.println("Vetor B:");
    for(i=0;i < b.length;i++){
           System.out.println(b[i]);
    }       
           System.out.println("");
           System.out.println("Vetor C:");
    for(i=0;i < c.length;i++){
           System.out.println(c[i]);
    }       
        
        
        
        
        
    }  
}

/*

Escreva um algoritmo que leia dois vetores A e B cada um com 10 elementos inteiros. 
Construir um vetor C, onde cada elemento de C é a soma dos respectivos elementos em 
A e B, ou seja:C[i] = A[i] + B[i].


*/