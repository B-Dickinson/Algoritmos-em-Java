package atividade2poo;
/*

esse foi o meu exemplo de atividade

*/

public class ContaBancaria {
    
             public int numeroDaConta;
             protected String tipoDaConta;
             private String nomeDoDono;
             private float saldo;
             private boolean status;
             
             public void ContaBancaria(){
                    this.setSaldo(0);
                    this.setStatus(false);
             }
             
             public void stts(){
                    System.out.println("--------------------------------");
                    System.out.println("Conta: "+this.getNumeroDaConta());
                    System.out.println("Tipo: "+this.getTipoDaConta());
                    System.out.println("Dono: "+this.getNomeDoDono());
                    System.out.println("Saldo: "+this.getSaldo());
                    System.out.println("Status "+this.getStatus());
             }

             
             public int getNumeroDaConta(){
                    return this.numeroDaConta;
             }
             
             public void setNumeroDaConta(int numero){
                    this.numeroDaConta = numero; 
             }
             
             public String getTipoDaConta(){
                    return this.tipoDaConta;
             }
             
             public void setTipoDaConta(String tipo){
                       this.tipoDaConta = tipo;       
             }
             
             public String getNomeDoDono(){
                    return this.nomeDoDono;
             }
             
             public void setNomeDoDono(String nome){
                    this.nomeDoDono = nome;
             }
             
             public float getSaldo(){
                    return this.saldo;
             }
             
             public void setSaldo(float saldo){
                    this.saldo = saldo;
             }
             
             public boolean getStatus(){
                    return this.status;
             }
             
             public void setStatus(boolean status){
                    this.status = status;
             }
    
             public void abrirConta(String t){
                    this.setTipoDaConta(t);
                    this.setStatus(true);
                    if (t.equals("cc")){
                         this.setSaldo(50f);   
                    } else if(t.equals("cp")){
                         this.setSaldo(150f);
                    }
                         System.out.println("Conta aberta com sucesso!");
             }   
             
             public void fecharConta(){
                    if (this.getSaldo() > 0){
                        System.out.println("Conta nao pode ser fechada porque ainda tem dinheiro");
                    } else if(this.getSaldo() < 0){
                        System.out.println("Conta em débito");
                    } else {
                        this.setStatus(false); 
                        System.out.println("Conta fechada com Sucesso!");
                    }    
                         
             }
             
             public void depositar(float v){
                    if (this.getStatus() == true){
                        this.setSaldo(getSaldo() + v);
                        System.out.println("Depósito realizado na conta de "+this.getNomeDoDono());
                    } else {
                        System.out.println("Impossivel depositar em uma conta fechada");
                    }
             }
             
             public void sacar(float v){
                    if (this.getStatus() == true){
                        if (this.getSaldo() >= v){
                            this.setSaldo(this.getSaldo() - v); 
                            System.out.println("Saque realizado na conta de "+this.getNomeDoDono());
                        } else{
                            System.out.println("Saldo insuficiente para saque");
                        }
                    } else{
                            System.out.println("Impossível Sacar de uma conta fechada");
                    }  
             }
             
             public void pagarMensalidade(){
                    float v = 0;
                    if (this.getTipoDaConta().equals("cc")){
                            v = 12;
                    } else if (this.getTipoDaConta().equals("cp")){
                            v = 20;
                    }       
                    if (this.getStatus() == true){
                       if (this.getSaldo() > v){
                           this.setSaldo(getSaldo() - v);
                           System.out.println("Mensalidade paga com sucesso!");
                       } else {
                           System.out.println("Saldo Insuficiente"); 
                       }
                    } else {
                           System.out.println("Impossível Pagar uma conta fechada");
                    }
             }

}
