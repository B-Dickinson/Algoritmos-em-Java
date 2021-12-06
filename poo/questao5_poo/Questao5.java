package questao5_poo;

public class Questao5 {

      public static void main(String[] args) {
             Cliente c[] = new Cliente[3];   

             c[0] = new Cliente("Anakin","03152541831242","11/10/2000","981213564","Anjo da guarda");
             c[1] = new Cliente("ObiWan","03355811342","04/10/2001","987135464","Vila Embratel");
             c[2] = new Cliente("Frodo","0321568132142","11/11/2002","98135645784","Anjo da guarda");
             
             ContaCorrente ccAnakin = new ContaCorrente(1, "0001", c[0]);
             ContaCorrente ccObiWan = new ContaCorrente(2, "0002", c[1]);
             ContaCorrente ccFrodo = new ContaCorrente(3, "0003", c[2]);

             ccAnakin.depositar(2000);

             ccAnakin.transferir(ccObiWan, 500);

             ccAnakin.transferir(ccFrodo, 500);
             
             System.out.println(ccAnakin.meuPerfil());
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println(ccObiWan.meuPerfil());
             System.out.println("");
             System.out.println("");
             System.out.println("");
             System.out.println(ccFrodo.meuPerfil());

             System.out.println("");
             System.out.println("");

             ccFrodo.atualizaConta();

             System.out.println(ccFrodo.meuPerfil());

             System.out.println();
             System.out.println();
             System.out.println();




             System.out.println(ccAnakin.meuPerfil());

             ccAnakin.calculaTributos();

             System.out.println();
             System.out.println();

             System.out.println(ccAnakin.meuPerfil());




      }
}
