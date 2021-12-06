package questao5_poo;

public class Conta {
       private int numero;
       private String agencia;
       private Cliente proprietario;

public Conta(int numero, String agencia, Cliente proprietario) {
        this.numero = numero;
        this.agencia = agencia;
        this.proprietario = proprietario;
}

public void atualizaConta(){
    
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public String getAgencia() {
    return agencia;
}

public void setAgencia(String agencia) {
    this.agencia = agencia;
}

public Cliente getProprietario() {
    return proprietario;
}

public void setProprietario(Cliente proprietario) {
    this.proprietario = proprietario;
}



       
    
}
