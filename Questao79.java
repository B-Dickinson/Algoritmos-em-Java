package pratica_facul;

import java.util.Scanner;

public class Questao05 {

       public static void main(String[]args){
              Scanner sc = new Scanner(System.in);  
              int v[] = new int[3];
              int menor;

              for(int i=0; i < 3;i++){
                    System.out.print("Informe um número: ");
                    v[i]  = sc.nextInt();
              }
                    System.out.println("");
                    System.out.println("Vetor: ");
                    System.out.println("");
                    menor = v[0];  


              for(int i=0; i < 3;i++){
                  if(v[i] < menor ){
                      menor = v[i];
                  }
                    System.out.println(v[i]);
              }

                    System.out.println("");
                    System.out.println("O menor número digitado é: "+menor);



                    sc.close();

    }
    
}

//  Ler 3 números e imprimir o menor digitado