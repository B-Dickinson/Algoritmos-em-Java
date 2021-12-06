package atividade;

import java.util.Scanner;

public class Questao03 {
    
       public static void main(String[]args){
              Scanner teclado = new Scanner(System.in); 
              String nome;
              float n1;
              float n2;
              float n3; 
              float soma;
              float media; 

              System.out.print("Nome do aluno: ");
              nome = teclado.nextLine();
              System.out.print("Primeira nota: ");
              n1 = teclado.nextFloat();
              System.out.print("Segunda nota: ");
              n2 = teclado.nextFloat();
              System.out.print("Terceira nota: ");
              n3 = teclado.nextFloat();

              soma = (n1 + n2 + n3);
              media = soma / 3;

        if (media >= 5) {
              System.out.printf("Aluno: %s está aprovado com média: %.2f",nome,media);  
        }  else {
              System.out.printf("Aluno: %s está aprovado com média: %.2f",nome,media);
        }    



    teclado.close();    

    }
}

/*

Sabendo que no Wyden a primeira e a segunda nota 
tem peso 3 e a terceira nota tem peso 4, faça um 
algoritmo que receba as três notas de um aluno e 
retorne a sua média e se ele está aprovado ou não

*/