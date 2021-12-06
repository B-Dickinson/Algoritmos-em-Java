// Criado por: Bruce Dickson RA: 2011710037
// Thcylla Sá RA: 2011710042

package severino;


public class Profissional extends Usuario implements InterfaceInicial {
       private String servicos;
       private boolean cadastroProfissional = false;
       private Usuario user;
       private String  telefone;

public Profissional(String nome,String cpf,String dataNascimento){
       super(nome,cpf,dataNascimento);
       this.setNome(nome);
       this.setCpf(cpf);
       this.setDataNascimento(dataNascimento);
} 

public Profissional(Usuario usuario){
       this.user = usuario;
}

public String getTelefone(){
       return this.telefone;
}

public void setTelefone(String telefone){
      this.telefone = telefone;
}


public String getServicos(){
      return this.servicos;
}

public void setServicos(String servico){
      this.servicos = servico;
}


public Boolean getcadastroProfissional(){
      return this.cadastroProfissional;
}

private void setcadastroProfissional(boolean c){
      this.cadastroProfissional = c;
}
 
@Override
public void cadastrar(Usuario usuario){        
       this.setcadastroProfissional(true);
}  

public void stts(){
              System.out.println("Nome: "+this.user.getNome());
              System.out.println("Cpf:  "+this.user.getCpf());
              System.out.println("Dat/Nasc: "+this.user.getDataNascimento());
              System.out.println("Serviços: "+this.getServicos());
              System.out.println("cadastroProfissional ? "+this.getcadastroProfissional());
}


@Override
public void sobre(){
                    System.out.print("O Severino é uma plataforma criada com o intuito de fornecer um serviço de busca e contratação ");
                    System.out.print("voltados para profissionais autônomos que realizam seus trabalhos em residências");
                    System.out.println("");
    
}

public Usuario getUser() {
       return user;
}

public void setUser(Usuario user) {
       this.user = user;
}


}

