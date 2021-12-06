package questao5_poo;

public class ContaCorrente extends Conta implements Tributavel {
       private double saldo;
       private double limiteDeSaque;
       private double tributos;
       private SeguroDeVida seguro = new SeguroDeVida(42);

public ContaCorrente(int numero, String agencia, Cliente proprietario){
       super(numero, agencia, proprietario);
       this.setNumero(numero);
       this.setAgencia(agencia);
       this.setProprietario(proprietario);
       this.setSaldo(0);
       this.setLimiteDeSaque(0);
}

public void depositar(double x){
       this.setSaldo(x);
}

public void sacar(double x){
       this.setSaldo(this.getSaldo() - x);
}

public void transferir(ContaCorrente x, double valor){
       this.setSaldo(this.getSaldo() - valor);
       x.setSaldo(valor);
}
public String meuPerfil(){
    return "Nome: "+this.getProprietario().getNome()+"\nCpf: "+this.getProprietario().getCpf()
    +"\nData Nascimento: "+this.getProprietario().getDataNascimento()+"\nTelefone: "+this.getProprietario().getTelefone()
    +"\nEndereço: "+this.getProprietario().getEndereco()+"\nNúmero da conta: "+this.getNumero()+"\nAgencia: "+this.getAgencia()
    +"\nTaxa Tributável: "+this.getTributos()+"\nTaxa do Seguro de Vida: "+this.seguro.getTaxaFixa()+"\nSaldo: "
    +this.getSaldo();
}

public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public double getLimiteDeSaque() {
    return limiteDeSaque;
}

public void setLimiteDeSaque(double limiteDeSaque) {
    this.limiteDeSaque = limiteDeSaque;
}  

@Override
public void atualizaConta(){
      this.setSaldo(this.getSaldo() + (this.getSaldo() * 0.03f));
}

public double getTributos() {
    return tributos;
}

public void setTributos(double tributos) {
    this.tributos = tributos;
}

@Override
public double calculaTributos() {
    this.setTributos(this.getSaldo() * 0.01);
    this.setSaldo(this.getSaldo() - this.getTributos() - this.seguro.getTaxaFixa());
    return this.getSaldo();
}

public SeguroDeVida getSeguro() {
    return seguro;
}

public void setSeguro(SeguroDeVida seguro) {
    this.seguro = seguro;
}




    
}
