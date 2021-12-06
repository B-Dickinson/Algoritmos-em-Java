package questao23;

import java.util.Scanner;


public class Questao23 {

   
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          float sal = 0;
          int nh;
          int i = 1;
          
          System.out.print("Nome: ");
          String nome = teclado.nextLine();
    while (i <= 30) {
          System.out.print(nome+". Quantas horas você trabalhou no ("+i+" dia): ");
          nh = teclado.nextInt();
          System.out.println("");
          sal += (10 * nh);
          i++;
    }      
    
          System.out.printf("Salário Bruto: R$ %.2f \n",sal);
      
          
          
          
          
          
    }
    
}

/*

Escreva um algoritmo que leia o número de horas trabalhadas diárias (NH) de um funcionário 
por um período de 30 dias (ele trabalhou todos os 30 dias) e apresente o salário bruto 
recebido por ele nesse período, sabendo que o valor do salário é R$ 10,00/hora trabalhada.

*/