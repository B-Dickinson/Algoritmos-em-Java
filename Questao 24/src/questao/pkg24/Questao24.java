package questao.pkg24;


public class Questao24 {

    
    public static void main(String[] args) {
          float c;
          int f = 1;
          
    do {
           c = (float) (f - 32) * 5/9;
           System.out.println(f+" = "+c);
           f++;
    } while(f <=50);  
    
    
    
    
    
    
    }
}

/*

A conversão de graus Fahrenheit para Celsius é obtida pela fórmula C=5/9(F-32).
Escreva um  algoritmo que calcule e apresente TODAS as temperaturas (em Celsius)
correspondentes  aquelas em Fahrenheit de 1 até 50, ou seja, para cada
temperatura em Fahrenheit, variando  de 1 até 50, calcular e apresentar uma
temperatura em Celsius. 

*/