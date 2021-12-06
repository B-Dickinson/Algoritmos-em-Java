package thread3;

public class Thread3 implements Runnable {
        private String nome;
        private int tempo;
        
public Thread3(String nome,int valor){
        this.nome = nome;
        this.tempo = valor;
}        
       
        @Override
        public void run(){
          
        try {    
        for(int i=0; i < 6;i++){
                System.out.println(nome+" contador "+i);
                Thread.sleep(tempo);
        }        
        } catch (InterruptedException ex) {
                ex.getMessage();
            
        }   
                System.out.println(nome+" terminou a execução");
        }
  
}