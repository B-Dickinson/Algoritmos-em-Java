/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao.pkg05;

import java.util.Scanner;

/**
 *
 * @author Bruce
 */
public class Questao05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float b;
        float h;
        float a;
        
        System.out.print("Base: ");
        b = sc.nextFloat();
        System.out.print("Altura: ");
        h = sc.nextFloat();
        a = (b * h) / 2;
        
        System.out.println("");
        System.out.println("Area = "+a);
    }
    
}

/*

 Ler a base e a altura de um triângulo. Em seguida, escreva a área do mesmo.
Obs.: Área = (Base * Altura) / 2

*/