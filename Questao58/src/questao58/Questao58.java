package questao58;

import java.util.Scanner;


public class Questao58 {

  
    public static void main(String[] args) {
           int v[] = new int[10];
           int i;
           int x;
           
           for(i=0;i < v.length;i++){
               v[i] = (int)(1 + Math.random() * (20 - 1));
           }

               System.out.println("");
               System.out.println("Vetor:");
               System.out.println("");
           for(i=0;i < v.length;i++){
               System.out.println(v[i]);
           }  
               System.out.println("");
               System.out.print("Buscar a posição do valor: ");
               Scanner teclado = new Scanner(System.in);
               x = teclado.nextInt();
               System.out.println("");
           for(i=0;i < v.length;i++){
               if (x == v[i]){
               System.out.println("Valor: "+v[i]+" encontrado na posicao: "+i);
               } else {
               System.out.println("Valor não encontrado.");
               break;
               }
               teclado.close();
           }
         
           
    }   
}

/*

Faça um algoritmo que leia um vetor de 10 posiçoes e em seguida um valor x qualquer
Seu programa deverá fazer uma busca do valor x no vetor lido e informar
a posição em que foi encontrado ou se não foi encontrado.

*/
