package questao4_poo;


public class Principal {

      public static void main(String[] args) {
             Cliente c[] = new Cliente[3];
             Conta c1[] = new Conta[3];

             c[0] = new Cliente("Logan", "Desconhecido", "04/03/1902", "Mansão Mutante", "4002-8922");
             c[1] = new Cliente("Bruce Dickson", "123456", "11/10/2000", "Anjo da Guarda", "87896545");
             c[2] = new Cliente("Bruce Wayne", "2228898754", "04/07/1980", "Gotham City", "190");

             c1[0] = new Conta(98485781, 000001, c[0]);
             c1[1] = new Conta(98485781, 000001, c[1]);
             c1[2] = new Conta(98485781, 000001, c[2]);

             c1[2].depositar(1000f);   
             c1[2].ajusteLimite(500f);
             c1[2].setSaldo(50f); // o encapsulamento não permite esse tipo de ação
             System.out.println(c1[2].toString());
      }
    
}
