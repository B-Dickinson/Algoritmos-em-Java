// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class Categoria {
      private String categoriaNome;
      private double categoriaValor;

public Categoria(String nome){
      this.categoriaNome = nome;      
}   

public Categoria(String categoriaNome,double categoriaValor){
      this.categoriaNome = categoriaNome;
      this.categoriaValor = categoriaValor;  
}

public String getNome() {
      return categoriaNome;
}

public void setNome(String categoriaNome) {
      this.categoriaNome = categoriaNome;
}

public double getValor() {
      return categoriaValor;
}

public void setValor(double categoriaValor) {
      this.categoriaValor = categoriaValor;
}



}
