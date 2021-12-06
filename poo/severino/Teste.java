// Criado por: Bruce Dickson RA: 2011710037
// Thcylla Sá RA: 2011710042

package severino;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in); // números
           Scanner teclado = new Scanner(System.in); // Strings
           Usuario u[] = new Usuario[50];
           Profissional p[] = new Profissional[50];
           int r = 0;                                    // controle para o primeiro do while
           int i = 0;                                   // contador de usuarios
           int e;                                      // para o switch
           int c; // utilizado em sobre

           do{ // primeiro
                 u[i] = new Usuario(); 
                 System.out.print("Informe seu nome: ");
                 u[i].setNome(teclado.nextLine());
                 System.out.print("Cpf: "); 
                 u[i].setCpf(teclado.nextLine());
                 System.out.print("Data de nascimento: ");
                 u[i].setDataNascimento(teclado.nextLine());
                 System.out.print("Endereço: ");
                 u[i].setEndereco(teclado.nextLine());

           

           do{ // segundo   
                 System.out.println("--------------------------------------------------------");
                 System.out.println("");
                 System.out.println("Bem Vindo ao Severino Sr(a): "+u[i].getNome());
                 System.out.println("");
                 System.out.println("1 - Cadastrar-se como profissional");
                 System.out.println();
                 System.out.println("2 - Serviços Disponíveis");
                 System.out.println();
                 System.out.println("3 - Sobre");
                 System.out.println();
                 System.out.println("4 - Sair");
                 System.out.println();
                 System.out.print("Escolha uma das opções: ");
                 e = sc.nextInt();



           switch(e){
                 case 1:
                        p[i] = new Profissional(u[i]);
                        System.out.println("");    
                        System.out.println("<< Cadastro Profissional: >>");    
                        System.out.println("");    
                        System.out.println("");    
                        System.out.println("No momento, temos vagas disponíveis apenas para:");    
                        System.out.println("");    
                        System.out.println("- Pedreiro");    
                        System.out.println("");    
                        System.out.println("- Encanador(a)");    
                        System.out.println("");    
                        System.out.println("- Pintor(a)");    
                        System.out.println("");    
                        System.out.println("- Eletricista");    
                        System.out.println("");    
                        System.out.println("");    
  
                        System.out.print("Escolha uma vaga para o seu cadastro: ");    
                        p[i].setServicos(teclado.nextLine());
                        System.out.println("");
                        System.out.print("Informe seu telefone para contato: ");
                        p[i].setTelefone(teclado.nextLine());
                        p[i].cadastrar(u[i]);

                        System.out.println("");    
                        System.out.println("Cadastro Realizado com Sucesso!!!"); 
                        System.out.println("");     
                 break;


                 case 2:
                        System.out.println("");    
                        System.out.println("<< Serviços e Profissionais Disponíveis >>");    
                        System.out.println("");    
                        System.out.println("1 - Pedreiro");    
                        System.out.println("");    
                        System.out.println("2 - Encanador(a)");    
                        System.out.println("");    
                        System.out.println("3 - Pintor(a)");    
                        System.out.println("");    
                        System.out.println("4 - Eletricista");    
                        System.out.println("");    
                        System.out.println("");    
                        System.out.print("Informe qual destes serviços você precisa no momento: ");
                        
                     
                        u[i].setServicoNecessario(sc.nextInt());
                        System.out.println(""); 
                        System.out.println(""); 











                        
                 switch (u[i].getServicoNecessario()){ // esse é um switch dentro de um dos casos, um switch encadeado
                            case 1:
                                   System.out.println("Profissionais Disponíveis: ");
                                   System.out.println("");
                                   System.out.println("");
                                   System.out.println("");
                                   
                     for(int z=0; z < p.length; z++){
                            if(p[z] != null){
                           
                            if(p[z].getServicos().equalsIgnoreCase("Pedreiro")){
                                   System.out.println("- "+p[z].getUser().getNome()+" telefone: (98) "+p[z].getTelefone());
                                   System.out.println("");
                            }
                            }else{
                                  if(p[0] == null){   
                                  System.out.println(" << nenhum profissional disponível >>");
                                  break;      
                                  }else if(p[z] == null){
                                   continue;    
                                  }    
                            }

                     }
                                   
                            break;
                            case 2:
                                   System.out.println("Profissionais Disponíveis: ");
                                   System.out.println("");
                     for(int z=0; z < p.length; z++){
                           if(p[z] != null){ 

                           if(p[z].getServicos().equalsIgnoreCase("Encanador")||p[z].getServicos().equalsIgnoreCase("Encanadora")){

                                   System.out.println("- "+p[z].getUser().getNome()+" telefone: (98) "+p[z].getTelefone());
                           } 
                           }else{
                                   if(p[0] == null){
                                   System.out.println(" << nenhum profissional disponível >>");
                                   break;      
                                  }else if(p[z] == null){
                                   continue;      
                                  }     
                           }   
                     }
                           break;
                           case 3:
                                   System.out.println("Profissionais Disponíveis: ");
                                   System.out.println("");
                     for(int z=0; z < p.length; z++){
                           if(p[z] != null){ 
                   
                           if(p[z].getServicos().equalsIgnoreCase("Pintor")||p[z].getServicos().equalsIgnoreCase("Pintora")){

                                   System.out.println("- "+p[z].getUser().getNome()+" telefone: (98) "+p[z].getTelefone());
                                   System.out.println("");
                           }
                           }else{
                                  if(p[0] == null){
                                   System.out.println("<< nenhum profissional disponível >>"); 
                                   break;       
                                  } else if(p[z] == null){
                                   continue;  
                                  }    
                           }    
                     }
                           break;
                           case 4:
                                   System.out.println("Profissionais Disponíveis: ");
                                   System.out.println("");
                     for(int z=0; z < p.length; z++){
                           if(p[z] != null){ 
           
                           if(p[z].getServicos().equalsIgnoreCase("Eletricista")){

                                   System.out.println("- "+p[z].getUser().getNome()+" telefone: (98) "+p[z].getTelefone());
                                   System.out.println("");
                           }
                           }else{
                                   if(p[0] == null){
                                   System.out.println("<< nenhum profissional disponível >>"); 
                                   break;       
                                   } else if(p[z] == null){
                                   continue;      
                                   }    
                           }    
                     }
                           break;
                           default:
                                  System.out.println("No momento, essa opção não existe ;)");               
                 }      
                           break;


                    case 3:
                           u[i].sobre();
                    break;





                    
                    case 4:
                           System.out.println("");
                           System.out.println("");
                           System.out.println("Tem certeza que deseja encerrar o programa ?");
                           System.out.println("1- Sim    ||   2- Não");
                           System.out.println("");
                           System.out.print("R: ");
                           c = sc.nextInt();
                    if(c == 1){
                           System.exit(0);
                    }
                    break;
                    default:
                           System.out.println("Opção inválida :( "); 
           }      



















                    
                           System.out.println(""); 
                           System.out.println(""); 
                           System.out.println(""); 
                           System.out.println("O que deseja ?");
                           System.out.println("");    
                           System.out.println("1 - Menu Inicial || 2 - Menu Cadastral || 3 - Sair");    
                           r = sc.nextInt();

                           
           } while(r == 1);  // segundo do While 
                                    
             
                          
           
           if(r == 3){
                          System.out.println("");
                          System.out.println("");
                          System.out.println("Obrigado pela preferência, até uma próxima ;)");
                          System.out.println("");
                          break;               
           }
                          i++;
           }while(r == 2); // primeiro do While


                          System.out.println("");    
                          System.out.println("Fim!!!!!!");  
                          
              
          
           


            sc.close();
            teclado.close();  

    }  
}

