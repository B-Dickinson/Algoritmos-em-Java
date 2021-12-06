package questao22;

import java.util.Scanner;


public class Questao22 {

    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          Scanner sc = new Scanner(System.in);
          int idade;
          int qtd = 0;
          int i = 1;
          String nome;
    while (i <= 10) {      
        
          System.out.print("Nome: ");
          nome = teclado.nextLine();
          System.out.print("Idade: ");
          idade = sc.nextInt();
          System.out.println("");
          
    if (idade >= 18){
          qtd++;   
    }     
          i++;
    }
          System.out.println("Existem "+qtd+" pessoas maiores de idade cadastradas.");
    }
    
}

/*

Escreva um algoritmo que receba a idade de 10 pessoas, calcule e imprima a quantidade de 
pessoas maiores de idade (idade >= 18 anos).

*/