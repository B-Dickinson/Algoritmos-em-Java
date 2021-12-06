package excecoes7;

public class Excecoes7 {

    public static void main(String[] args) {
        //criando exception
        
        
        int numeros[] = {4,8,5,16,32,64,128};
        int denom[] = {2,0,4,8,0,2,4};
        
        for(int i=0; i < numeros.length;i++){
           
        try { 
            if(numeros[i] % 2 != 0){
                // lancar a exception aqui
                throw new Teste(numeros[i],denom[i]);
            } 
            System.out.println(numeros[i] + " / "+denom[i]+" = "+ (numeros[i] / denom[i]));
            
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException | Teste  e){
               System.out.println("Aconteceu um erro");
               e.printStackTrace();
       
            
        }
        
        }
    }
}
