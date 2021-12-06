
package questao64;


public class Agenda implements Agendinha {
    private Contato contato[] = new Contato[50];
    private int quantidade = 0;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Agenda() {
        
    }
    
    @Override
    public void adicionarContato(Contato c){
          for(int i=0; i < contato.length;i++){
            if(this.contato[i] == null){ 
                 this.setQuantidade(this.getQuantidade()+1);
                 this.contato[i] = c;
                 System.out.println(this.contato[i].getNome()+" agora está em sua lista de contatos!");
                 break;   
          }
        }    
    }
    

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    
    public void stts(){
          if (this.getQuantidade() == 0){
               System.out.println("");
               System.out.println("<< agenda vazia >>");
          } else {
               System.out.println("Agenda telefônica: ");

               System.out.println("");
          for(int i=0; i < contato.length;i++){
               if(contato[i] != null){
                    System.out.println("Nome: "+this.contato[i].getNome());
                    System.out.println("Número: "+this.contato[i].getNumero());
                    System.out.println("-");
               }
          }
                    System.out.println("");
                    System.out.println(+this.getQuantidade()+" contatos");
        }            
    }
    @Override
    public void ordenarDescrescente(){
         for(int i = 49; i >= 0;i--){
               if(contato[i] != null){
                    System.out.println("Nome: "+this.contato[i].getNome());
                    System.out.println("Número: "+this.contato[i].getNumero());
                    System.out.println("-");
               }
          }
                    System.out.println("");
                    System.out.println(+this.getQuantidade()+" contatos");
          
    }
    

    @Override
    public void excluir(Contato c) {
           for(int i=0;i < contato.length;i++){
               if(contato[i] == c){
                    this.contato[i] = null;
                    this.setQuantidade(this.getQuantidade() - 1);
                    System.out.println("contato apagado!");
               }      
           } 
    }

    @Override
    public void buscar(Contato c) {
          for(int i=0; i < contato.length;i++){
              if(contato[i] == c){
                  System.out.println("Contato Encontrado!");
                  System.out.println("");
                  System.out.println("---------------------");
                  System.out.println(contato[i].getNome());
                  System.out.println(contato[i].getNumero());
                  System.out.println("---------------------");
              }
          }

    }

    @Override
    public void esvaziar() {
          for(int i=0;i < contato.length;i++){
               contato[i] = null;
               this.setQuantidade(0);
           }
               System.out.println("Exclusão bem sucedida!");
    }
      
      
    
}
