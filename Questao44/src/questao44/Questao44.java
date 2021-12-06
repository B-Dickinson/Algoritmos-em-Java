package questao44;

import java.util.Scanner;


public class Questao44 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int v[] = new int[20];
           int i;
           int c;
           
        for( i = 0; i < v.length; i++){
            System.out.print("Informe um número: ");
            v[i] = teclado.nextInt();
        }   
            System.out.println("");
            System.out.println("");
            
        for (i = 0; i < v.length; i++){
            System.out.println(v[i]+" na posicao "+i);
        }
        
            System.out.println("");
            System.out.println("");
            
        for (i=0; i < v.length ; i++){
            System.out.println((v[19] - i)+" na posicao "+i);
        }
        // troquei as posicoes também //
    }
    
}

/*

Escrever um algoritmo que lê um vetor de tamanho 20 e o escreve na tela.
Troque, a  seguir, o elemento 1 com o último, o elemento 2 com o penúltimo e etc,
até o décimo com o décimo e escreva o vetor assim modificado.


*/