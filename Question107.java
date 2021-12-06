package matematica;

public class Ex007 {

public static void main(String[]args){
       int m[][] =  new int[5][5];
       int i;
       int j;
       int somaL = 0;
       int somaC = 0;
       int somaDp = 0;
       int somaDs = 0;
       int soma = 0;
       
       for(i=0 ;  i< m.length;i++){
           for(j=0; j < m[i].length; j++){
               m[i][j] = (int)(1 + (Math.random())* (8-1));
           }
       }
               System.out.println(); 
               System.out.println("Matriz m:");
               System.out.println();

        for(i=0; i < m.length; i++){
           for(j=0; j < m[i].length; j++){
               System.out.print(m[i][j]+"\t");
           }
               System.out.println("\n");
       } 

       for(i=0; i < m.length; i++){
           for(j=0; j < m[i].length; j++){
              if(i == 4){
                  somaL += m[4][j];
              } 
           }
       } 
       for(i=0; i < m.length; i++){
          for(j=0; j < m[i].length; j++){
              if(j == 2){
                  somaC += m[i][2];
              } 
           }
       }
       for(i=0; i < m.length; i++){
            for(j=0; j < m[i].length; j++){
                if(i == j){
                    somaDp+= m[i][j];
                } 
           }
       }
       for(i=0; i < m.length; i++){
            for(j=0; j < m[i].length; j++){
                if(i + j == 4){
                     somaDs += m[i][j];
                } 
            }
       }
       for(i=0; i < m.length; i++){
            for(j=0; j < m[i].length; j++){
                soma += m[i][j];
            }
       }


              System.out.println("a) resposta: "+somaL);      
              System.out.println("b) resposta: "+somaC);   
              System.out.println("c) resposta: "+somaDp);   
              System.out.println("d) resposta: "+somaDs);
              System.out.println("e) resposta: "+soma);   
              System.out.println();   
              System.out.println();   

    }
}

/*

Escreva um algoritmo que lê uma matriz M(5,5) e calcula as somas:
a) da linha 4 de M.
b) da coluna 2 de M.
c) da diagonal principal.
d) da diagonal secundária.
e) de todos os elementos da matriz.
f) Escreva estas somas e a matriz.

*/
