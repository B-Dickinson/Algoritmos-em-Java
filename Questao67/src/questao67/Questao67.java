package questao67;

import java.util.Scanner;

public class Questao67 {
    
    
    public static int[][] removeLinha(int mat[][],int linha, int coluna){
           int x[][] = new int[9][9];
           int i;
           int j;
           
           for(i=0;i < mat.length;i++){
               for(j = 0; j < mat[i].length;j++){
                   mat[linha][coluna] = 0;    
            }
        }
            for(i=0; i < x.length;i++){
               for(j=0; j < x[i].length;j++){
                   if(mat[i][j] != 0){
                       x[i][j] = mat[i][j];
                   }
               }                 
        } 
               return x;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m[][] = new int[10][10];
            int nova[][] = new int[9][9];
            int l;
            int c;
            
        
        for(l=0; l < m.length;l++){
            for(c=0; c < m[l].length;c++){
                m[l][c] = 1 + (int)(Math.random() * (8-1));
            }
        } 
                System.out.println("");
                System.out.println("Matriz 10/10");
                System.out.println("");
       
        for(l=0; l < m.length;l++){
            for(c=0; c < m[l].length;c++){
                System.out.print(m[l][c]);
            }
                System.out.println();
        }        
                 
                
                
                
                
                
                
                System.out.println("");
                System.out.println("Matriz 9/9");
                System.out.println("");
                
        System.out.print("Informe a linha: ");
        l = sc.nextInt();
        System.out.print("Informe a coluna: ");
        c = sc.nextInt();
        
        nova = removeLinha(m,l,c);  
        
               System.out.println("");
               System.out.println("");
               System.out.println("");
               
        for(l=0; l < nova.length;l++){
            for(c=0; c < nova[l].length;c++){
                System.out.print(nova[l][c]);
            }
                System.out.println("");
        }       

    }
}

/*

Faça uma subrotina que receba uma matriz M(10,10), o número de uma linha L, o 
número de uma coluna C e retorne a matriz N(9,9) resultante da remoção da linha L e 
da coluna C

*/
