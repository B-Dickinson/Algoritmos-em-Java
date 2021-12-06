package questao65;

public class Livro {
       private String titulo;
       private String autor;
       private String codigo;
       private int paginas;

    public Livro(String titulo, String autor, String codigo, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
       
    @Override
    public String toString(){
        return "Titulo: "+this.getTitulo()+"\nAutor: "+this.getAutor()+"\nCódigo do Livro: "+this.getCodigo()
                +"\nQuantidade de páginas: "+this.getPaginas();
    }
       
    
}
