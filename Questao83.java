package pratica_facul;

import java.util.Scanner;

public class Questao09 {

       private static Scanner sc;

    public static void main(String[]args){
             sc = new Scanner(System.in);       
             int v[] = new int[15];
             int i;
             int x;  
             int p; 

             /*
             
                Como a questao não pediu um tamanho específico
                criei um vetor de tamanho 15 e atribuí valores
                aleatórios a ele. 
                
            */

             for(i=0; i < v.length ; i++){
                     v[i] = (int)(1 + Math.random() * (500-1));
             }   
                     System.out.println("");
                     System.out.println("Vetor:");
                     System.out.println("");

             for(i=0; i < v.length; i++){
                     System.out.println(v[i]);
             }        
                    
                     System.out.println("");   
                     System.out.println("");   

                     System.out.print("Digite um número para saber se existe no vetor:  ");
                     x = sc.nextInt();
                     System.out.println("");

                     p = 0;
                     

             for(i=0; i < v.length ; i++) {
                if (x == v[i]) {
                    p = i;
                } 
                    System.out.println(v[i]);
             }   
                    System.out.println("");
                    System.out.println("");

                if( p == 0){
                    System.out.println("Valor não encontrado");
                }  else if (p >= 1) {  
                    System.out.println("Valor "+x+" encontrado na posição: "+p);
                }              


                
    } 
}                  

/*

Dado um vetor de inteiros, verificar se um número 
informado pelo usuário está no vetor

*/