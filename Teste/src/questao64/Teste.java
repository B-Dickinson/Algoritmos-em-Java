package questao64;

public class Teste {

    public static void main(String[] args) {
        try{
        
           Agenda a = new Agenda();
           Contato c[] = new Contato[6];
           
           c[0] = new Contato("Bruce Dickson","992355645");
           c[1] = new Contato("Bianca Dickson","997355425");
           c[2] = new Contato("Boi","997551424");
           c[3] = new Contato("Mamae","992551214");
           c[4] = new Contato("Papai","998562524");
           c[5] = new Contato("Luis Lorota","987850424");
           
           
           a.adicionarContato(c[0]);
           a.adicionarContato(c[1]);
           a.adicionarContato(c[2]);
           a.adicionarContato(c[3]);
           a.adicionarContato(c[4]);
           a.adicionarContato(c[5]);
           
           System.out.println("");
           System.out.println("");
           System.out.println("");
           a.ordenarDescrescente(); 
           
           
           
        } catch(Exception e){
            System.out.println(" Hmmm, algo deu errado, tente novamente :)"); 
        }
           
           

   
    }
}
