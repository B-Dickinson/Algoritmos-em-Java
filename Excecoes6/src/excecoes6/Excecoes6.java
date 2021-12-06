package excecoes6;

public class Excecoes6 {

    public static void main(String[] args) {
        // finally e System.exit(0);
            int numeros[] = {4,8,16,32,64,128};
        int denom[] = {2,0,4,8,0};
        
        for(int i=0; i < numeros.length;i++){
        try {    
            System.out.println(numeros[i] + " / "+denom[i]+" = "+ (numeros[i] / denom[i]));
        } catch(ArithmeticException e1){
            System.out.println("Erro ao dividir por zero");
            System.exit(0);
        } catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Posicao do array inválida");
            System.exit(0);
        }
        finally{
            System.out.println("Essa linha é impressa após o Try ou Catch"); 
            System.out.println("");
        }
        
        }
    }
    
}
