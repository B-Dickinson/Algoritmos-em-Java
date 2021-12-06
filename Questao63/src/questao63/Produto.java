package questao63;

public class Produto {
       private float preco;
       private String nome;
       private int quantidade;
       
    public Produto(String nome, float preco){
            this.nome = nome;
            this.preco = preco;
            this.quantidade = 20;
    }
    
    public void status(){
            System.out.println("Nome produto: "+this.getNome());
            System.out.println("Preço: "+this.getPreco());
            System.out.println("Quantidade: "+this.getQuantidade());
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
       
       
    
}
