package questao11;

import java.util.Scanner;


public class Questao11 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int nh,n0;
           String nome;
           float sal,saltot,ir,inss;
           
           System.out.print("Nome do funcionário: ");
                 nome = teclado.nextLine();
           System.out.print("Número de horas trabalhadas: ");
                 nh = teclado.nextInt();
           System.out.print("Número de dependentes: ");
                 n0 = teclado.nextInt();
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 
                 sal = (nh * 12) + (n0 * 40);
                 ir = (float)(sal * 0.05);
                 inss = (float)(sal * 0.085);
                 saltot = (sal + ir + inss);
                 
                 System.out.println("Nome do Funcionário: "+nome);
                 System.out.println("Salário Bruto: R$"+sal);
                 System.out.println("Valor descontado pelo Inss: "+inss);
                 System.out.println("Valor descontado pelo Imposto de Renda: "+ir);
                 System.out.printf("Salário Líquido: R$ %.2f \n",saltot);
    }
    
}

/* 

Uma empresa tem para um determinado funcionário uma ficha contendo o 
nome, número de horas trabalhadas e o n0 de dependentes de um funcionário.
Considerando que:

a) A empresa paga 12 reais por hora e 40 reais por dependentes.
b) Sobre o salário são feitos descontos de 8,5% para o INSS e 5% para IR.

Faça um algoritmo que Leia o Nome, número de horas trabalhadas e número de 
dependentes de um funcionário. 

Após a leitura, escreva qual o Nome, salário 
bruto, os valores descontados para cada tipo de imposto e finalmente qual o 
salário líquido do funcionário.


*/