package questao.pkg9;

import java.util.Scanner;


public class Questao9 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Grau Fahrenheit: ");
          float f = sc.nextInt();
          double c = (f-32)*5/9;
          System.out.println("");
          System.out.printf("Grau Fahrenheit: "+f+" = "+" Grau Celsius: %.2f \n",c );
          
    }
    
}

/*
A Conversão de graus Fahrenheit para centígrados é obtida por
C= 5/9*( F− 32)
Faça um algoritmo que calcule e escreva um valor em centígrados em função de
graus Fahrenheit. 

*/