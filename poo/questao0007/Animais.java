package questao0007;

public class Animais implements Animal{
       private String nome;
       private String especie;
       private int qtd = 0;
       
public Animais(String nome, String especie){
      this.nome= nome;
      this.especie = especie;  
      this.qtd = 0;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setEspecie(String especie) {
    this.especie = especie;
}

@Override
public String nomeEspecie() {

    return "Espécie: "+this.getNomeEspecie();
}

@Override
public String getNomeEspecie() {
    return especie;

}

public int getQtd() {
    return qtd;
}

public void setQtd(int qtd) {
    this.qtd = qtd;
}

  
    
}
