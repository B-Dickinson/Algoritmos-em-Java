package pratica_facul;

import java.util.Scanner;

public class Questao07 {

       public static void main(String[]args){
                Scanner teclado = new Scanner(System.in);

                int i;
                float v[] = new float[3];
                float soma = 0;
                float media = 0;

                for (i=0; i < 3;i++){
                    System.out.print("Informe a nota: ");
                    v[i] = teclado.nextFloat();
                    soma += v[i];
                    media = soma / 3;
                    teclado.close();
                } 

                if (media > 6){
                    System.out.printf("Aluno aprovado com média: %.2f ",media); 
                } else {
                    System.out.printf("Aluno reprovado com média: %.2f ",media);  
                }

         
       } 
    
}

/* 

Calcule a média aritmética de 3 notas e imprima o 
valor da média e a mensagem “aprovado”, caso a 
média seja superior a 6 e “reprovado” caso seja 
menor que 6

*/