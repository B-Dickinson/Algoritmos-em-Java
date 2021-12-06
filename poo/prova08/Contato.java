package prova08;

public class Contato {
       private String nome;
       private String email;
       private String endereco;
       private String numeroCelular;
       private String numeroFixo;


public Contato(String nome, String email, String endereco, String numeroCelular, String numeroFixo) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numeroCelular = numeroCelular;
        this.numeroFixo = numeroFixo;
}




public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}


public String getEndereco() {
    return endereco;
}


public void setEndereco(String endereco) {
    this.endereco = endereco;
}


public String getNumeroCelular() {
    return numeroCelular;
}


public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
}


public String getNumeroFixo() {
    return numeroFixo;
}


public void setNumeroFixo(String numeroFixo) {
    this.numeroFixo = numeroFixo;
}



public String imprimirContato() {
    return "email: " + email + "\nendereco: " + endereco + "\nnome: " + nome + "\nnumeroCelular: " + numeroCelular
            + "\nnumeroFixo: " + numeroFixo;
}




       
    
}
