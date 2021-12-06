package excecoes4;

public class Excecoes4 {

    public static void main(String[] args) {
        // Multi-Catch de exceptions similares(mesma familia)
        int numeros[] = {4,8,16,32,64,128};
        int denom[] = {2,0,4,8,0};
        
        for(int i=0; i < numeros.length;i++){
        try {    
            System.out.println(numeros[i] + " / "+denom[i]+" = "+ (numeros[i] / denom[i]));
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Aconteceu um erro");     
        }
        
        }
    }
    
}
