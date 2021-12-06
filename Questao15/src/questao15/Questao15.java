package questao15;

import java.util.Scanner;

public class Questao15 {

   
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String nome;
          int idade;
          
          System.out.print("Nome: ");
                nome = teclado.nextLine();
          System.out.print("Idade: ");
                idade = teclado.nextInt();
                
                
                System.out.println("Nome: "+nome);
          switch (idade){
              case 5:
                  System.out.println("Infantil A");
                  break;
              case 6:
                  System.out.println("Infantil A");
                  break;
              case 7:
                  System.out.println("Infantil A");
                  break;
              case 8:
                  System.out.println("Infantil B");
                  break;
              case 9:
                  System.out.println("Infantil B");
              case 10:
                  System.out.println("Infantil B ");
                  break;
              case 11:
                  System.out.println("Juvenil A");
                  break;
              case 12:
                  System.out.println("Juvenil A");
                  break;
              case 13:
                  System.out.println("Juvenil A");
                  break;
              case 14:
                  System.out.println("Juvenil B");
                  break;
              case 15:
                  System.out.println("Juvenil B");
                  break;
              case 16:
                  System.out.println("Juvenil B");
                  break;
              case 17:
                  System.out.println("Juvenil B");
                  break;
              default:
                  System.out.println("Categoria Adulta");        
          }
          
    }
    
}

/*

Elabore um algoritmo que leia o nome e a idade de um nadador. Dada a idade do 
nadador classifica-o em uma das seguintes categorias: 

• infantil A = 5 - 7 anos 
• infantil B = 8-10 anos 
• juvenil A = 11-13 anos 
• juvenil B = 14-17 anos
• Mostrar o nome e a categoria pertencente ao nadador. 

*/
