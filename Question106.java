package matematica;

public class Ex006 {

public static void main(String[]args){
       int m[][] = new int[7][4];
       int i;
       int j;
       int menor;
       int pl;
       int pc;
       
       for(i=0; i < m.length; i++){
           for(j=0; j < m[i].length; j++){
               m[i][j] = (int)(1 + (Math.random()) * (9 - 1));
           }
       }
               System.out.println();
               System.out.println("Matriz m:");
               System.out.println();

               menor = m[0][0];
               pl = 0;
               pc = 0;

        for(i=0; i < m.length; i++){
            for(j=0; j < m[i].length; j++){
                if(m[i][j] < menor){
                    menor = m[i][j];
                    pl = i;
                    pc = j;
                }
                    System.out.print(m[i][j]+"\t");              
            }
                    System.out.println("\n");
        }        
                    System.out.println(); 
                    System.out.println("O menor valor dessa matriz é: "+menor+" localizado na linha: "+pl+" coluna: "+pc); 

   }        
}

/*

Escrever um algoritmo para ler uma matriz (7,4) contendo valores inteiros (supor que 
os valores são distintos). Após, encontrar o menor valor contido na matriz e sua posição.

*/