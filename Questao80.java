package pratica_facul;


public class Questao06 {

       public static void main(String[]args){
              int m[] = new int [100];
              int soma = 0;
              int i;


              for(i=0; i < 100;i++){
                       m[i] = i;
                }

                        System.out.println("");
                        System.out.println("");

               for(i=0; i < 100;i++){
                       if((m[i] % 3 == 0) && m[i] % 5 ==0) {
                             soma += m[i];
                       }
                    }       
                             System.out.println("");
                             System.out.println("A soma é: "+soma);


    }

}

/* Imprimir a soma de todos os números múltiplos de 
   3 e de 5 menores que 100 */