package questao28;

import java.util.Scanner;

public class Questao28 {

   
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          Scanner sc = new Scanner(System.in);
          int idade;
          int i = 1;
          float altura,peso;
          int qtd = 0;
          int qtd_altura = 0;
          int qtd_pena   = 0;
          float soma_altura  = 0;
          float media_altura = 0;
          float porcent = 0;
          String nome;
          
          
          
    do {      
          
          System.out.print("Nome: ");
          nome = teclado.nextLine();
          
          System.out.print("Idade: ");
          idade = sc.nextInt();
          
          System.out.print("Altura: ");
          altura = sc.nextFloat();
          
          System.out.print("Peso: ");
          peso = sc.nextFloat();
     
          
          
    if (idade > 50)                        {
        qtd++;
        
    } else if ((idade >=10) && idade <= 20){
        qtd_altura++;
        soma_altura +=  altura;
        media_altura = (soma_altura / qtd_altura);
        
        
    } else if (peso < 40)                  {
        qtd_pena++;
        porcent = (float)(qtd_pena * 0.01);
        
    }
        i++;
    } while (i <= 15) ;   

        
        System.out.println("Quantidade de pessoas com mais de 50 anos: "+qtd);
        System.out.println("");
                
        System.out.printf("Média das alturas das pessoas com idade entre 10 e 20 anos: %.2f \n",media_altura);
        System.out.println("");
        
        System.out.println("Porcentagem de pessoas com peso inferior à 40kg: "+(int)(porcent*100)+"%");
        System.out.println("");
    
    
    }    
}

/*

Faça um algoritmo que receba a idade, a altura e o peso de 15 pessoas. Calcule e imprima:

a) a quantidade de pessoas com idade superior a 50 anos;

b) a média das alturas das pessoas com idade entre 10 e 20 anos;

c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.


*/