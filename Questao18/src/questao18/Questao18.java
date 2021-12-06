package questao18;

import java.util.Scanner;

public class Questao18 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String nome;
          int dep;
          float sal;
          
          System.out.print("Nome: ");
                 nome = teclado.nextLine();
          System.out.print("Salário: ");
                sal = teclado.nextFloat();
          System.out.print("Qtd de dependentes: ");
                dep = teclado.nextInt();
          
          if (sal < 2000 && dep > 2){
                sal = (float)(sal * 0.255) + (float)sal;
                System.out.println("Parabéns, você ganhou um bônus de 25,5% ao seu salário.");
          } else if (sal > 2000 && dep == 1){
                sal = (float)(sal * 0.15) + (float)sal; 
                System.out.println("Parabéns, você ganhou um bônus de 15% ao seu salário.");
          } else if (sal > 2000 && dep == 0){
                sal = (float)(sal * 0.075) + (float)sal;
                System.out.println("Parabéns, você ganhou um bônus de 7,5% ao seu salário.");
          } else {
                System.out.println("Você não ganhou bônus por não atender aos padrões."); 
          }
              System.out.println("");
              System.out.println("Nome do Funcionário: "+nome);
              System.out.printf("Salário: R$ %.2f \n",sal);
    }
    
}

/*

Uma empresa decide dar um aumento de 25,5 % aos funcionários cujo o salário 
é inferior a R$ 2.000,00 e tenha mais de 2 dependentes

15% para os que ganham  acima de R$ 2.000,00 e tenha um dependente

e 7,5% para os que acima e não tenham dependente.

Faça um algoritmo que leia o nome, salário e quantidade de dependentes do 
funcionário e mostre o nome e o salário do funcionário após o aumento


*/