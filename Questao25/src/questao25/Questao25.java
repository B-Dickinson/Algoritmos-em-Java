package questao25;

import java.util.Scanner;
public class Questao25 {

    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int soma = 0;
          float media;
          int x;
          
    do {
          System.out.print("Digite um número: ");
          x = teclado.nextInt();
    if (x > 0){
          soma += x;
    }
    
    } while (x >= 0);     
          
          System.out.println("Soma = "+soma);       
          
    }
}

/*

Escreva um algoritmo que leia vários números inteiros e positivos,
calculando ao final da  sequencia a soma e a média desses números.
A sequencia termina quando o usuário entrar  com um valor negativo
(esse valor não deve fazer parte de nenhum dos cálculos).


*/