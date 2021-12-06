package severino;

import java.util.Scanner;

public class Severino {

    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Scanner teclado = new Scanner(System.in);
           Usuario u[] = new Usuario[10];
           Profissional p[] = new Profissional[10];
           int r ;                                      // controle para o primeiro do while
           int i = 0;                                   // contador de usuarios
           int e;                                      // para o switch

    do{           

                  
                  u[i] = new Usuario();
                  System.out.println("-----------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Bem vindo, faça seu cadastro para continuar");
                  System.out.println("");

                  System.out.print("Nome: ");
                  u[i].setNome(teclado.nextLine());

                  System.out.print("Cpf: ");
                  u[i].setCpf(teclado.nextLine());

                  System.out.print("Data de Nascimento: ");
                  u[i].setDataNascimento(teclado.nextLine());

                  u[i].setCadastro(true); // um usuário após o menu de cadastro
    
    do{              
                  System.out.println("------------------------------------------------------------------------------------------");
                  System.out.println("");
                  System.out.println("Bem Vindo ao app Severino Sr "+u[i].getNome());
                  System.out.println("");
                  System.out.println("1 - Candidatar-se como um Profissional");
                  System.out.println("");
                  System.out.println("2 - Nossos Serviços e Profissionais");
                  System.out.println("");
                  System.out.println("3 - Sobre");
                  System.out.println("");
                  System.out.println("4 - Sair");
                  System.out.println("");
                  System.out.println("");
                  System.out.print("Escolha uma das opções acima: ");
                  e = sc.nextInt();

       switch(e){
                 case 1:  
                  p[i] = new Profissional(u[i].getNome(),u[i].getCpf(),u[i].getDataNascimento()); 
                  System.out.println("");
                  System.out.println("Vagas de emprego disponíveis para: ");
                  System.out.println("");
                  System.out.println("- Encanador");
                  System.out.println("");
                  System.out.println("- Eletricista");
                  System.out.println("");
                  System.out.println("- Pedreiro");
                  System.out.println("");
                  System.out.println("- Pintor");
                  System.out.println("");
                  System.out.println("");


                  System.out.println("Informe a vaga que mais combina com o seu perfil profissional: ");
                  p[i].setServicos(sc.next());
                  System.out.println("");
                  p[i].cadastrar(u[i]);
                  
                  System.out.println("Bem vindo ao time "+p[i].getNome()+"!!!"); 
                  System.out.println();
           break;
           case 2:
                  System.out.println("");
                  System.out.println("Serviços Disponíveis:");
                  System.out.println("");
                  System.out.println(" 1 - Pedreiro");
                  System.out.println("");
                  System.out.println(" 2 - Encanador");
                  System.out.println("");
                  System.out.println(" 3 - Pintor");
                  System.out.println("");
                  System.out.println(" 4 - Eletricista");
                  System.out.println("");
                  System.out.println("");  
                  System.out.println("Qual tipo de profissional você precisa?");
                  p[i].servicos(sc.nextInt());

                  System.out.println("");
                  System.out.println("");
                  System.out.println("");
                  
           break;
           case 3:
                  u[i].sobre();   
           break;
           case 4:
                  System.out.println("Tem certeza que deseja sair ? 1 - Sim    |   2 - Não ");
                  r = sc.nextInt();
              if(r == 1){
                  System.exit(0);
              }    
           break;
           default:
                  System.out.println("Opção inválida :( ");
    }       
           



           System.out.println("");
           System.out.println("");
           System.out.println("Deseja mais alguma coisa?");
           System.out.println("");
           System.out.println("1 - Menu Inicial    |    2 - Tela de Cadastro inicial    | 3 - Sair  ");
           r = sc.nextInt();

    }while(r == 1);                  // do while Menu inicial
    if(r == 3){                      // do while tela de inicio de cadastro inicial
           System.out.println("");  
           System.out.println("");  
           System.out.println("Obrigado pela preferência, até uma próxima :) ");
           break;
    }                    
           i++;

    } while(r == 2); 
    
           p[0].stts();




sc.close();
teclado.close();

    }  
}


/*

Até o moment, criei condicoes para o switch de servicos, o profissional só será apresentado se estiver cadastrado.
- Criei a classe usuario com seus atributos
- Criei a classe Profissionais com seus atributos e metodos
- Criei uma interface que implementa metodos em Profissionais


- lembrar de otimizar os vetores de profissional e dar um jeito de otimizar usuario

*/
