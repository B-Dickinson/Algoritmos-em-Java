package prova08;

public class Teste{

public static void main(String[] args) {
       Contato c[] = new Contato[6]; 
       Agenda a = new Agenda();

       // criando meus contatos
       c[0] = new Contato("Jason", "js@hotmail.com", "Canadá", "89865478","");
       c[1] = new Contato("Alfred", "alfred05@hotmail.com", "Gotham", "89878899","32334598");
       c[2] = new Contato("Jackie","jackChan0648@gmail.com" , "China", "99658592", "");
       c[3] = new Contato("Thommy Shelby","shelbyLTDA@gmail.com" , "London", "985591045", "33554002");
       c[4] = new Contato("Anakin Skywalker","DarthVader08@gmail.com" , "Estrela da Morte", "999688525", "");
       c[5] = new Contato("Légolas","elfoLouco000@gmail.com" , "Rivendell", "03321548", "4444444444");
       

       
       // adicionando meus contatos
       a.adicionarContato(c[0]);
       a.adicionarContato(c[1]);
       a.adicionarContato(c[2]);
       a.adicionarContato(c[3]);
       a.adicionarContato(c[4]);
       a.adicionarContato(c[5]);


       System.out.println("");
       System.out.println("");



       // buscando e imprimindo um contato existente
       a.imprimirContato(c[4]);




       System.out.println("");
       System.out.println("");

       




       //apagando um contato
       a.excluirContato(c[4]);
       

       System.out.println("");
       System.out.println("");



       // tentanto imprimir informações do contato que foi excluído
       a.imprimirContato(c[5]); // ele nao imprime nada, pois o contato não existe
}    
}