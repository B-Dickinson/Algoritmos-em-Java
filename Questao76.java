package atividade;

public class Questao08 {

       public static void main(String[]args){
              int i;
              int x = 0;
              for(i=0; i < 1000;i++){
                  if(i % 3 == 0){
                       x++;
                       System.out.println(i);
                  }
              }  
                      System.out.println("Existe um total de "+x+" múltiplos."); 
       
    }
    
}

/* 
Faça um algoritmo que imprima os múltiplos positivos 
de 3, inferiores a 1000
*/