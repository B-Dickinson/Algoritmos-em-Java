package prova;

public class Question09 {

    public static void main(String[] args) {
       int n = 2020;
       int i = 0;

       while(n < 2100){
           n += 4;
           System.out.println("A próxima Olimpíada correrá em: "+n);
           i++;
       }
           System.out.println("");
           System.out.println("Ainda virão "+i+" Olimpíadas até o ano de 2100"); 
    }
}


/*

Sabendo que a próxima Olimpíada será em 2020
e que ela acontece a cada quatro anos, faça um algoritmo que calcule
todos os anos que ocorrerá esse evento até 2100.

*/
