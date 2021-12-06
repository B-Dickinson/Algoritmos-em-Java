package questao27;

import java.util.Scanner;


public class Questao27 {


     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           float base;
           float altura;
           float area;
           
    do {
            
           System.out.print("Informe o valor da base: ");
           base = sc.nextFloat();
           
    if ( base <= 0){
           break;
    }       
           System.out.print("Informe o valor da altura: ");
           altura = sc.nextFloat();
   
    if ( altura <= 0){
           break;
    }       
    
           System.out.println("");
           
           area = (base * altura)/2;
           
           System.out.println("A área do triângulo é: "+area);
           System.out.println("");
           
    }while( base > 0 || (altura > 0));    
        
    } 
}

/*

Faça um algoritmo para calcular a área de um triângulo. Este algoritmo não pode permitir a 
entrada de dados inválidos, por exemplo, medidas menores ou iguais a zero.


*/