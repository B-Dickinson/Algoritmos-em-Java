package questao42;

import java.util.Scanner;


public class Questao42 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[5];
           int i;
           int menor;
           int posicao;
           
    for(i=0; i < v.length; i++){
           System.out.print("Informe um valor: ");
           v[i] = teclado.nextInt();
    }     
           System.out.println("");
           System.out.println("");
           System.out.println("");
           
           menor = v[0];
           posicao = 0;
           
    for (i=0; i < v.length;i++){
    if (v[i] < menor){
           menor = v[i];
           posicao = i;
           System.out.println(v[i]);
    } else   
           System.out.println(v[i]);
    }       
           System.out.println("");
           System.out.println("O menor valor é: "+menor+" e sua posição é: "+posicao);
           
           
           
           
           
           
           
    }
}

/*

Escrever um algoritmo que lê um vetor de tamanho 20 e o escreve na tela. Encontre, a 
seguir, o menor elemento e a sua posição no vetor e escreva:

"O menor elemento do vetor  = ... e a sua posição é ... ".

*/