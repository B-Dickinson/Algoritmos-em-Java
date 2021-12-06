package atv14b;

public class Atv14B {

    public static void main(String[] args) {
           Video v[] = new Video[3];
           Gafanhoto g[] = new Gafanhoto[3];
           
           g[0] = new Gafanhoto("Bruce",20,"M","Brucinho");
           g[1] = new Gafanhoto("BIanca",19,"F","Bianquinha");
           g[2] = new Gafanhoto("Black",4,"M","blackinho");
           
           v[0] = new Video("Aula 1 de Poo");
           v[1] = new Video("Aula 12 de PHP");
           v[2] = new Video("Aula 10 de HTML5");
           
    
          
          Visualizacao z[] = new Visualizacao[3];
            
          z[0] = new Visualizacao(g[0],v[0]);
          v[0].play();
          z[1] = new Visualizacao(g[1],v[1]); 
          z[2] = new Visualizacao(g[0],v[2]); 
          System.out.println(z[0].toString());
          
    } 
}
