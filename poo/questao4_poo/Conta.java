package questao4_poo;

public class Conta {
      private int numero;
      private int agencia;
      private double saldo;
      private double limite;
      private Cliente proprietário;
    public Conta(int numero, int agencia, Cliente proprietário) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
        this.limite = 0;
        this.proprietário = proprietário;
    }

    public void depositar(float x){
          this.setSaldo(x);
    }

    public void sacar(float x){
        if(this.getSaldo() > 0){
            this.setSaldo(this.getSaldo() - x);
        } else {
            System.out.println("Você não possui Saldo");
        }  
    }

    public void ajusteLimite(float x){
            if(this.getSaldo() == 0){
                 System.out.println("Você não possui saldo na conta");
            } else if(this.getLimite() <= this.getSaldo()){
                 this.setLimite(this.getLimite() + x);
          } else {
               System.out.println("Limite indisponível"); 
          }
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public Cliente getProprietário() {
        return proprietário;
    }

    @Override
    public String toString(){
        return "Nome do Proprietário: "+this.getProprietário().getNome()+"\nAgência: "+this.getAgencia()
        +"\nConta: "+this.getNumero()+"\nSaldo: "+this.getSaldo()+"\nLimite: "+this.getLimite();
    }


      


}
