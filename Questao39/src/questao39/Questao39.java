package questao39;

import java.util.Scanner;


public class Questao39 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[20];
           int i;
           int qtd = 0;
           
    for(i=0; i < v.length; i++){
           System.out.print("Informe um valor: ");
           v[i] = teclado.nextInt();
    }   
           System.out.println("");
           System.out.println("");
           System.out.println("");
           
    for(i=0; i < v.length; i++){
    if (v[i] >= 0){
           qtd++;  
           System.out.println(v[i]);      
    } 
           
    }    
           System.out.println("Existem "+qtd+" números positivos no vetor."); 
        
           
          
           
           
    }  
}


/*

Escrever um algoritmo que leia um vetor com 20 posições de números inteiros e mostre 
somente os valores positivos. O algoritmo também deverá mostrar quantos números 
positivos existem no vetor.


*/