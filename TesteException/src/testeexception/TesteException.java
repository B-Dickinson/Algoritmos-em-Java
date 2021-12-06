package testeexception;

public class TesteException {

    public static void main(String[] args) {
          int x = 9;
          int y = 0;
          try {
              int r = x / y;
          throw new MinhaException(x,y);    
          } catch(MinhaException e){
                 e.getMessage();
          }

    }
}
