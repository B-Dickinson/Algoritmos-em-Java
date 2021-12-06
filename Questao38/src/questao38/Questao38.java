package questao38;

import java.util.Scanner;


public class Questao38 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[20];
           int par = 0;
           int impar = 0;
           int i;
           float soma_impar = 0;
           float media_impar = 0; 
           
           
           
    for(i=0; i < v.length; i++){
           System.out.print("Informe um valor: ");
           v[i] = teclado.nextInt();
    }          
           System.out.println("");
           System.out.println("");
           System.out.println("");
           
    for(i=0; i < v.length;i++){
    if (v[i] % 2 == 0){
           par++; 
    } else {
           impar++;
           soma_impar += v[i];
           media_impar = soma_impar / impar;
    }   
           System.out.println(v[i]);
    }       
           System.out.println("");
           System.out.println("Existem "+par+" números pares.");
           System.out.println("A média dos números ímpares é = "+(float)media_impar);
           
           
           
           
    }
}


/*
Escreva um algoritmo que leia e mostre um vetor de 20 elementos inteiros. A seguir, o 
algoritmo deverá contar quantos valores pares existem no vetor. Além disso, escreva a 
média dos números ímpares do vetor
*/