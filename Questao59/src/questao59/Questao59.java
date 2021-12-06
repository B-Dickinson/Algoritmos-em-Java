package questao59;


public class Questao59 {

  
    public static void main(String[] args) {
           int v[]= new int[20];
           int i;
           int par = 0;
           int impar = 0;
           float somai = 0;
           float media = 0;
           
           for(i=0; i < v.length;i++ ){
              v[i] = (int)(1 + Math.random() * (30 - 1)); 
           }
              System.out.println("");
              System.out.println("Vetor V:");
              System.out.println("");
           for(i=0; i < v.length;i++ ){
               if(v[i] % 2 == 0){
                 par++;
               } else {
                 impar++;
                 somai += v[i];
                 media = somai / impar;
               }
                 System.out.println(v[i]);
           }
                 System.out.print("Existem "+par+" valores pares no vetor ");
                 System.out.println("e a média dos valores ímpares é = "+media);
        
        
        
    }
}

/*

Escreva um algoritmo que leia e mostre um vetor de 20 elementos. A seguir, o
algoritmo deverá contar quantos elementos pares existem no vetor. Alem disso,
escreva a media dos numeros impares do vetor.
 
*/
