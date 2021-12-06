package questao19;

import java.util.Scanner;


public class Questao19 {


    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          float p;
          float soma = 0;
          float total = 0;
          int i = 1;
          
          do {
              System.out.print("Peso da caixa ("+i+"): ");
              p = teclado.nextFloat();
              i++;
              soma += p;
          } while (i <= 25);
          
              total += soma;
              System.out.printf("Total de Peso: (kg) %.2f \n",total);
    }
    
}

/*

Escreva um algoritmo que apresente o peso total que será carregado por um caminhão.
Sabe-se que esse caminhão carrega 25 caixas, com pesos diferentes.
Será entrada do algoritmo o  peso (P) de cada uma das caixas.

*/