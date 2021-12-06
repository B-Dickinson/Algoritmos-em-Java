package questao32;

import java.util.Scanner;


public class Questao32 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           Scanner sc = new Scanner(System.in);
           float sal_novo = 0;
           float sal;
           float gastos = 0;
           float reajuste = 0;
           String nome;
    do {       
           
           System.out.print("Nome: ");
           nome = teclado.nextLine();
           System.out.print("Salário: ");
           sal = sc.nextFloat();
        
        
    if (sal < 500) {
           reajuste = (float)(sal * 0.15);
           sal_novo = sal + reajuste;
    } else if ((sal >= 500) && (sal <= 1000)) {
           reajuste = (float)(sal * 0.1);
           sal_novo = sal + reajuste;
    } else if (sal > 1000) {
           reajuste = (float)(sal * 0.05);
           sal_novo = sal + reajuste;
    }
           System.out.printf("Salário novo: R$ %.2f",sal_novo);
           gastos += reajuste;
           System.out.println("");
           System.out.println("");
     
    } while(sal > 0); 
    
    if (sal <= 0) {
           System.out.println("< Programa encerrado >");
    }
           System.out.println("");
           System.out.println("");
           System.out.printf("A empresa gastou R$ %.2f com as novas remunerações \n",gastos);          
    }
}

/*

Construa um algoritmo que calcule o novo salário (SAL_NOVO) para cada um dos funcionários 
da empresa.

Considere que o funcionário deverá receber um reajuste de 15% caso seu salário 
(SAL) seja menor que 500. 

Se o salário for maior ou igual a 500, mas menor ou igual a 1000, 
o  reajuste deve ser de 10%.

Caso o salário seja maior que 1000, o reajuste deve ser de 5%.

O algoritmo deve parar quando for digitado um salário (SAL) com valor negativo, ou seja, 
inválido. Além disso, ao final, o algoritmo deve apresentar quanto será gasto a mais pela 
empresa com esses aumentos.


*/