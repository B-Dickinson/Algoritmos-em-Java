package questao36;


import java.util.Scanner;


public class Questao36 {

  
    public static void main(String[] args) {
           Scanner leia = new Scanner(System.in);
           int v[] = new int[10];
           int i;
           
    for (i=0; i < v.length; i++){
           System.out.print("Informe um valor: ");
           v[i] = leia.nextInt();
    }       
    
           System.out.println("");
           System.out.println("");
           
           
    for(i=0; i < v.length; i++){
    if (v[i] >= 25){
           System.out.println(v[i]+" na posição: "+i);
    } else {
           System.out.println(v[i]); 
    }
    
    }       
           
           
           
           
    }
}

/*

Escreva um algoritmo em pseudocodigo para ler um vetor de tamanho 10 e escreva a 
posição de cada elemento com valor maior ou igual a 25 neste vetor.


*/