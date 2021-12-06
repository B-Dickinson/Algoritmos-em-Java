
package minhathread;

public class Teste {
    
      public static void main(String[] args) {
          try {
              MinhaThread thread = new MinhaThread("Thread #1");
          } catch (InterruptedException ex) {
              ex.getMessage();
          }
    }
}
