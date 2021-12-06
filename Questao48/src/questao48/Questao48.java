package questao48;

import java.util.Scanner;


public class Questao48 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int a[] = new int[10];
           int i;
           float soma = 0;
           float media = 0;
           int qtd = 0;
           
    for(i=0; i < a.length;i++){
           System.out.print("Informe um número: ");
           a[i] = teclado.nextInt();
    }       
           System.out.println("");
           System.out.println("");
    for(i=0; i < a.length;i++){
        if(a[i] % 2 >= 1){
           soma += a[i];
           qtd++;
           media = soma / qtd;
        }
           System.out.println(a[i]);
    }       
           System.out.println("A média dos ímpares  é: "+media);
        
        
        
    }
}

/*

Escreva um algoritmo que leia um vetor A com 10 elementos inteiros. e calcule e 
escreva a média aritmética simples dos elementos ímpares armazenados neste vetor

*/