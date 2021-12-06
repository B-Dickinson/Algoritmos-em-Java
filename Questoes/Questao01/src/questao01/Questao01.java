package questao01;

import java.util.Scanner;


public class Questao01 {

    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int a,b,c;
           
           System.out.print("A: ");
           a = sc.nextInt();
           System.out.print("B: ");
           b = sc.nextInt();
           System.out.print("C: ");
           c = sc.nextInt();
           
           System.out.println("O produto é: "+a * b * c);
           
        
    }
    
}

/*

Faça um algoritmo que leia três valores numéricos e imprima o produto entre eles.


*/