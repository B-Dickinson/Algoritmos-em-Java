
package questao54;

import java.util.Scanner;

public class Questao54 {
    
    static boolean par_ou_impar(int a){
           boolean r;
        if (a % 2 == 0){
               r = true;
           } else {
               r = false;
           }
           return r;  
    }

    
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in); 
           boolean resp;
           System.out.print("Informe um numero: ");   
           int x = sc.nextInt();
           resp = par_ou_impar(x);
           
           System.out.println(resp);
        
    }
    
}

/*

Escrever um algoritmo para determinar se um determinado número inteiro é par ou 
ímpar. Utilizar um subalgoritmo de função que retorna um valor lógico para indicar se o 
valor recebido é par ou não.


*/