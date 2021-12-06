package questao12;

import java.util.Scanner;


public class Questao12 {

    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String nome;
          float preco,precofab,pf,ir;
          
          System.out.print("Nome do automóvel: ");
                nome = teclado.nextLine();
          System.out.print("Valor do automóvel: ");
                precofab = teclado.nextFloat();
          
                pf = (float)(precofab * 0.45);
                ir = (float)(precofab * 0.28);
                preco = (precofab + pf + ir);
          
          System.out.println("Nome do automóvel: "+nome);
          System.out.printf("Preço final: R$ %.2f \n",preco);
    }
    
}

/* 

O preço de um automóvel é calculado pela soma do preço de fábrica com o 
preço dos impostos (45% do preço de fábrica) e a percentagem do revendedor (28% do 
preço de fábrica).

Faça um algoritmo que Leia o nome do automóvel e o preço de 
fábrica e escreva o nome do automóvel e o preço final.


*/