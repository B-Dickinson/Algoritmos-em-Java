package questao0007;

public class Ferramenta implements Ferramentas {
       private Animais[] animal = new Animais[5]; 
       private Animais[] resultado = new Animais[5];
       private int quantidade;
       private int quantidadeFelino = 0;
       private int quantidadePeixe = 0;
       private int quantidadeAve = 0;
       private int quantidadeReptil = 0;
    
public Ferramenta(){

}

public Animais[] getAnimal() {
    return animal;
}

public Animais[] getResultado() {
    return resultado;
}

public void setResultado(Animais[] resultado) {
    this.resultado = resultado;
}

public void setAnimal(Animais [] animal) {
    this.animal = animal;
}

@Override
public void filtraEspecie(Animais[] completo, String especieFiltrar) {

        this.animal = completo;

    for(int i = 0; i < animal.length;i++){
     
        if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Felino")&& this.animal[i].getNomeEspecie().equalsIgnoreCase(especieFiltrar)){
            this.animal[i].setQtd(this.animal[i].getQtd()+ 1);
            this.setQuantidadeFelino(this.getQuantidadeFelino() + 1);
            this.setQuantidade(this.getQuantidade() + 1);
        }else if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Réptil")&& this.animal[i].getNomeEspecie().equalsIgnoreCase(especieFiltrar)){
            this.animal[i].setQtd(this.animal[i].getQtd() + 1);
            this.setQuantidadeReptil(this.getQuantidadeReptil() + 1);
            this.setQuantidade(this.getQuantidade() + 1);
        }else if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Ave")&& this.animal[i].getNomeEspecie().equalsIgnoreCase(especieFiltrar)){
            this.animal[i].setQtd(this.animal[i].getQtd() + 1);
            this.setQuantidadeAve(this.getQuantidadeAve() + 1);
            this.setQuantidade(this.getQuantidade() + 1);
        }else if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Peixe")&& this.animal[i].getNomeEspecie().equalsIgnoreCase(especieFiltrar)){
            this.animal[i].setQtd(this.animal[i].getQtd() + 1);
            this.setQuantidadePeixe(this.getQuantidadePeixe() + 1);  
            this.setQuantidade(this.getQuantidade() + 1);  
        }

        
    } 
           if(this.quantidade == 0){
           System.out.println("Animal não listado!");    
           } else{
           System.out.println("Quantidade: "+this.getQuantidade());  
           }
}
@Override
public void classificaEspecie(Animais[] completo) {
    this.animal = completo;    

    for(int i = 0; i < animal.length; i++){

    if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Felino")){  
    System.out.println();    
    this.animal[i].setQtd(this.getQuantidadeFelino());
    System.out.println("Felinos: "+this.animal[i].getNome());     
    System.out.println();
    } 
    if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Ave")){
    System.out.println();    
    this.animal[i].setQtd(this.getQuantidadeAve()); 
    System.out.println("Aves: "+this.animal[i].getNome());   
    System.out.println();    
    }    
    if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Peixe")){
    System.out.println();    
    this.animal[i].setQtd(this.getQuantidadePeixe());
    System.out.println("Peixes: "+this.animal[i].getNome());     
    System.out.println();    
    }
    if(this.animal[i].getNomeEspecie().equalsIgnoreCase("Réptil")){
    System.out.println();   
    this.animal[i].setQtd(this.getQuantidadeReptil()); 
    System.out.println("Répteis: "+this.animal[i].getNome());   
    System.out.println();    
    }
    }


}








public int getQuantidadeFelino() {
    return quantidadeFelino;
}

public void setQuantidadeFelino(int quantidadeFelinos) {
    this.quantidadeFelino = quantidadeFelinos;
}

public int getQuantidadePeixe() {
    return quantidadePeixe;
}

public void setQuantidadePeixe(int quantidadePeixe) {
    this.quantidadePeixe = quantidadePeixe;
}

public int getQuantidadeAve() {
    return quantidadeAve;
}

public void setQuantidadeAve(int quantidadeAve) {
    this.quantidadeAve = quantidadeAve;
}

public int getQuantidadeReptil() {
    return quantidadeReptil;
}

public void setQuantidadeReptil(int quantidadeReptil) {
    this.quantidadeReptil = quantidadeReptil;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}





}
