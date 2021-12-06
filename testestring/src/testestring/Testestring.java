
package testestring;

import java.util.Arrays;

public class Testestring {


    public static void main(String[] args) {
           String nome = "  Bruce Dickson  ;";
           String nome2 = "Bru";
           int n = 10;
           
           // transformar numero em Sring 
          String numero = String.valueOf(n);
           System.out.println(n);
           System.out.println(numero);
           
           System.out.println("");
           System.out.println("");
           System.out.println("");
           System.out.println("");
           
           
           // extrair char
           for(int i=0; i < nome.length(); i++){
                System.out.print(nome.charAt(i));
           }
                System.out.println("");
                System.out.println(nome.charAt(6));
                
                
                //começa com \ termina com
                System.out.println(nome.endsWith(nome2));
                System.out.println(nome.startsWith(nome2));
                
                // busca por Strings obs: mostra a posição
                
                //inicio \ fim
                System.out.println(nome.indexOf("B"));
                System.out.println(nome.lastIndexOf("n"));
                
                // teste pra saber se contém algo em uma String
                
                System.out.println(nome.contains("son"));
                System.out.println("");
                
                // extrair partes dessa string
                System.out.println(nome.substring(7));
                System.out.println("");
                
                // repôr algo no lugar de algo
                String semEspacos = nome.replace("Dickson", "Oliveira");
                System.out.println(semEspacos);
                System.out.println("");
                
                // removendo espacos do inicio e fim 
                System.out.println(nome.trim());
                System.out.println("");
                
                // deixar todas a letras maiusculas ou minusculas e sem espacos no inicio e fim
                System.out.println(nome.toUpperCase().trim());
                System.out.println(nome.toLowerCase().trim());
                
                
                
                
                
                
        

    }
}
