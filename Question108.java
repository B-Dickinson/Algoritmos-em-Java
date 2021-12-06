package matematica;

public class Ex008{


public static void main(String[]args){
       int m[][] = new int[5][5];
       int i;
       int j;
       int linha = 0;
       int coluna = 0;
       int sl[] = new int[5];
       int sc[] = new int[5];


       for(i=0; i < m.length; i++){
           for(j=0; j < m[i].length; j++){
               m[i][j] = (int)(1 + (Math.random()) * (8-1));
           }
       }
               System.out.println(); 
               System.out.println(); 
        for(i=0; i < m.length;i++){
            for(j=0; j < m[i].length;j++){
               System.out.print(m[i][j]+"\t");
            }   
               System.out.println("\n");
        }   
               System.out.println();
               System.out.println("Somatórios: ");
               System.out.println();
        for(i=0; i < m.length;i++){
            for(j=0; j < m[i].length;j++){
                   linha = i;
                   coluna = j;
               if(linha == i){
                   sl[i]+= m[i][j];
               }  
               if(coluna == j){
                   sc[j] += m[i][j];
               }
            }   
        }  
            System.out.println();
            System.out.println("sl:");
            System.out.println();
        
        for(i=0; i < sl.length;i++){
            System.out.println(sl[i]);
        }
        System.out.println();
        System.out.println("sc:");
        System.out.println();
        for(j=0; j < sl.length;j++){
            System.out.println(sc[j]);
        }



    }    
}

/* 

Escrever um algoritmo que lê uma matriz M(5,5) e cria 2 vetores SL(5), SC(5) que 
contenham respectivamente as somas das linhas e das colunas de M. Escrever a matriz 
e os vetores criados.

*/