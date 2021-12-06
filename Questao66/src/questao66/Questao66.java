package questao66;

import java.util.Arrays;
import java.util.Scanner;

public class Questao66 {
    
    public static int[] insere(int n,int p,int t,String nome){
           String name = nome;
           int v[] = new int[t];
           int posicao = p;
           int numero = n;
           
           Arrays.fill(v,8);
           
           for(int i=0; i < v.length;i++){
               v[posicao] = numero;
           }
               return v;
           
    }
    
    public static int[] remove(int p,int t, int v[]){
           int vet[] = new int[t]; 
           
           for(int i=0; i < v.length;i++){
               vet[i] = v[i];
               vet[p] = 0;
           }
               return vet;
    }
    
    
    
    public static void escreve(int v[], String n){
          int i;
              System.out.println("----------------------------");
              System.out.println("");
              System.out.println("Vetor "+n);
              System.out.println("");
          for(i=0;i < v.length;i++){
              System.out.println(v[i]);
          }
    }

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in); 
           int resposta;
           int escolha;
           int numero = 0;
           int posicao = 0;
           int tamanho = 0;
           String nome = "";
           int vetor[] = new int[tamanho];
           
        try{   
           
        do{   
           
           System.out.println("");
           System.out.println(" 1 - Inserir");
           System.out.println(" 2 - Remover");
           System.out.println(" 3 - Escrever na Tela");
           System.out.println(" 4 - Sair");
           System.out.println("");
           System.out.print("Escolha uma opção: ");
           escolha = sc.nextInt();
                   
                   
           switch(escolha){
               case 1:
                     System.out.print("Digite um número para ser inserido no vetor: ");
                     numero = sc.nextInt();
                     System.out.print("Qual o tamanho do vetor?: ");
                     tamanho = sc.nextInt();
                     System.out.print("Qual a posição que o número deve estar: ");
                     posicao = sc.nextInt();
                     System.out.print("Nome do vetor: ");
                     nome = sc.next();
                     
                     vetor = insere(numero,posicao,tamanho,nome);
               break;
               case 2:
                     System.out.print("Qual a posição que o número se encontra: ");
                     posicao = sc.nextInt();
                     System.out.print("Qual o tamanho do vetor?: ");
                     tamanho = sc.nextInt();
                     vetor = remove(posicao,tamanho,vetor);
               break;
               case 3:
                     escreve(vetor,nome);
               break;
               case 4:
                     System.exit(0);
               break;
               default:
                       System.out.println("Opção inválida");
           }

           
           
                       System.out.println("");
                       System.out.println("Deseja escolher outra opcao?");
                       System.out.println("1 - Sim   ||  2- Nao");
                       resposta = sc.nextInt();                             
                if(resposta >= 3){
                       System.out.println("Opção inválida");
                }   
                       System.out.println("");
                       System.out.println("");
        } while(resposta == 1);   
        } catch(Exception e){
                       System.out.println("hmmm algo deu errado, analise suas respostas");
        }
                       System.out.println("Fim");
           
   
    }
}

/*

3 - Escreva um algoritmo que apresente um menu com três opções:

1 – Inserir
2 – Remover
3 – Escrever na Tela o Vetor
4 – Sair

Quando for escolhida a opção número 1, uma subrotina chamada insere deve inserir um 
elemento (número) em um vetor. A subrotina deve receber por parâmetro o número a 
ser inserido, a posição (índice) a ser inserido, o tamanho do vetor e o nome do vetor.


Quando for escolhida a opção número 2, uma subrotina chamada remove deve eliminar 
um elemento de um vetor. A subrotina deve receber por parâmetro a posição (índice) 
do elemento a ser eliminado, o tamanho do vetor e o nome do vetor.


Quando for escolhida a opção número 3, uma subrotina chamada escreve deve escrever 
na tela os elementos do vetor.

*/
