package questao33;

import java.util.Scanner;


public class Questao33 {

   
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           Scanner sc = new Scanner(System.in);
           String ec;
           int idade;
           String nome;
           int i = 1;
           int qtd_sep = 0;
           int qtd_cas = 0;
           int qtd_sol = 0;
           int somav = 0;
           float mediav = 0;
           float separadas = 0;
           
    while (i<=15) {       
           
           System.out.print("Nome: ");
           nome = sc.nextLine();
           System.out.print("Idade: ");
           idade = teclado.nextInt();
           
           System.out.println("|--------------|");
           System.out.println("| C - Casado   |");
           System.out.println("| S - Solteiro |");
           System.out.println("| V - Viúvo    |");
           System.out.println("| D - Separado |");
           System.out.println("|--------------|");
           System.out.println("");
           
           System.out.print("Estado civil: ");
           ec = teclado.next();
           
    switch (ec){
        case "C":
        case "c":    
            qtd_cas++;
            break;
        case "S":
        case "s":    
            qtd_sol++;
            break;
        case "V":
        case "v":
            somav += idade;
            mediav += (float)somav; 
            break;
        case "D":
        case "d": 
            qtd_sep++;
            separadas =(float)(qtd_sep * 0.01) * 100;
            break;
        default:
            System.out.println("Escolha inválida.");    
    }   
        i++;   
    }
    
        System.out.println("Casados: "+qtd_cas);
        System.out.println("Solteiras: "+qtd_sol);
        System.out.printf("Média das idades entre pessoas Viúvas: %.0f anos. \n",mediav);
        System.out.println("Porcentagem de separados: "+(int)separadas+"%");         
           
    } 
}

/*

Faça um algoritmo que receba a idade e o estado civil(C - casado, S - solteiro, 
V - viúvo e D – desquitado ou separado) de 20 pessoas. 

Calcule e imprima:

a) a quantidade de pessoas casadas;
b) a quantidade de pessoas solteiras;
c) a média das idades das pessoas viúvas;
d) a porcentagem de pessoas desquitadas ou separadas dentre todas as pessoas analisadas

*/