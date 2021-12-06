package questao65;

public class Pessoa {
      private String nome;
      private String cpf;
      private String nascimento;
      private String endereco;
      private String numero_carteira;
      
      public Pessoa(String nome, String cpf, String nascimento
      ,String endereco, String numero){
             
             this.nome = nome;
             this.cpf = cpf;
             this.nascimento = nascimento;
             this.endereco = endereco;
             this.numero_carteira = numero;
      }

    public String getNome() {
        return nome;
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

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero_carteira() {
        return numero_carteira;
    }

    public void setNumero_carteira(String numero_carteira) {
        this.numero_carteira = numero_carteira;
    }

    @Override
    public String toString(){
        return "Cliente: "+this.getNome()+"\nCpf: "+this.getCpf()+"\nData de Nascimento: "+this.getNascimento()
                +"\nEndereço: "+this.getEndereco()+"\nNúmero Carteira: "+this.getNumero_carteira();
    }
    
    
}
