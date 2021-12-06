package lutadoraula07b;


public class Lutador {
       private String nome;
       private String nacionalidade;
       private int idade;
       private float altura;
       private float peso;
       private String categoria;
       private int vitorias,derrotas,empates;
       
       public void apresentar(){
             System.out.println("CHEGOU A HORA! Apresentamos o lutador "+this.getNome());
             System.out.println("Diretamente de "+this.getNacionalidade());
             System.out.println("Com "+this.getIdade() + " e "+this.getAltura()+" metros");
             System.out.println("Pesando "+this.getPeso()+" Kg");
             System.out.println(this.getVitorias()+" vitorias");
             System.out.println(this.getDerrotas()+" derrotas");
             System.out.println(this.getEmpates()+" empates");
       }
       
       public void status(){
             System.out.println(this.getNome()+" é um peso "+this.getCategoria());
             System.out.println("Ganhou "+this.getVitorias());
             System.out.println("Perdeu "+this.getDerrotas());
             System.out.println("Empatou "+this.getEmpates());
       }
       
       public void ganharLuta(){
             this.setVitorias(this.getVitorias() + 1);
       }
       
       public void perderLuta(){
             this.setDerrotas(this.getDerrotas() + 1);
       }
       
       public void empatarLuta(){
             this.setEmpates(this.getEmpates() + 1);
       }
       
       public Lutador(String no, String na,int id, float al, float pe, int vi,
                      int de, int em){
           
            this.nome = no;
            this.nacionalidade = na;
            this.idade = id;
            this.altura = al;
            this.setPeso(pe);
            this.vitorias = vi;
            this.derrotas = de;
            this.empates = em;
       }
       
       public String getNome(){
             return this.nome;
       }
       
       public void setNome(String no){
             this.nome = no;
       }
       
       public String getNacionalidade(){
             return this.nacionalidade;
       }
       
       public void setNacionalidade(String na){
             this.nacionalidade = na;
       }
       
       public int getIdade(){
             return this.idade;
       }
       
       public void setIdade(int id){
             this.idade = id;
       }
       
       public float getAltura(){
             return this.altura;
       }
       
       public void setAltura(float al){
             this.altura = al;
       }
       
       public float getPeso(){
             return this.peso;
       }
       
       public void setPeso(float peso){
             this.peso = peso;
             this.setCategoria();
       }
       
       public String getCategoria(){
             return this.categoria;
       }
       
       private void setCategoria(){
           if(this.getPeso() < 52.2){
              this.categoria = "Inválido";
           } else if(this.getPeso() <= 70.3){
              this.categoria = "Leve"; 
           } else if(this.getPeso() <= 83.9){
              this.categoria = "Médio";
           } else if(this.getPeso() <= 120.2){
              this.categoria = "Pesado";
           } else {
              this.categoria = "Inválido";
           }    
       }
       
       public int getVitorias(){
             return this.vitorias;
       }
       
       public void setVitorias(int vi){
             this.vitorias = vi;
       }
       
       public int getDerrotas(){
             return this.derrotas;
       }
       
       public void setDerrotas(int de){
             this.derrotas = de;
       }
       
       public int getEmpates(){
             return this.empates;
       }
       
       public void setEmpates(int em){
             this.empates = em;
       }
       
       
}
