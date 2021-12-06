package questao49;

import java.util.Scanner;


public class Questao49 {

    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int m [][] = new int[5][6];
           int l; 
           int c;
           float soma = 0;
           float media = 0;
           int qtd = 0;
           
           for(l=0; l < m.length;l++){
               for(c=0; c < m[l].length;c++){
                   System.out.println("Informe um valor: ["+l+","+c+"]: ");
                   // de um a 10
                   m[l][c] = (int)(1 + Math.random() * (10 - 1));
               }
           }
                   System.out.println("");
                   System.out.println("Matriz:");
                   System.out.println("");
                   
                   
               for(l=0; l < m.length;l++){
                   for(c=0; c < m[l].length;c++){
                      if (m[l][c] % 2 == 0){
                          qtd++;
                          soma += m[l][c];
                          media = soma / qtd;
                      } 
                          System.out.print(m[l][c]);
                   }
                          System.out.println();
               }  
                        
                          System.out.println("");
                          System.out.println("");
                          System.out.printf("A média dos pares = %.2f",media);
                   
    } 
}

/*

Escrever um algoritmo para armazenar valores inteiros em uma matriz (5,6). A seguir, 
calcular a média dos valores pares contidos na matriz e escrever seu conteúdo

*/