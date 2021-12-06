package aula04;


public class Caneta {
       private String modelo;
       private float ponta ;
       private String cor;
       private boolean tampada;
       

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
       
       void status(){
             System.out.println("Sobre a caneta:");
             System.out.println("Modelo: "+this.getModelo());
             System.out.println("Ponta: "+this.getPonta());
             System.out.println("Cor: "+this.getCor());
             System.out.println("Está tampada? "+this.getTampada());
       }
       
       void tampar(){
             this.tampada = true;
       }
       
       void destampar(){
             this.tampada = false;
       }
        
    
}
