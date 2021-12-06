package thread1;

public class Thread1 extends Thread {
        private String nome;
        
public Thread1(String nome){
        this.nome = nome;
        start();
}        
       
        @Override
        public void run(){
              for(int i=1; i <= 2;i++){
                  System.out.println("**** "+this.nome+" em execução****");
                  try {
                      Thread.sleep(1*1000);
                  } catch (InterruptedException ex) {
                      ex.getMessage();
                  }
              }
                      System.out.println("Thread Finalizado");
        }

          
}
