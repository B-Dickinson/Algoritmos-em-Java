package thread1;


public class Teste {
    
    public static void main(String[] args) {
           Thread1 t1 = new Thread1("Thread #1");
           
        try {
            t1.join();
        } catch (InterruptedException ex) {
            ex.getMessage();
        }
        
           Thread1 t2 = new Thread1("Thread #2");
          
        try{   
           t2.join();
        }catch(InterruptedException e){
           e.getMessage();
        }
        
           Thread1 t3 = new Thread1("Thread #3"); 
        
           
           
        
    }
    
}

/*
Exemplo de Threads estendendo a Classe Thread e usando o método join()...
esse método está permitindo que cada thread tenha sua execução separadamente
e a cada término, uma mensagem possa ser digitada na tela avisando o seu fim.

*/