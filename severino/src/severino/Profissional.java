package severino;


public class Profissional extends Usuario implements Inter {
       private String servicos;
       private boolean cadastrado = false;
       private Usuario user[] = new Usuario[10];

public Profissional(String nome,String cpf,String dataNascimento){
       super(nome,cpf,dataNascimento);
       this.setNome(nome);
       this.setCpf(cpf);
       this.setDataNascimento(dataNascimento);
} 

public Profissional(){

}

public Usuario[] getUser(){
       return this.user;
}

public void setUser(Usuario usuario){ // adicionar usuarios como profissionais
  
}


public String getServicos(){
      return this.servicos;
}

public void setServicos(String servico){
      this.servicos = servico;
}


public Boolean getCadastrado(){
      return this.cadastrado;
}

private void setCadastrado(boolean c){
      this.cadastrado = c;
}
 
@Override
public void cadastrar(Usuario usuario){
       for(int i=0;i < user.length;i++){
           if(user[i] == null){  
              this.user[i] = usuario;        
              this.setCadastrado(true);
              break;
           }   
       }   
}

public void stts(){
     for(int i=0; i < user.length; i++){
         if(this.user[i] != null){
              System.out.println("Nome: "+this.getNome());
              System.out.println("Cpf:  "+this.getCpf());
              System.out.println("Dat/Nasc: "+this.getDataNascimento());
              System.out.println("Serviços: "+this.getServicos());
              System.out.println("Cadastrado ? "+this.getCadastrado());
         }
     }
}

@Override
public void servicos(int x){
      int escolha = x;  
      switch(escolha){
          case 1:
                 if(this.getCadastrado() == true ){
                   if(this.getServicos().equals("pedreiro")|| this.getServicos().equals("Pedreiro")){
                        System.out.println("Disponíveis para o serviço: ");
                        System.out.println("- "+this.getNome());  
                   } 
                 }else{
                 System.out.println("No momento não temos nenhum trabalhador disponível para esta modalidade");
                 }
          break;           
          case 2:
                 if(this.getCadastrado() == true ){
                     if(this.getServicos().equals("encanador")|| this.getServicos().equals("Encanador")){
                        System.out.println("Disponíveis para o serviço: ");
                        System.out.println("- "+this.getNome());  
                     } 
                }else{
                        System.out.println("No momento não temos nenhum trabalhador disponível para esta modalidade");
                 }
          break;
          case 3:
                 if(this.getCadastrado() == true ){
                     if(this.getServicos().equals("pintor")|| this.getServicos().equals("Pintor")){
                        System.out.println("Disponíveis para o serviço: ");
                        System.out.println("- "+this.getNome());  
                     } 
                }else{
                        System.out.println("No momento não temos nenhum trabalhador disponível para esta modalidade");
                 }
          break;
          case 4:
                 if(this.getCadastrado() == true ){
                     if(this.getServicos().equals("eletricista")|| this.getServicos().equals("Eletricista")){
                        System.out.println("Disponíveis para o serviço: ");
                        System.out.println("- "+this.getNome());  
                     } 
                 }else{
                        System.out.println("No momento não temos nenhum trabalhador disponível para esta modalidade");
                 }          
          break;
          default:
                 if(this.getCadastrado() == true || this.getCadastrado() == false){  
                        System.out.println("Esta modalidade não está disponível no momento, mais em breve com certeza estará ;)");
                 }       
      }

}

@Override
public void sobre(){
                    System.out.print("O Severino é uma plataforma criada com o intuito de fornecer um serviço de busca e contratação ");
                    System.out.print("voltados para profissionais autônomos que realizam seus trabalhos em residências");
    
}


}
