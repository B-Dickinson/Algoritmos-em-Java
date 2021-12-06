// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class vHotel extends Throwable {
        
    
public static void main(String[] args) {
       Hotel hotel[] = new Hotel[3];
       Apartamento ap[] = new Apartamento[8];
       Hospede hospede[] = new Hospede[3];
       Reserva reserva[] = new Reserva[8];
       Categoria cat[] = new Categoria[5];
       int vagas = 0;
       int i;
       
      try{
       // Hotel
       hotel[0] = new Hotel("Nova-Ilha", "03216549871289");
       //Apartamentos
       ap[0] = new Apartamento(1, 0, 1); // solteiro , casal , número do apartamento
       ap[1] = new Apartamento(0, 1, 2);
       ap[2] = new Apartamento(1, 0, 3);
       ap[3] = new Apartamento(0, 1, 4);
       ap[4] = new Apartamento(1, 0, 5);
       ap[5] = new Apartamento(0, 1, 6);
       ap[6] = new Apartamento(1, 0, 7);
       ap[7] = new Apartamento(0, 1, 8);
       //Categorias
       cat[0] = new Categoria("*", 150);
       cat[1] = new Categoria("**", 300);
       cat[2] = new Categoria("***", 450); // Nome da Categoria(asterisco == estrelas) // Valor da diária
       cat[3] = new Categoria("****", 650);
       cat[4] = new Categoria("*****", 1000);      
       // Hóspedes
       hospede[0] = new Hospede("John Connor", "01655397864");
       hospede[1] = new Hospede("Dr Heisenberg", "55415434697"); // Nome // Cpf
       hospede[2] = new Hospede("Don Corleone", "01655397864");
       //Reservas
       reserva[0] = new Reserva(hospede[0], 24, 5, 2021, 27, 5, 2021, ap[0]); // data inicial // data final // apartamento
       reserva[1] = new Reserva(hospede[1], 14, 2, 2021, 20, 5, 2021, ap[1]);
       reserva[2] = new Reserva(hospede[2], 29, 6, 2021, 10, 7, 2021, ap[2]);
       reserva[3] = new Reserva();
       reserva[4] = new Reserva();
       reserva[5] = new Reserva();
       reserva[6] = new Reserva();
       reserva[7] = new Reserva();




       
       // Validar Reservas
       reserva[0].efetuarReserva(hospede[0], reserva[0]);
       reserva[1].efetuarReserva(hospede[1], reserva[1]);
       reserva[2].efetuarReserva(hospede[2], reserva[2]);

       System.out.println();
       System.out.println();






       // Consulta dados da Reserva
       try{

       for(i=0; i < reserva.length;i++){
           if(reserva[i].getEfetivada()){
              reserva[i].consultaReservas(reserva[i]);
              System.out.println();
              System.out.println();
              System.out.println();
           } else {
              continue;    
           }                
       }
      } catch(NullPointerException e){
             System.out.println("Array com área nula"); 
             e.printStackTrace(); 
      } catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Limite de espaço de array atingido");
             e.printStackTrace();
      }
       System.out.println();
       System.out.println();





       // Consulta Dados do Hospede
       try{
       for(i=0; i < reserva.length;i++){
           if(reserva[i].getEfetivada()){
              reserva[i].consultaReservas(hospede[i]);
              System.out.println();
              System.out.println();
              System.out.println();
           } else {
              continue;    
           }  
       }
      }catch(NullPointerException e){
             System.out.println("< Espaço de array vazio >");
             e.printStackTrace();
      }catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Limite de espaço de array atingido");
             e.printStackTrace();
      }
       System.out.println();
       System.out.println();




       // Check-in
       reserva[2].checkin(hospede[1], reserva[2]);

       System.out.println();
       System.out.println();




       // Check-out
       reserva[2].checkout(hospede[1], reserva[2]);

       System.out.println();
       System.out.println();



       // testando se o check-out foi realizado com sucesso...
       reserva[2].checkin(hospede[1], reserva[2]);

       System.out.println();
       System.out.println();



       
       // consultar Disponibilidade
       try{

       for(i=0; i < reserva.length;i++){
           if(reserva[i].getEfetivada() == false){
              vagas++;
              System.out.println("Apartamento número "+ap[i].getNumero()+": disponível");
              System.out.println();
              System.out.println("-----------------------------------");
              System.out.println();
           } else {
              System.out.println("Apartamento número "+ap[i].getNumero()+": ocupado");   
              System.out.println();
              System.out.println("-----------------------------------");
              System.out.println();
           }   
       }
       System.out.println("Existem "+vagas+" vagas disponíveis em nosso Hotel"); 
       }catch(NullPointerException e){
              System.out.println("< Espaço de array vazio >");
              e.printStackTrace(); 
       }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Limite de espaço de array atingido");
       }
       System.out.println();
       System.out.println();

      }catch(RuntimeException e){
              System.out.println("Ocorreu um problema :( ");
              System.out.println("Por favor, tente novamente.");
              e.printStackTrace();
      }catch(Exception e){
              System.out.println("Algo deu errado :( "); 
      }finally{
              System.out.println("Fim da execução do programa!");
      }
       /*

       Lembrando que na última lista foi mostrado 6 vagas porque um pouco antes
       da chamada do método, um dos hóspeder realizou um check-out, por isso, a 
       vaga que por sua vez estava preenchida, ficou disponível novamente.

       */

}    
}
