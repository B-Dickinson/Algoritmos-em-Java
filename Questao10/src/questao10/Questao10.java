package questao10;

import java.util.Scanner;


public class Questao10 {

    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          Scanner sc = new Scanner(System.in);
          int idade;
          float salb,rea,grat,saltot;
          String nome,cargo;
          
          System.out.print("Nome do funcionário: ");
          nome = teclado.nextLine();
          System.out.print("Idade: ");
          idade = teclado.nextInt();
          System.out.print("Cargo: ");
          cargo = sc.nextLine();
          System.out.print("Salário Bruto: ");
          salb = teclado.nextFloat();
          System.out.println("");
          
          rea =(float)( salb * 0.38);
          grat =(float)( salb * 0.2 );
          salb += (rea + grat);
          saltot = (float) salb - (float)(salb * 0.15);
          
          System.out.println("Nome do funcionário: "+nome);
          System.out.println("Idade: "+idade+" anos");
          System.out.println("Cargo: "+cargo);
          System.out.printf("Salário Bruto: R$ %.2f \n",salb);
          System.out.printf("Salário Líquido: R$ %.2f \n",saltot);
                  
    } 
}

/* 

Ler as seguintes informações de um funcionário: Nome, idade cargo e o seu salário 
bruto considerem: 
a) O salário bruto teve um reajuste de 38%. 
b) O funcionário receberá uma gratificação de 20% do salário bruto. 
c) O Salário total é descontado em 15% 
E escrever os seguintes resultados: 
Imprimir nome, idade e cargo. Imprimir o salário bruto.
Imprimir o salário líquido.

*/
