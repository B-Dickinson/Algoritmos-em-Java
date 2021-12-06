package pratica_facul;

public class Questao10 {

       public static void main(String[]args){
              int v[] = new int[50];
              int i; 

              // imprimir todos os valores pares de 0 até 50

              for(i=0; i < v.length; i++){
                     
                v[i] = i;
                  if ( v[i] % 2 == 0) {
                      System.out.println(v[i]);  
                  }
              }



    }
}

/*

Dado um vetor, imprimir todos os seus números 
pares

*/
