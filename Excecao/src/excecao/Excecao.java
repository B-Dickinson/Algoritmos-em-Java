package excecao;

public class Excecao {

    public static void main(String[] args) {
        // tratando excecoes    
        try {
        int vetor[] = new int[4];
        System.out.println("Antes da exceção: ");
        
        vetor[5] = 10;
        System.out.println("Esse texto nao será impresso");
        } catch(ArrayIndexOutOfBoundsException e) {
               System.out.println("Exceção ao acessar um índice do vetor que nao existe");
        }
               System.out.println("Após a exception");
    }
    
}
