package questao41;

import java.util.Scanner;


public class Questao41 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v1[] = new int[10];
           int v2[] = new int[10];
           int v3[] = new int[10];
           int i;
           
           System.out.println("Vetor 1:");
           System.out.println("");
    for(i=0; i < v1.length; i++){
           System.out.print("Informe um valor: ");
           v1[i] = teclado.nextInt();
    }       
           System.out.println("");
           System.out.println("Vetor 2:");
           System.out.println("");
           
    for(i=0; i < v2.length;i++){
           System.out.print("Informe um valor: ");
           v2[i] = teclado.nextInt();
    }       
           // vetor 3: 
    for(i=0; i < v3.length;i++){
           v3[i] = v1[i] * v2[i];
    }
           System.out.println("");
           System.out.println("Vetor Resultante:");
           System.out.println("");
    for(i=0; i < v3.length;i++){
           System.out.println(v3[i]);
    }       
           
           
           
           
           
           
           
    }
}

/*

Escreva um algoritmo que leia dois vetores de 10 posições e faça a multiplicação dos 
elementos de mesmo índice, colocando o resultado em um terceiro vetor. Mostre o vetor 
resultante.


*/