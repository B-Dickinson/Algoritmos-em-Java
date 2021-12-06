package questao43;

import java.util.Scanner;


public class Questao43 {


    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[10];
           int i;
           int menor;
           int maior;
           int p_menor;
           int p_maior;
           
           for(i=0; i < v.length;i++){
               System.out.print("Informe um número: ");
               v[i] = teclado.nextInt();
           }
               System.out.println("");
               System.out.println("");
               System.out.println("");
               
               maior = v[0];
               menor = v[0];
               p_menor = 0;
               p_maior = 0;
               
           for(i=0; i < v.length; i++){
           if (v[i] > maior){
               maior = v[i];
               p_maior = i;
           } else if (v[i] < menor) {
               menor = v[i];
               p_menor = i;
           }    
               System.out.println(v[i]);
           }
           
               System.out.println("O maior elemento do vetor é: "+maior+" na posição "+p_maior);
               System.out.println("");
               System.out.println("O menor elemento do vetor é: "+menor+" na posição "+p_menor);
           
       
    } 
}

/*

Escreva um algoritmo que leia um vetor de 80 elementos inteiros. Encontre e mostre o 
maior e o menor elemento e as suas respectivas posições.

*/