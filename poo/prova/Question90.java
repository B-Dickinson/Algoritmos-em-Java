package prova;

public class Question11 {
     
    public static void main(String[] args) {

          for(int i=100; i >= 1; i--){
              if((i % 3 == 0) && (i % 5 == 0)){
                  System.out.println(i);
              }
          }
    }
    
}

/*

Faça um algoritmo que retorne os números múltiplos de 3 e 5 ao mesmo tempo,
entre 1 a 100, em ordem descrescente.

*/