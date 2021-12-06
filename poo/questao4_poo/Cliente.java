package questao4_poo;

public class Cliente {
      private String nome;
      private String cpf;
      private String data_nascimento;
      private String endereco;
      private String telefone;

    public Cliente(String nome, String cpf, String data_nascimento, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Cliente: "+this.getNome()+"\nCpf: "+this.getCpf()+"\nDat/Nasc: "+this.getData_nascimento()
        +"\nEndereço: "+this.getEndereco()+"\nTelefone: "+this.getTelefone();
    }

    

      
}