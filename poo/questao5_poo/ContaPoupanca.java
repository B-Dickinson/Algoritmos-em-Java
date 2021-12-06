package questao5_poo;

public class ContaPoupanca extends Conta {
       private double saldo;
       private double taxaRendimento;

public ContaPoupanca(int numero, String agencia, Cliente proprietario){
       super(numero, agencia, proprietario);
       this.setNumero(numero);
       this.setAgencia(agencia);
       this.setProprietario(proprietario);
       this.setSaldo(0);
       this.setTaxaRendimento(0);
}


public void depositar(double x){
       this.setSaldo(x);
}

public void sacar(double x){
       this.setSaldo(this.getSaldo() - x);
}

public String meuPerfil(){
    return "Nome: "+this.getProprietario().getNome()+"\nCpf: "+this.getProprietario().getCpf()
    +"\nData Nascimento: "+this.getProprietario().getDataNascimento()+"\nTelefone: "+this.getProprietario().getTelefone()
    +"\nEndereço: "+this.getProprietario().getEndereco()+"\nNúmero da conta: "+this.getNumero()+"\nAgencia: "+this.getAgencia()
    +"\nSaldo: "+this.getSaldo();
}

public String consultarSaldo(){
       return "Saldo: "+this.getSaldo();
}

public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public double getTaxaRendimento() {
    return taxaRendimento;
}

public void setTaxaRendimento(double taxaRendimento) {
    this.taxaRendimento = taxaRendimento;
}      

@Override
public void atualizaConta(){
     this.setSaldo(this.getSaldo() + (this.getSaldo() * 0.02f));
}


    
}
