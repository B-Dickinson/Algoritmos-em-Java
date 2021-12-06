package questao31;

import java.util.Scanner;


public class Questao31 {

    
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
                 String r;
                 float pe;
                 int cp;
                 float soma = 0;
                 float total = 0;
                 
    do {
          System.out.print("Preço da etiqueta: ");
          pe = teclado.nextFloat();
                  
          soma += pe;
          
          System.out.println("Deseja adicionar mais produtos? [S / N]");
          r = teclado.next();
        
    } while(r.equals("S") || r.equals("s"));  
    
          System.out.println(" ------------------------------------------------");
          System.out.printf("  Total: R$ %.2f |    Forma de pagamento: \n", soma);
          System.out.println(" ------------------------------------------------");
          System.out.println("     1         | À vista em dinheiro ou em cheque");
          System.out.println("     2         | À vista com cartão de crédito   ");
          System.out.println("     3         | Parcelado em 2x                 ");
          System.out.println("     4         | Parcelado em 3x                 ");
          System.out.println(" ------------------------------------------------");
          
          System.out.print("Escolha a forma de pagamento: ");
          cp = teclado.nextInt();
          
    switch (cp){
          case 1:
                 total = soma - (float)(soma * 0.1);  
          break;
          case 2:
                 total = soma - (float)(soma * 0.05);
          break; 
          case 3:
                 total += (soma / 2);
          break;
          case 4:
                 total = (soma / 3) + (float)(soma * 0.1);
          break;
          default:
                 System.out.println("Forma de pagamento inválida");
    }      
    
    if (cp == 1){
          System.out.printf("Valor à pagar: R$ %.2f \n",total);
    } else if (cp == 2){
          System.out.printf("Valor à pagar: R$ %.2f \n",total);
    } else if (cp == 3){
          System.out.printf("Total: R$ %.2f  em 2 meses. \n",total);
    } else if (cp == 4){
          System.out.printf("Total: R$ %.2f em 3 meses. \n",total);
    }   
          
          
          
          
          
          
          
    }
}

/*

Construa um algoritmo que calcule e apresente o total da compra realizada pelo cliente em 
uma loja. São fornecidos para o algoritmo, o preço da etiqueta (PE) de cada um dos produtos 
comprados e, com a compra encerrada, a condição de pagamento escolhida pelo cliente (CP). 

Utilize para os cálculos a tabela de condições de pagamento a seguir:

 ----------------------------------------------------------------------------------------
| Código da condição de pagamento   |              Condição de pagamento                 | 
|         1                         | À vista em dinheiro ou cheque, com 10% de desconto |
|         2                         | À vista com cartão de crédito, com 5% de desconto  |
|         3                         | Em 2 vezes, preço normal de etiqueta sem juros     | 
|         4                         | Em 3 vezes, preço de etiqueta com acréscimo de 10% |
 ----------------------------------------------------------------------------------------        

Uma compra pode ser composta por mais do que um produto, portanto, deve ser indicado 
para o algoritmo quando a compra deve ser encerrada (escolha a forma que desejar).


*/