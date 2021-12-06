package excecoes7;

public class Teste extends Exception{
       private int num = 0;
       private int dem = 0;

    public Teste(int num, int dem) {
        super();
        this.num = num;
        this.dem = dem;
    }

    @Override
    public String toString() {
        return "Resultado de "+num+" / "+dem+" nao é um inteiro";
    }
    
    
}
