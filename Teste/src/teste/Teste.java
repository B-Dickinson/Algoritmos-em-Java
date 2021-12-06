/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Bruce
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int m[][] = new int[7][4];
       int i;
       int j;
       int menor;
       int posicaoL;
       int posicaoC;
       
       for(i=0; i < m.length;i++){
           for(j=0; j < m[i].length; j++){
               m[i][j] = (int)(1 + (Math.random()) * (8-1));
           }
       }
               System.out.println("");
               System.out.println("Matriz M:");
               System.out.println("");
               
               menor = m[0][0];
               posicaoL = 0;
               posicaoC = 0;
               
        for(i=0; i < m.length; i++){
            for(j=0; j < m[i].length;j++){
                
                if(m[i][j] < menor){
                   menor = m[i][j];
                   posicaoL = i;
                   posicaoC = j;
                }
                
                System.out.print(m[i][j]+"\t");
            }
                System.out.println("\n");
        }       

                System.out.println("");
                System.out.println("O menor valor da Matriz é: "+menor);
                System.out.println("");
                System.out.println("Este valor está localizdo na linha: "+posicaoL+" coluna: "+posicaoC);
    }
    
}

/*

Escrever um algoritmo para ler uma matriz (7,4) contendo valores inteiros (supor que 
os valores são distintos). Após, encontrar o menor valor contido na matriz e sua posição.

*/
