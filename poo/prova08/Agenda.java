package prova08;

public class Agenda {
       private Contato contato[] = new Contato[6];
       private int quantidade;
       private boolean salvo = false;

   
public Agenda(){

}       


public Contato[] getContato() {
    return contato;
}
    
public void setContato(Contato[] contato) {
    this.contato = contato;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
}
    
public void adicionarContato(Contato c){
      for(int i=0; i < contato.length; i++){
          if(contato[i] == null){
              this.contato[i] = c;
              this.setQuantidade(this.getQuantidade() + 1);
              this.setSalvo(true);
              System.out.println("Contato adicionado com sucesso!!");
              break;
          }
      }
}    


public void imprimirContato(Contato c){
      for(int i=0; i < contato.length;i++){
            
         if(this.contato[i] == c && contato[i] != null){
             System.out.println("Nome: "+this.contato[i].getNome());
             System.out.println("Email: "+this.contato[i].getEmail());
             System.out.println("Endereço: "+this.contato[i].getEndereco());
             System.out.println("Celular: "+this.contato[i].getNumeroCelular());
             System.out.println("Fixo: "+this.contato[i].getNumeroFixo());
             break;
         } else{
             continue;
         } 

      }
        
}


public void excluirContato(Contato c){
      for(int i = 0; i < contato.length;i++){
          if(contato[i] == c){
              System.out.println(this.contato[i].getNome()+ " foi removido da agenda");
              this.contato[i] = null;
              this.setQuantidade(this.getQuantidade() - 1);
              
          }
      }
}


public boolean getSalvo() {
    return salvo;
}


public void setSalvo(boolean salvo) {
    this.salvo = salvo;
}


       
    
}
