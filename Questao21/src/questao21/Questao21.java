package questao21;

import java.util.Scanner;

public class Questao21 {

    
    public static void main(String[] args) {
                      Scanner teclado = new Scanner(System.in);
                      int horas;
                      int total = 0;
                      int i = 1;
                      String nome;
           
        System.out.print("Nome: ");
                      nome = teclado.nextLine();
        System.out.println("");
        
        while (i <= 30) {  
            
        System.out.print("Horas trabalhadas ( dia "+i+"): ");
                      horas = teclado.nextInt();
        System.out.println("");
            
                      i++;
                      total += horas;
        }  
        
        
        System.out.println("Total de horas trabalhadas em um mês: "+total);
    }  
}

/*

Escreva um algoritmo que leia o número de horas trabalhadas diárias (NH) de um funcionário 
por um período de 30 dias (ele trabalhou todos os 30 dias) e apresente o total de horas 
trabalhadas por ele nesse período.

*/