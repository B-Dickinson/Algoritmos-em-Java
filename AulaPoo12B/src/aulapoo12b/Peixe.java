package aulapoo12b;

public class Peixe extends Animal{
       private String corDaEscama;
       public void soltarBolha(){
             System.out.println("Soltou uma bolhinha");
       }

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
       
    @Override
    public void locomover(){
          System.out.println("Nadando...");
    }
    @Override
    public void alimentar(){
          System.out.println("Comendo substâncias");
    }
    @Override
    public void emitirSom(){
          System.out.println("Peixe não emite som");
    }    
}
