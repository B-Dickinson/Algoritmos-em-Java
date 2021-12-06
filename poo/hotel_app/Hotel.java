// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class Hotel extends Apartamento {
      private String nome;
      private String cnpj;
      
public Hotel(){

}   

public Hotel(String nome, String cnpj){
      this.nome = nome;
      this.cnpj = cnpj;   
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCnpj() {
    return cnpj;
}

public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
}

@Override
public String toString(){
    return this.getNome()+"\n";
}

}
