package dicionario;

import java.util.*;

public class Dicionario {

public static void main(String[] args) {
      Map<String,String> dicionario = new HashMap<>();
      dicionario.put("1", "Teste");  
      dicionario.put("2", "de");  
      dicionario.put("3", "ocorrências");  
      dicionario.put("4", "de");  
      dicionario.put("5", "um");  
      dicionario.put("6", "TeStE");  
      dicionario.put("7", "em um");  
      dicionario.put("8", "dicionário");
      dicionario.put("9", "com algum");
      dicionario.put("10", "TESTE");

      System.out.println(dicionario.keySet());

      System.out.println();
      System.out.println();

      String p = "Teste";
                  int ocorrencias = 0;

      for(String o : dicionario.values()){
          if(o.equalsIgnoreCase(p)){
            ocorrencias++;
          }
            System.out.print(o+" ");
      }
            System.out.println();    
            System.out.println();  
            
            System.out.println("A palavra Teste aparece "+ocorrencias+" vezes na frase");

            System.out.println();
            System.out.println();

}    
}

/* 

Faça um programa que leia uma dicionario e informe o número de 
ocorrências de cada palavra da dicionario
– Use Map para fazer essa contagem

*/
