package questao1_poo;

public class Conta {
      private String nome;
      private String cpf;
      private String agencia;
      private String numero; 
      private float saldo;
      private float limite;
      
      public Conta(String no,String cpf,String a,String n){
            this.nome = no;
            this.cpf = cpf;
            this.agencia = a;
            this.numero = n;
            // Supondo que todas as contas ja se iniciam com mil reais
            this.saldo = 1000f;
            // Um limite previamente atribuído também
            this.limite = 500f;
            
      }

      public String status(){
            return "Nome: "+this.getNome()+"\nCpf: "+this.getCpf()+"\nAgencia: "+this.getAgencia()
            +"\nNúmero da Conta: "+this.getNumero();
      }

      public String consultaSaldo(){
             return "\nSaldo atual: R$"+this.getSaldo()
             +"\nLimite atual: R$"+this.getLimite();
      }

      public void sacar(float saque){
             if (saque <= this.getSaldo()){
                 this.setSaldo(this.getSaldo() - saque);
                 this.setLimite(this.getLimite() - saque); 
             } else {
                 System.out.println();  
                 System.out.println("Saldo insuficiente para a realização do saque");
             }

      }
             /* o cliente pode aumentar o tanto que for,
                contanto que seja um valor menor que o saldo atual
             */
      public void ajustaLimite(float aj){
             if (aj <= getSaldo()){
                  this.setLimite(aj);
                  System.out.println();
                  System.out.println("Aumento realizado!");    
             } else {
                  System.out.println();  
                  System.out.println("O limite excede o valor disponível para saque"); 
                  // quando ocorre essa situação, o valor do limite volta ao valor padrão
                  // dado pelo construtor
             }
      }

      public String getNome(){
            return this.nome;
      }

      public void setNome(String nome){
            this.nome = nome;
      }

      public String getCpf(){
            return this.cpf;
      }

      public void setCpf(String cpf){
            this.cpf = cpf;
      }

      public String getAgencia(){
            return this.agencia;
      }

      public void setAgencia(String agencia){
            this.agencia = agencia;
      }

      public String getNumero(){
            return this.numero;
      }

      public void setNumero(String num){
            this.numero = num;
      }

      public float getSaldo(){
            return this.saldo;
      }

      public void setSaldo(float saldo){
            this.saldo = saldo;
      }

      public float getLimite(){
            return this.limite;
      }

      public void setLimite(float limite){
            this.limite = limite;
      }
}
