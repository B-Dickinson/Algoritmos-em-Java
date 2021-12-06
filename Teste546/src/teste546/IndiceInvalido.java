package teste546;

public class IndiceInvalido extends Exception {
       private int v[] = new int[4];
       private int z[] = new int[3];
       
       public IndiceInvalido(int v[], int z[]){
              this.v = v;
              this.z = z;
       }

    @Override
    public String toString() {
        if (this.v.length < this.z.length){
        }   
            return "Valor invalido de vetor ";
    }
       
       
    
}
