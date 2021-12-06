package testeexception;

public class MinhaException extends Exception {
       private int x;
       private int y;

    public MinhaException(int x, int y) {
        this.x = x;
        this.y = y;
        
        if(this.y == 0){
            System.out.println("Nao pode");
        }
    }
       
       
    
    
       
       
    
}
