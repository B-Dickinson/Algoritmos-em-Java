package questao45;

import java.util.Scanner;


public class Questao45 {

  
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in); // ler nomes
           Scanner sc = new Scanner(System.in); //  ler números
           int qtd; // quantidade de alunos
           int qtd_aprovados = 0;
           int qtd_recuperacao = 0;
           int qtd_reprovados = 0;
           int i; // contador
           int n; // contador de notas
           float nota[] = new float[6];
           float soma = 0;
           float media = 0;
           
                  System.out.print("Quantidade de alunos existentes na turma: ");
                  qtd = sc.nextInt();
                  System.out.println("");
                  
           // Definiçao de vetores //
                  String nome_aluno[] = new String[qtd];
           // inicio       
           
           for (i=0; i < nome_aluno.length;i++){
                  System.out.print("Nome do aluno "+(i+1)+": ");
                  nome_aluno[i] = teclado.nextLine();
           for (n=0; n < nota.length; n++){
                  System.out.print("Nota("+(n+1)+"): ");
                  nota[n] = sc.nextFloat();
                  
                  
                  soma += nota[n];
                  media = soma / 6;  
           }
           
           if (media >= 7){
                  qtd_aprovados++;      
                  System.out.println("Aluno: "+nome_aluno[i]+" aprovado com média: "+media);       
           } else if((media >= 5) && media < 7){
                  qtd_recuperacao++;
                  System.out.println("Aluno: "+nome_aluno[i]+" de recuperação por média: "+media);
           } else if(media < 5){
                  qtd_reprovados++;
                  System.out.println("Aluno: "+nome_aluno[i]+" reprovado com média: "+media);
           }
               soma = 0;
               media = 0;
               
               System.out.println("");
               System.out.println("");
           }
               System.out.println("");
               System.out.println("Total de Aprovados: "+qtd_aprovados);
               System.out.println("Total de Recuperação: "+qtd_recuperacao);
               System.out.println("Total de Reprovados: "+qtd_reprovados);
               
           
           
           
           
           
    }
}

/*

Dado Nome e notas ( total de 6 ) de n alunos, faça um algoritmo que: 
a) Imprima Nome e média dos alunos aprovados. Média > = 7.0.
b) Imprima Nome e média dos alunos em recuperação. 5.0 >= Média <7.0.
c) Imprima Nome e média dos alunos reprovados. Média <5.0.
d) Total de alunos aprovados, em recuperação e reprovados.

*/