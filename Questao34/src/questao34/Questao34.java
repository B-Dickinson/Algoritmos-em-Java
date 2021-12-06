package questao34;

import java.util.Scanner;


public class Questao34 {

    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in); 
           String v[] = new String[10];
           int i;
           
    for(i=0; i < v.length;i++){
           System.out.print("Nome: ");
           v[i] = sc.nextLine();
    }   
    
           System.out.println("");
    for(i=0; i < v.length; i++){
           System.out.println(v[i]);   
    }
           
           
           
           
    }
}

/*
Escreva um algoritmo em pseudocodigo para ler 10 valores do tipo “Literal” e
guardá-los em um vetor. Após a leitura dos 10 valores, mostrar todos os valores armazenado.
*/