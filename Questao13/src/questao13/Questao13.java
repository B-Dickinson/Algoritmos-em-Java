package questao13;

import java.util.Scanner;

public class Questao13 {

    
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           int a;
           int b;
           int c;
           
           System.out.print("Informe um valor para A: ");
           a = teclado.nextInt();
           System.out.print("Informe um valor para B: ");
           b = teclado.nextInt(); 
           
           c = (a == b) ? (a + b):(a * b);
           
           System.out.println("O valor de C é: "+c);
    }
    
}

/*

Faça um algoritmo que leia dois valores inteiros A e B, e se os valores forem 
iguais deverá se somar os dois, caso contrário multiplique A por B ao final do calculo 
atribuir o valor para uma variável C. E em seguida, mostar o valor de C.

*/