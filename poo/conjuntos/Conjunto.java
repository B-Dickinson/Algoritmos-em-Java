package conjuntos;

import java.util.*;

public class Conjunto {
    
public static void main(String[] args) {
       Set<String> frase = new HashSet<>();

       frase.add("Primeiro");
       frase.add("teste");
       frase.add("de");
       frase.add("Set");
       frase.add("em");
       frase.add("Java");
       frase.add("Java");
       frase.add("Java");
       frase.add("teste");
       frase.add("Primeiro");

       for(String palavras : frase){
           System.out.print(palavras+" ");
       }

       System.out.println();
       System.out.println("Número de palavras não repetidas: "+frase.size());
}    
}

/* 

Faça um programa que leia uma frase e informe o número de palavras 
não repetidas da frase
– Use Set para fazer essa verificação

*/