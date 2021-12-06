package severino;

public class Usuario {
       private String nome;
       private String cpf;
       private String dataNascimento; 
       private Profissional profissional;
       private boolean cadastro;

public Usuario(String nome, String cpf, String dataNascimento){
       this.nome = nome;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
}       
       
public Usuario(){
    
}       

public String getNome() {
    return nome;
}

public void stts(){
    System.out.println("Nome: "+this.getNome());
    System.out.println("Cpf:  "+this.getCpf());
    System.out.println("Dat/Nasc: "+this.getDataNascimento());  
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getDataNascimento() {
    return dataNascimento;
}

public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
}

public Profissional getProfissional() {
    return profissional;
}

public void setProfissional(Profissional profissional) {
    this.profissional = profissional;
}

public boolean getCadastro() {
    return cadastro;
}

public void setCadastro(boolean cadastro) {
    this.cadastro = cadastro;
}


public void sobre(){
    System.out.print("O Severino é uma plataforma criada com o intuito de fornecer um serviço de busca e contratação ");
    System.out.print("voltados para profissionais autônomos que realizam seus trabalhos em residências");
}

}


