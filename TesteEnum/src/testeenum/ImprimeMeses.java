package testeenum;

public class ImprimeMeses {
    
      public void imprime(TesteEnum.Meses m){  // Agregando um atributo da classe TesteEnum do tipo Meses
          switch(m){
              case JAN:
                    System.out.println("Janeiro");
              break;    
              case FEV:
                    System.out.println("Fevereiro");
              break;
              case MAR:
                    System.out.println("Março");
              break;
              case ABR:
                    System.out.println("Abril");
              break;
              case MAI:
                    System.out.println("Maio");
              break;
              case JUN:
                    System.out.println("Junho");
              break;
              case JUL:
                    System.out.println("Julho");
              break;
              case AGO:
                    System.out.println("Agosto");
              break;
              case SET:
                    System.out.println("Setembro");
              break;
              case OUT:
                    System.out.println("Outubro");
              break;
              case NOV:
                    System.out.println("Novembro");
              break;
              case DEZ:
                    System.out.println("Dezembro");
              break;
          }
    }
    
    
}
