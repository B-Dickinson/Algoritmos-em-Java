// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class Apartamento {
       private int solteiro;
       private int casal;
       private int numero;
       private Categoria cat;
       
public Apartamento(){

}   

public Apartamento(int solteiro, int casal, int numero){
      this.solteiro = solteiro;
      this.casal = casal;
      this.numero = numero;  
}

public int getSolteiro() {
    return solteiro;
}

public void setSolteiro(int solteiro) {
    this.solteiro = solteiro;
}

public int getCasal() {
    return casal;
}

public void setCasal(int casal) {
    this.casal = casal;
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public Categoria getCat() {
    return cat;
}

public void setCat(Categoria cat) {
    this.cat = cat;
}




}
