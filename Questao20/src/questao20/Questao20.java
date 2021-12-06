package questao20;

import java.util.Scanner;


public class Questao20 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           Scanner sc = new Scanner(System.in);
           int q;
           int i = 1;
           float pr;
           float produto;
           float tot = 0;
           String nome;
          
           while (i <= 45){
               
                System.out.print("Nome produto("+i+"): ");
                nome = teclado.nextLine();
                System.out.print("Quantidade: ");
                q = sc.nextInt();
                System.out.print("Preço: ");
                pr = sc.nextFloat();
                
                produto = (q * pr);
                tot += produto;
                i++;
           }
               System.out.printf("Total à pagar: R$ %.2f \n",tot);
        } 
    }
    

/*

Escreva um algoritmo que leia a quantidade (Q) e o preço (PR) de 45 produtos diferentes, 
comprados por uma empresa, e apresente o total gasto por ela.

*/