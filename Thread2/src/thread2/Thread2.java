package thread2;


public class Thread2 implements Runnable {
        private String nome;
        private int tempo;
        
public Thread2(String nome,int valor){
        this.nome = nome;
        this.tempo = valor;
        Thread t = new Thread(this);// estou passando a propria classe como parametro
        t.start();
}        
       
        @Override
        public void run(){
          
        for(int i=0; i < 6;i++){
            System.out.println(nome+" contador "+i);
            
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }   
                System.out.println(nome+" terminou a execução");
        }
  
}
