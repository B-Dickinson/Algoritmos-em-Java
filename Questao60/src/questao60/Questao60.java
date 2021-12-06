package questao60;

import java.util.Scanner;


public class Questao60 {

    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int v[] = new int[10];
           int i;
           int mult = 0;
           
           for(i=0; i < v.length; i++){
               System.out.print("Informe um valor: ");
               v[i] = sc.nextInt();
           }
               System.out.println("");
               System.out.println("Vetor V:");
               System.out.println("");
               
        for(i=0; i < v.length; i++){
            if (v[i] % 5 == 0){
               mult += v[i]; 
            }
               System.out.println(v[i]);
               sc.close();
        }
               System.out.println("");
               System.out.println("A soma dos multiplos = "+mult);
        
    }
}

/*

escreva um algoritmo que leia um vetor A com 10 elementos inteiros,
e faça a soma dos elementos armazenados neste vetor que são múltiplos de 5,

*/
