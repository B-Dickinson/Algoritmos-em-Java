package questao6_poo;

public class Livro {
       private String titulo;
       private double preco;
       private double desconto;
       private Autor autor;
       
       public Livro(String titulo,double preco,Autor autor){
             this.titulo = titulo;
             this.preco = preco;
             this.desconto = 0;
             this.autor = autor;
       }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
          return "Título do Livro: "+this.getTitulo()+"\nPreço: "+this.getPreco()
          +"\nDesconto: "+this.getDesconto()+"\nAutor: "+this.autor.getNome()+""+this.autor.getSobrenome();
    }   
}
