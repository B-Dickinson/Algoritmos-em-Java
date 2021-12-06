package atvpoo;


public class Guitarra {
        
       private String marca;
       private String modelo;
       private String cor;
       private int cordas;
       private float tam_cordas;
       private String modelo_captador;
       private int qtd_captador;
       private boolean ligada;
       private boolean afinada;
       
       public String getMarca(){
             return this.marca;
       }
       
       public void setMarca(String marca){
              this.marca = marca;
       }
       
       public String getModelo(){
              return this.modelo;
       }
       
       public void setModelo(String modelo){
              this.modelo = modelo;
       }
       
       public String getCor(){
              return this.cor;
       }
       
       public void setCor(String cor ) {
              this.marca = cor;
       }
       
       public Integer getCordas(){
              return this.cordas;
       }
       
       public void setCordas(int cordas){
              this.cordas = cordas;
       }
       
       public Float getTam_cordas(){
              return this.tam_cordas;
       }
       
       public void setTam_cordas(float tam){
              this.tam_cordas = tam;
       }
       
       public String getModelo_captador(){
              return this.modelo_captador;
       }
       
       public void setModelo_captador(String modelo_captador){
              this.modelo_captador = modelo_captador; 
       }
       
       public Integer getQtd_captador(){
              return this.qtd_captador;
       }
       
       public void setQtd_captador(int qtd_captador){
              this.qtd_captador = qtd_captador;
       }
       
       public Boolean getLigada(){
              return this.ligada;
       }
       
       public void setLigada(boolean ligada){
              this.ligada = ligada;
       }
       
       public Boolean getAfinada(){
              return this.afinada;
       }
       
       public void setAfinada(boolean afinada){
              this.afinada = afinada;
       }
       
              
       public void status(){
            System.out.println("Marca: "+this.getMarca());
            System.out.println("Modelo: "+this.getModelo());
            System.out.println("Cor: "+this.getCor());
            System.out.println("Quantidade de Cordas: "+this.getCordas());
            System.out.println("Possuo "+this.getQtd_captador() +" captadores "+this.getModelo_captador());
            System.out.println("Cordas tamanho: "+this.getTam_cordas());
            System.out.println("Estou Ligada? "+this.getLigada());
            System.out.println("Estou Afinada? "+this.getAfinada());
       }
       
       protected void afinar(){
            if (afinada == true){
                System.out.println("Estou afinada."); 
            } else {
                System.out.println("Seja um bom mestre e me afine, por favor.");
            }
       }
       
       protected void tocar(){
            System.out.println("pele len pele len pele len pele len");
       }
       
       protected void ligada(){
            this.ligada = true;
            System.out.println("Estou ligada e e pronta para tocar Tempo Perdido...");
       }
       
       protected void desligada(){
            this.ligada = false;
            System.out.println("Estou desligada :( ");
       }
       
    
}
       
       
    

