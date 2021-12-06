package questao26;

import java.util.Scanner;

public class Questao26 {

    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n1;
          int soma = 0;
          int i = 1;
    
    while (i <= 10){
          System.out.print("Informe um número: ");
          n1 = sc.nextInt();
          
    if ((n1 % 2 == 0) && n1 > 4){
          soma += n1;
    }
          i++;     
    }
    
          System.out.println("Soma = "+soma);
    
    }
}

/*

Faça um algoritmo que receba 10 números, calcule e imprima a soma dos números pares 
maiores do que 4.

*/