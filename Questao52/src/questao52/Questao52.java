package questao52;

import java.util.Scanner;

public class Questao52 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int m[][] = new int [5][5];
           int l;
           int c;
           int sl[] = new int[5];
           int sc[] = new int[5];
           int i;
           int somal = 0;
           int somac = 0;
           
           for(l=0; l < m.length;l++){
               for(c=0; c < m[l].length;c++){
                   m[l][c] = (int)(1 + Math.random() * (9-1));
               }
           }
                   System.out.println("");
                   System.out.println("Matriz");
                   System.out.println("");
           for (l=0; l < m.length;l++){
               for (c=0; c < m[l].length ; c++){
                            sl[l] += m[l][c];
                            sc[c] += m[l][c];
                            System.out.print(m[l][c]+" ");
                       }
                            System.out.println();
                   }
           
                   System.out.println();
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Soma das linhas");
                   
                   for(l=0; l < sl.length;l++){
                       System.out.println(sl[l]);
                   }
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Soma das colunas: ");
                   for(c=0;c < sc.length;c++){
                       System.out.println(sc[c]);
                   }
             
           
    }
}

/*

Escrever um algoritmo que lê uma matriz M(5,5) e cria 2 vetores SL(5), SC(5) que 
contenham respectivamente as somas das linhas e das colunas de M. Escrever a matriz 
e os vetores criados.


*/