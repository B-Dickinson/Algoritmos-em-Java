package questao37;

import java.util.Scanner;


public class Questao37 {

    
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              int vet[] = new int[10];
              int i;
              
       for(i=0; i < vet.length; i++){
              System.out.print("Informe um valor: ");
              vet[i] = sc.nextInt();
       }       
       
              System.out.println("");
              System.out.println("");
              
       for(i=0; i < vet.length; i++) {   
       if (vet[i] == 0){
              vet[i] = 1;
              System.out.println(vet[i]);
       } else {
              System.out.println(vet[i]);  
       }
       }       
        
        
              
        
    }
}

/*

Escrever um algoritmo que leia um vetor de tamanho 10 e o escreva. 
Substitua, a  seguir, todos os valores nulos (zero) deste vetor por 1
e escreva novamente o vetor.

*/