package pratica_facul;

import java.util.Scanner;

public class Questao12 {

             private static Scanner leia;

       public static void main(String[]args){
              leia = new Scanner(System.in);    
              int tam;
              int i;
              int x;
              boolean palin = true;

                     System.out.print("Quantas letras possui a palavra que deseja digitar?  ");  
                     tam = leia.nextInt(); 

                     char v[] = new char[tam];
                     char y[] = new char[tam];
                     x = tam;

              for(i=0; i < v.length; i++){
                     System.out.print("letra "+(i+1)+": ");
                     v[i] = leia.next().charAt(0);
              }

              for(i=0; i < v.length;i++) {  
                    x--;
                    y[x] = v[i];   
              }     
                                           
              for(i=0; i < v.length; i++){
                  if(v[i] == y[i]) {
                     palin = true;      
                  }  else {
                     palin = false; 
                  } 
              }  
              
              if (palin == true){
                  System.out.println("A palavra digitada é um palíndromo :p");
              } else {
                  System.out.println("Esta palavra não é um palíndromo :( ");
              }
       }
}
