package questao30;

import java.util.Scanner;

public class Questao30 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in); 
           Scanner sc = new Scanner(System.in);
           String nome ;
           String r;
           int ht ;
           float vh;
           float sal_bruto;
           float sal_liquido;
           float inss;
           float ir = 0;
           
    do {
        
       
           System.out.print("Nome do funcionário: ");
           nome = teclado.nextLine();
           System.out.print("Horas trabalhadas: ");
           ht = sc.nextInt();
           System.out.print("Valor da hora trabalhada: ");
           vh = sc.nextFloat();
           System.out.println("");
           
           sal_bruto = (ht * vh);
           inss = (float)(sal_bruto * 0.11);
           sal_bruto -= inss; 
           
    if (sal_bruto <= 900){
           System.out.println("Isento de Imposto de Renda.");
    }else if ((sal_bruto > 900) && sal_bruto <= 1800){
           System.out.println("Alíquota de 15% - Deduzir 135 R$");
           ir = 135; 
    }else if (sal_bruto > 1800){
           System.out.println("Alíquota de 27,7% - Deduzir 360 R$"); 
           ir = 360 ;
    }      
           sal_liquido = sal_bruto - ir; 
           
           System.out.println("-");
           System.out.println("-");
           System.out.println("-");
           System.out.printf(nome+". Seu salário líquido é: R$ %.2f \n",sal_liquido);
           System.out.println("");
           System.out.println("");
           System.out.println("");
           
           System.out.println("Deseja continuar? [S / N] ");
           r = sc.next();
           
    } while(r.equals("S")|| r.equals("s"));
           
            
    
    
    }
    
}

/*

Elaborar um algoritmo que leia as informações de: horas trabalhadas (HT), valor da hora 
trabalhada (VH). 

Calcule e apresente o salário líquido dos empregados da empresa, baseado 
nas tabelas abaixo. 

OBS: Salário Líquido = Salário Bruto – INSS – Imposto de Renda

a) INSS = 11% do salário bruto

b) Imposto de Renda  após descontar o INSS usar esse valor e ler a alíquota do imposto de 
renda na tabela abaixo


|Salário Bruto – INSS |   Alíquota |  Deduzir |
|Até $900             |   Isento   |          |
|                     |            |          |   
|De $900 até $1800    |    15%     |  $135    |  
|Mais que $1800       |    27,5%   |  $360    |      


Não é conhecido o número de funcionários da empresa. Ao final de cada cálculo,
o algoritmo deve perguntar se a pessoa deseja calcular o salário de outro funcionário.
Caso a resposta  seja negativa, o algoritmo deve parar.



*/