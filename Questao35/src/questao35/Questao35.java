package questao35;

import java.util.Arrays;
import java.util.Scanner;


public class Questao35 {

    
    public static void main(String[] args) {
           Scanner leia = new Scanner(System.in);
           int v[] = new int[10];
           int x;
           int i;
           int posicao;
           
           for(i=0; i < v.length;i++){
               System.out.print("Informe um valor: ");
               v[i] = leia.nextInt();
           }
           
               System.out.println("");
               System.out.print("Diga um número no qual deseja saber a posicao: ");
               x = leia.nextInt();
           
               posicao = Arrays.binarySearch(v, x);
           
               System.out.println("");
           for(i=0;i < v.length; i++){
               System.out.println(v[i]);
           }
           System.out.println("");
           System.out.println("Encontrei o valor: "+ x +" na posição "+posicao);
        
    }
}

/*

Faça um programa que leia um vetor de 10 posições e em seguida um valor X
qualquer. Seu programa deverá fazer uma busca do valor de X no vetor lido e informar a 
posição em que foi encontrado ou se não foi encontrado.

*/
