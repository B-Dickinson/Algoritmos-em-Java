package thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Teste {
    
    public static void main(String[] args) {
           Thread3 thread1 = new Thread3("#1",500); 
           Thread3 thread2 = new Thread3("#2",500); 
           Thread3 thread3 = new Thread3("#3",500);
           
           Thread t1 = new Thread(thread1);
           Thread t2 = new Thread(thread2);
           Thread t3 = new Thread(thread3);
           
           t1.start();
           
       
           
           t2.start();
           
      
           
           
           t3.start();
           
           
           
           
        
            t1.setPriority(9);
            t2.setPriority(10);
            t3.setPriority(5);
            
        
           System.out.println("Programa Finalizado");
           
    }
    
}

/*

o join me permite continuar o programa só após as threads acabarem

*/
