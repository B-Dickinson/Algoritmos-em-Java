package prova;

import java.util.Scanner;

public class Question10 {

public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int x;
       int y;
       int maior = 0;
       int primo = 0;

       System.out.print("Informe um número: ");
       x = teclado.nextInt();
       System.out.print("Informe um valor para y: ");
       y = teclado.nextInt();

    for (int i = x; i <= y; i++) {
        	    primo = 0;
        for (int z = 1; z <= i; z++) {
        if (i % z == 0){
                primo += 1;
        }             
        }
       if (primo == 2) {
          if(i > 0){    
            maior = i;
          }    
       }else{
            primo = 0;
       }
    }  
       if(maior > 0){
            System.out.println(); 
            System.out.println("O maior número primo em um intervalo de "+x+" até "+y+" é: "+maior);      
       }else{
            System.out.println();
            System.out.println("Não existe número primo neste intervalo");
       }    

            teclado.close();
}    
    
}

/*

Faça um programa que recebe do usuário dois inteiros que representam um intervalo
inteiro fechado. Depois, calcule qual é o maior número primo desse intervalo. Se não
houver número primo no intervalo informado, o programa deve exibir 0 (zero).

*/
