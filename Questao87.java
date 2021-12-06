package pratica_facul;

public class Questao13 {

       public static void main(String[]args){
              int v[] = new int[5];
              int i;

              for(i=0; i < v.length; i++){
                  v[i] = (int)(1 + Math.random() * (10-1));
              }
                    System.out.println("");
                    System.out.println("Vetor Padrão");
              for(i=0; i < v.length; i++){
                    System.out.println(v[i]);
              }
                    System.out.println("");
                    System.out.println("Vetor Invertido");
               for(i=4; i >= 0; i--){
                        System.out.println(v[i]);
              }      




    } 
}

/*

Inverter os elementos de um vetor

*/
