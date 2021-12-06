package questao68;

import java.util.Arrays;

public class Questao68 {
    
    public static int[] vetor(int x[], int y[]){
           int z[] = new int[101];
           for(int i=0; i < x.length;i++){
               z[i] = (x[i] + y[i]);   
           }
               return z;
    }

    public static void main(String[] args) {
        try{
        
           int v1[] = new int[100];
           int v2[] = new int[100];
           int v3[] = new int[101];
           int i;
           
           Arrays.fill(v1,10);
           Arrays.fill(v2,2);
         
           v3 = vetor(v1,v2);
           
               System.out.print("v1 = ");
           for(i=0; i < v1.length;i++){
               System.out.print(v1[i]+" ");
           }
               System.out.println("");
               System.out.print("v2 = ");
           for(i=0; i < v2.length;i++){
               System.out.print(v2[i]+" ");
           }
               System.out.println("");
               System.out.println("--------------------");
               System.out.print("v3 = ");
           for(i=0; i < v1.length;i++){
               System.out.print(v3[i]+" ");
           }    
               System.out.println("");
               System.out.println("");
               System.out.println("");
               System.out.println(v3[101]);
        }catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Posição de vetor inexistente");
        }    

    }
}


/*

Faça uma subrotina que receba dois vetores V1(100) e V2(100) em que cada posição 
contem um dígito e retorne V3(101) com a soma dos números nos vetores.


V1 = 0 0 0 3 2 1
V2 = 0 0 4 7 3 2
-----------------------
V3 = 0 0 5 0 5 3


*/