package aulapoo12b;

public class Mamifero extends Animal {
      private String corDoPelo;
      
      public String getCorDoPelo(){
            return this.corDoPelo;
      }
      
      public void setCorDoPelo(String c){
            this.corDoPelo = c;
      }
      
      @Override
      public void locomover(){
            System.out.println("Correndo");
      }
      @Override
      public void alimentar(){
            System.out.println("Mamando");
      }
      @Override
      public void emitirSom(){
            System.out.println("Emitindo som de mamífero");
      }
}
