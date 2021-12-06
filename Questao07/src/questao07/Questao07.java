/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao07;

import java.util.Scanner;

/**
 *
 * @author Bruce
 */
public class Questao07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        int x = a;
        
        System.out.print("N: ");
        int n = sc.nextInt();
        int y = n;        
        
        System.out.println("A: "+a);
        System.out.println("N: "+n);
        
        System.out.println("");
        System.out.println("Inverso");
        System.out.println("");
        
        a = y;
        n = x;
        
        System.out.println("A: "+a);
        System.out.println("N: "+n);
        
    }
    
}

/*

Faça um algoritmo que leia dois valores e os mostre na tela sequencialmente. Em 
seguida imprimir os valores na ordem contrária. Ou seja, o primeiro valor digitado 
será impresso pela segunda variável e o segundo valor será impresso pela primeira 
variável.

*/