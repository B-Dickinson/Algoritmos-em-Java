package questao17;

import java.util.Scanner;


public class Questao17 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          String nome, categoria;
          float sal;
          
          System.out.print("Nome: ");
                nome = teclado.nextLine();
          System.out.print("Salário: ");
                sal = teclado.nextFloat();
          System.out.print("Categoria: ");
                 categoria = teclado.next();
                 
        switch (categoria) {
            case "A":
            case "C":
            case "F":
            case "H":
                sal = (float)(sal * 0.1) + sal;
                break;
            case "B":
            case "D":
            case "E":
            case "I":
            case "J":
            case "T":
                sal = (float)(sal * 0.15) + (float) sal;
                break;
            case "K":
            case "R":
                sal = (float)(sal * 0.25) + (float) sal;
                break;
            case "L":
            case "M":
            case "N":
            case "O":
            case "P":
            case "Q":
            case "S":
                sal = (float)(sal * 0.35) + (float)sal;
                break;
            case "U":
            case "V":
            case "X":
            case "Y":
            case "W":
            case "Z":
                sal = (float)(sal * 0.50) + (float)sal;
                break;
            default:
                break;
        }
             System.out.println(sal);
    }
}

/*

Uma empresa irá dar um aumento de salário aos seus funcionários de acordo 
com a categoria de cada empregado. O aumento seguirá a seguinte regra:


a) Funcionários das categorias A, C, F, e H ganharão 10% de aumento sobre o salário 



b) Funcionários das categorias B, D, E, I, J e T ganharão 15% de aumento sobre o 
salário 



c) Funcionários das categorias K e R ganharão 25% de aumento sobre o salário 



d) Funcionários das categorias L, M, N, O, P, Q e S ganharão 35% de aumento sobre o 
salário 



e) Funcionários das categorias U, V, X, Y, W e Z ganharão 50% de aumento sobre o 
salário 



Faça um algoritmo que Escreva Nome, categoria e de acordo com a categoria apresente 
o salário reajustado do empregado. 

*/