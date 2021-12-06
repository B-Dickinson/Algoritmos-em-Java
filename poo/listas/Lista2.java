package listas;

import java.util.*;
public class Lista2 {
   
public static void main(String[] args) {
      List<String> pessoas = new ArrayList<>();
      Scanner teclado = new Scanner(System.in);
      Scanner sc = new Scanner(System.in);
      int r = 1;
      int x = 0;
      String people;  
      
        System.out.println("Deseja cadastrar alguém? 1-Sim 2-Não");
        r = teclado.nextInt();
      do{
        if(r == 1){
          System.out.print("Informe o nome: ");
          people = sc.nextLine();
          pessoas.add(people);
        }else{
          break;
        }

        System.out.println("Quer cadastrar mais algúem? 1-sim 2-nao");
        x = teclado.nextInt();
      } while(x == 1);

      for(String p : pessoas){
         System.out.println("- Nome: "+ p +"\n- Número: "+
         pessoas.indexOf(p)+"\n"); 
      }

         System.out.print("A lista está vazia?");
         System.out.println("\n");

      if(pessoas.isEmpty())
      {
         System.out.println("Sim, a lista não possui nenhum elemento");
      } else
      {
         System.out.println("R: Não, a lista possui os "+pessoas.size()+" cavaleiros do apocalipse");
      }
         System.out.println("\n");

         System.out.println("Existe algum viado entre os listados? ");
         System.out.println("\n");
         if(pessoas.isEmpty() == false)
         {
            System.out.println("R: Sim, e o nome dele é: "+pessoas.get(3)+" também conhecido como BUMBUM GULOSO!!");
         } else
         {
            System.out.println("Não, todos são seguidores JOTARU'S");
         }
         

         System.out.println();
         System.out.println("Finalizado!");

      
      teclado.close();
      sc.close();

}    
}
