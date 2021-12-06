// Criado por: Bruce Dickson RA: 2011710037
// Thcylla Sá RA: 2011710042

package severino;

public class Usuario {
       protected String nome;
       protected String cpf;
       protected String dataNascimento; 
       protected String endereco;  
       protected boolean cadastroUsuario;
       protected int servicoNecessario;

public Usuario(String nome, String cpf, String dataNascimento){
       this.nome = nome;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
}       
       
public Usuario(){
    
}     

protected void stts(){
    System.out.println("Nome: "+this.getNome());
    System.out.println("Cpf:  "+this.getCpf());
    System.out.println("Dat/Nasc: "+this.getDataNascimento());
    System.out.println("Endereço: "+this.getEndereco());  
}

protected int getServicoNecessario(){
      return this.servicoNecessario;
}

protected void setServicoNecessario(int servicoNecessario){
      this.servicoNecessario = servicoNecessario;
}

protected String getNome() {
    return this.nome;
}

protected void setNome(String nome) {
    this.nome = nome;
}

protected String getCpf() {
    return cpf;
}

protected void setCpf(String cpf) {
    this.cpf = cpf;
}

protected String getDataNascimento() {
    return dataNascimento;
}

protected void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

protected boolean getcadastroUsuario() {
    return cadastroUsuario;
}

protected void setcadastroUsuario(boolean cadastroUsuario) {
    this.cadastroUsuario = cadastroUsuario;
}


protected void sobre(){
    System.out.print("O Severino é uma plataforma criada com o intuito de fornecer um serviço de busca e contratação ");
    System.out.print("voltados para profissionais autônomos que realizam seus trabalhos em residências");
    System.out.println("");
}

protected String getEndereco() {
    return endereco;
}

protected void setEndereco(String endereco) {
    this.endereco = endereco;
}


}


