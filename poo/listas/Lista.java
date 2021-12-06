package listas;

import java.util.*;
public class Lista {
 
public static void main(String[] args) {
    List<String> frase = new ArrayList<>();
    String inicio = "Hello,";
    String fim = "World!";

    frase.add(inicio);
    frase.add(fim);

    System.out.println(frase.get(0) + "\t" + frase.get(1));

    System.out.println();
    System.out.println("Frase invertida:");
    System.out.println();

    System.out.println(frase.get(1) + "\t" + frase.get(0));

    System.out.println("Qtd de elementos: " + frase.size());
}    
}
