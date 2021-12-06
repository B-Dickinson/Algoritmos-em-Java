package minhathread;

public class MinhaThread extends Thread {
      private String nome;
      
      
public MinhaThread(String nome) throws InterruptedException{
      this.nome = nome; 
      start();
      
}      
 
      @Override
      public void run(){
      for(int i=0; i <= 5;i++){
          System.out.println(nome+" em execução");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              ex.getMessage();
          }
      }    
}
        
}
