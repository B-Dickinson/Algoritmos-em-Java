package Constantes;

public class Enum1 {
    
    /*
        USADO PARA CONSTANTES
    
            public static void imprime(int dia){
            switch(dia){
                case 1:
                      System.out.println("Domingo");
                break;
                case 2:
                      System.out.println("Segunda-Feira");
                break;
                case 3:
                      System.out.println("Terça-Feira");
                break;
                case 4:
                      System.out.println("Quarta-Feira");
                break;
                case 5:
                      System.out.println("Quinta-Feira");
                break;
                case 6:
                      System.out.println("Sexta-Feira");
                break;
                case 7:
                      System.out.println("Sabado");
                break;
            }
      }
    */
    public static void imprime(DiaSemana dia){
            switch(dia){
                case DOMINGO:
                      System.out.println("Domingo");
                break;
                case SEGUNDA:
                      System.out.println("Segunda-Feira");
                break;
                case TERCA:
                      System.out.println("Terça-Feira");
                break;
                case QUARTA:
                      System.out.println("Quarta-Feira");
                break;
                case QUINTA:
                      System.out.println("Quinta-Feira");
                break;
                case SEXTA:
                      System.out.println("Sexta-Feira");
                break;
                case SABADO:
                      System.out.println("Sabado");
                break;
            }
      }

    public static void main(String[] args) {
        /*
           USANDO CONSTANTES 
           
           int domingo = DiaSemanaConstantes.DOMINGO;
           int segunda = DiaSemanaConstantes.SEGUNDA;
           int terca = DiaSemanaConstantes.TERCA;
           int quarta = DiaSemanaConstantes.QUARTA;
           int quinta = DiaSemanaConstantes.QUINTA;
           int sexta = DiaSemanaConstantes.SEXTA;
           int sabado = DiaSemanaConstantes.SABADO;
           
           imprime(domingo);
           imprime(segunda);
           imprime(terca);
           imprime(quarta);
           imprime(quinta);
           imprime(sexta);
           imprime(sabado);
        */   
        
        // USANDO ENUM
          
          DiaSemana domingo = DiaSemana.DOMINGO;
          DiaSemana segunda = DiaSemana.SEGUNDA;
          DiaSemana terca = DiaSemana.TERCA;
          DiaSemana quarta = DiaSemana.QUARTA;
          DiaSemana quinta = DiaSemana.QUINTA;
          DiaSemana sexta = DiaSemana.SEXTA;
          DiaSemana sabado = DiaSemana.SABADO;
        
        
           imprime(domingo);
           imprime(segunda);
           imprime(terca);
           imprime(quarta);
           imprime(quinta);
           imprime(sexta);
           imprime(sabado);
        
        

    }
}
