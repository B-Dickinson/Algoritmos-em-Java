package questao6_poo;

public class AudioBook extends Livro {
       private int duracao;

       public AudioBook(String titulo,double preco,Autor autor,int duracao){
             super(titulo, preco,autor);
             this.setDuracao(duracao);
       }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return "Título: "+this.getTitulo()+"\nPreço: "+this.getPreco()+"\nAutor: "+this.getAutor().getNome()
        +this.getAutor().getSobrenome()+"\nDuração: "+this.getDuracao();
    }
       
}
