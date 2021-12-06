package questao57;


public class Questao57 {

   
    public static void main(String[] args) {
           int n1[][] = new int[4][6];
           int n2[][] = new int[4][6];
           int m1[][] = new int[4][6];
           int m2[][] = new int[4][6];
           int l;
           int c;
           // N1
           for(l=0; l < n1.length;l++){
               for(c=0;c < n1[l].length;c++){
                   n1[l][c] = (int)(1 + Math.random() * (5 - 1)); 
               }
           }
           // N2
           for(l=0; l < n2.length;l++){
               for(c=0;c < n2[l].length;c++){
                   n2[l][c] = (int)(1 + Math.random() * (5 - 1)); 
               }
           }
           // M1
           for(l=0; l < m1.length;l++){
               for(c=0;c < m1[l].length;c++){
                   m1[l][c] = n1[l][c] + n2[l][c]; 
               }
           }
           // M2
           for(l=0; l < m1.length;l++){
               for(c=0;c < m1[l].length;c++){
                   m2[l][c] = n1[l][c] - n2[l][c]; 
               }
           }   
                   System.out.println("");
                   System.out.println("Matriz N1");
                   System.out.println("");
           for(l=0; l < m1.length;l++){
               for(c=0;c < m1[l].length;c++){
                   System.out.print(n1[l][c]+"   "); 
               }
                   System.out.println();
             }
                   System.out.println("");
                   System.out.println("Matriz N2");
                   System.out.println("");
           for(l=0; l < m1.length;l++){
               for(c=0;c < m1[l].length;c++){
                   System.out.print(n2[l][c]+"   "); 
               }
                   System.out.println();
             }
                   System.out.println("");
                   System.out.println("Matriz M1");
                   System.out.println("");
           for(l=0; l < m1.length;l++){
               for(c=0;c < m1[l].length;c++){
                   System.out.print(m1[l][c]+"   "); 
               }
                   System.out.println();
             }
                   System.out.println("");
                   System.out.println("Matriz M2");
                   System.out.println("");
           for(l=0; l < m1.length;l++){
               for(c=0;c < m1[l].length;c++){
                   System.out.print(m2[l][c]+" "); 
               }
                   System.out.println();
             }
  
    }
}

/*

Faça um algoritmo que lê duas matrizes N1[4,6] e N2[4,6] e cria uma
matriz M1  que seja a soma de ambas. E tambem, crie uma matriz M2 que seja
a diferença de N1 e N2. Escreva as matrizes lidas e calculadas.

*/
