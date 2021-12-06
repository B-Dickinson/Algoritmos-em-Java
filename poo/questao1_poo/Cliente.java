package questao1_poo;

public class Cliente {
       
      public static void main(String[]args){
             Conta []c = new Conta[3];    
         
            c[0] = new Conta("Darth Vader", "03444787397", "0001", "138656486");
            c[1] = new Conta("Chuck Norris","33556897458","0002","12358548");
            c[2] = new Conta("Thomas Shelby","44597845677","003","56798532");
             // Colocar um limite acima do Saldo Atual:
             System.out.print(c[1].status());
             c[1].ajustaLimite(1500);
             System.out.print(c[1].consultaSaldo());

             System.out.println("");
             System.out.println("");

             // Ajustar o limite corretamente
              System.out.print(c[1].status());
              c[1].ajustaLimite(1000);
              System.out.print(c[1].consultaSaldo());


              System.out.println("");
              System.out.println("");

             // sacar e consultar o saldo
              c[1].sacar(900);
              System.out.print(c[1].consultaSaldo());

              System.out.println("");
              System.out.println("");

             // tentando sacar um valor maior que saldo atual   
              System.out.println(c[1].consultaSaldo());
              c[1].sacar(150);
              

             
             



    }
}
