package hotel_app;

import java.util.Scanner;

public class Teste {
    
public static void main(String[] args) {
       Scanner src = new Scanner(System.in);
       Scanner teclado = new Scanner(System.in);
       Hotel h[] = new Hotel[3];
       Categoria cat[] = new Categoria[5]; 
       int hotel = 0;
       int apartamento = 0;
       int numero = 0;
       String categoria;
       boolean categoriaValida = false;

       h[0] = new Hotel("Rio Poty", "1122553545"); 
       h[1] = new Hotel("My Ilha", "00598645"); 
       h[2] = new Hotel("Grand Village", "114454546464"); 

       cat[0] = new Categoria("*", 150);
       cat[1] = new Categoria("**", 300);
       cat[2] = new Categoria("***", 450);
       cat[3] = new Categoria("****", 650);
       cat[4] = new Categoria("*****", 1000);

       System.out.println("");
       System.out.println("Agência de Hotéis em SLZ");
       System.out.println();
       System.out.println("Disponíveis:");
       System.out.println();
       System.out.println(" [1] "+h[0].toString());
       System.out.println();
       System.out.println(" [2] "+h[1].toString());
       System.out.println();
       System.out.println(" [3] "+h[2].toString());

       System.out.println();
       System.out.println("Qual hotel deseja se hospedar?  ");
       hotel = src.nextInt();


       switch(hotel){
           case 1:
                  System.out.println("Hotel escolhido: "+h[0].toString());  
                  System.out.println();
                  System.out.println("Qual tipo de apartamento você deseja:");
                  System.out.println();
                  System.out.println(" [1] - Solteiro");
                  System.out.println();
                  System.out.println(" [2] - Casal");
                  System.out.println();
                  System.out.println();
                  System.out.print("R: ");
                  apartamento = src.nextInt();  
        switch(apartamento){      
                        case 1:
                              h[0].setSolteiro(1); 
                              System.out.println("Realizado com Sucesso!"); 
                        break;
                        case 2:
                              h[0].setCasal(1);  
                              System.out.println("Realizado com Sucesso!");  
                        break;
                        default:
                              System.out.println("Não possuimos esse tipo de apartamento");  
        }
        do{
                   System.out.println(); 
                   System.out.print("Número do quarto: (1 a 5): ");
                   numero = src.nextInt();
                   h[0].setNumero(numero);
                   System.out.println();
                   System.out.println();
                   if(numero == 0 || numero > 5){
                      System.out.println("Número de quarto inválido, tente novamente."); 
                   }
                      System.out.println();
                      System.out.println();
          }while(numero == 0 || numero > 5); 
                   System.out.println("Quarto número "+h[0].getNumero()+" selecionado com sucesso!");   
                   
                   System.out.println();
                   System.out.println("Por último, escolha a categoria de Hospedagem:");
                   System.out.println();
                   System.out.println("Obs: Os asteriscos representam os níveis em estrelas.");
                   System.out.println();
                   System.out.println("  * - R$150,00 ");
                   System.out.println();
                   System.out.println("  ** - R$300,00 ");
                   System.out.println();
                   System.out.println("  *** - R$450,00 ");
                   System.out.println();
                   System.out.println("  **** - R$650,00 ");
                   System.out.println();
                   System.out.println("  ***** - R$1000,00 ");
                   System.out.println();
          do{

                   System.out.print("R: ");
                   categoria = teclado.nextLine().toLowerCase();
                        System.out.println();

                   if(categoria.equals("*")){
                        h[0].setCat(cat[0]);
                        categoriaValida = true; 
                        System.out.println("Categoria 1 estrela selecionada com sucesso!");       
                   } else if(categoria.equals("**")){
                        h[0].setCat(cat[1]);
                        categoriaValida = true;
                        System.out.println("Categoria 2 estrela selecionada com sucesso!");        
                   } else if(categoria.equals("***")){
                        h[0].setCat(cat[2]);  
                        categoriaValida = true; 
                        System.out.println("Categoria 3 estrela selecionada com sucesso!");    
                   } else if(categoria.equals("****")){
                        h[0].setCat(cat[3]); 
                        categoriaValida = true;
                        System.out.println("Categoria 4 estrela selecionada com sucesso!");   
                   } else if(categoria.equals("*****")){
                        h[0].setCat(cat[4]); 
                        categoriaValida = true;
                        System.out.println("Categoria 5 estrela selecionada com sucesso!");   
                   } else {
                        System.out.println("Categoria Inválida, tente novamente.");
                   }
                        System.out.println();
          } while(categoriaValida == false);          
           break;








           case 2:
                  System.out.println("Hotel escolhido: "+h[1].toString());
                  System.out.println();
                  System.out.println("Qual tipo de apartamento você deseja:");
                  System.out.println();
                  System.out.println(" [1] - Solteiro");
                  System.out.println();
                  System.out.println(" [2] - Casal");
                  System.out.println();
                  System.out.println();
                  System.out.print("R: ");
                  apartamento = src.nextInt();  
        switch(apartamento){      
                        case 1:
                              h[1].setSolteiro(1); 
                              System.out.println("Realizado com Sucesso!"); 
                        break;
                        case 2:
                              h[1].setCasal(1);  
                              System.out.println("Realizado com Sucesso!");  
                        break;
                        default:
                              System.out.println("Não possuimos esse tipo de apartamento");  
        }
        do{
                   System.out.println(); 
                   System.out.print("Número do quarto: (1 a 5): ");
                   numero = src.nextInt();
                   h[1].setNumero(numero);
                   System.out.println();
                   System.out.println();
                   if(numero == 0 || numero > 5){
                      System.out.println("Número de quarto inválido, tente novamente."); 
                   }
                      System.out.println();
                      System.out.println();
          }while(numero == 0 || numero > 5); 
                   System.out.println("Quarto número "+h[1].getNumero()+" selecionado com sucesso!");   
                   
                   System.out.println();
                   System.out.println("Por último, escolha a categoria de Hospedagem:");
                   System.out.println();
                   System.out.println("Obs: Os asteriscos representam os níveis em estrelas.");
                   System.out.println();
                   System.out.println("  * - R$150,00 ");
                   System.out.println();
                   System.out.println("  ** - R$300,00 ");
                   System.out.println();
                   System.out.println("  *** - R$450,00 ");
                   System.out.println();
                   System.out.println("  **** - R$650,00 ");
                   System.out.println();
                   System.out.println("  ***** - R$1000,00 ");
                   System.out.println();
          do{

                   System.out.print("R: ");
                   categoria = teclado.nextLine().toLowerCase();
                        System.out.println();

                   if(categoria.equals("*")){
                        h[1].setCat(cat[0]);
                        categoriaValida = true;
                        System.out.println("Categoria 1 estrela selecionada com sucesso!");     
                   } else if(categoria.equals("**")){
                        h[1].setCat(cat[1]);
                        categoriaValida = true;
                        System.out.println("Categoria 2 estrela selecionada com sucesso!");        
                   } else if(categoria.equals("***")){
                        h[1].setCat(cat[2]);  
                        categoriaValida = true;
                        System.out.println("Categoria 3 estrela selecionada com sucesso!");      
                   } else if(categoria.equals("****")){
                        h[1].setCat(cat[3]); 
                        categoriaValida = true;
                        System.out.println("Categoria 4 estrela selecionada com sucesso!");   
                   } else if(categoria.equals("*****")){
                        h[1].setCat(cat[4]); 
                        categoriaValida = true;
                        System.out.println("Categoria 5 estrela selecionada com sucesso!");   
                   } else {
                        System.out.println("Categoria Inválida, tente novamente.");
                   }
                        System.out.println();
                        System.out.println();
          } while(categoriaValida == false);                  
                  
           break;






           case 3:
                  System.out.println("Hotel escolhido: "+h[2].toString());
                  System.out.println();
                  System.out.println("Qual tipo de apartamento você deseja:");
                  System.out.println();
                  System.out.println(" [1] - Solteiro");
                  System.out.println();
                  System.out.println(" [2] - Casal");
                  System.out.println();
                  System.out.println();
                  System.out.print("R: ");
                  apartamento = src.nextInt();  
        switch(apartamento){      
                        case 1:
                              h[2].setSolteiro(1); 
                              System.out.println("Realizado com Sucesso!"); 
                        break;
                        case 2:
                              h[2].setCasal(1);  
                              System.out.println("Realizado com Sucesso!");  
                        break;
                        default:
                              System.out.println("Não possuimos esse tipo de apartamento");  
        }
        do{
                   System.out.println(); 
                   System.out.print("Número do quarto: (1 a 5): ");
                   numero = src.nextInt();
                   h[2].setNumero(numero);
                   System.out.println();
                   System.out.println();
                   if(numero == 0 || numero > 5){
                      System.out.println("Número de quarto inválido, tente novamente."); 
                   }
                      System.out.println();
                      System.out.println();
          }while(numero == 0 || numero > 5); 
                   System.out.println("Quarto número "+h[2].getNumero()+" selecionado com sucesso!");   
                   
                   System.out.println();
                   System.out.println("Por último, escolha a categoria de Hospedagem:");
                   System.out.println();
                   System.out.println("Obs: Os asteriscos representam os níveis em estrelas.");
                   System.out.println();
                   System.out.println("  * - R$150,00 ");
                   System.out.println();
                   System.out.println("  ** - R$300,00 ");
                   System.out.println();
                   System.out.println("  *** - R$450,00 ");
                   System.out.println();
                   System.out.println("  **** - R$650,00 ");
                   System.out.println();
                   System.out.println("  ***** - R$1000,00 ");
                   System.out.println();
          do{

                   System.out.print("R: ");
                   categoria = teclado.nextLine().toLowerCase();
                        System.out.println();

                   if(categoria.equals("*")){
                        h[2].setCat(cat[0]);
                        categoriaValida = true;
                        System.out.println("Categoria 1 estrela selecionada com sucesso!");     
                   } else if(categoria.equals("**")){
                        h[2].setCat(cat[1]);
                        categoriaValida = true;
                        System.out.println("Categoria 2 estrela selecionada com sucesso!");        
                   } else if(categoria.equals("***")){
                        h[2].setCat(cat[2]);  
                        categoriaValida = true;
                        System.out.println("Categoria 3 estrela selecionada com sucesso!");      
                   } else if(categoria.equals("****")){
                        h[2].setCat(cat[3]); 
                        categoriaValida = true;
                        System.out.println("Categoria 4 estrela selecionada com sucesso!");   
                   } else if(categoria.equals("*****")){
                        h[2].setCat(cat[4]); 
                        categoriaValida = true;
                        System.out.println("Categoria 5 estrela selecionada com sucesso!");   
                   } else {
                        System.out.println("Categoria Inválida, tente novamente.");
                   }
                        System.out.println();
                        System.out.println();
          } while(categoriaValida == false);                  
           break;



           default:
                  System.out.println("Ainda não possuimos esse hotel :( ");   

       }


src.close();
teclado.close();
}    
}
