package atividade2poo;


public class Atividade2Poo {


    public static void main(String[] args) {
           ContaBancaria p1 = new ContaBancaria();
           p1.setNumeroDaConta(1111);
           p1.setNomeDoDono("Jubileu");
           p1.abrirConta("cc");
           p1.depositar(100);
           p1.sacar(150);
           p1.fecharConta();
           
           
           ContaBancaria p2 = new ContaBancaria();
           p2.setNumeroDaConta(2222);
           p2.setNomeDoDono("Creuza");
           p2.abrirConta("cp");
           p2.depositar(500);
           p2.sacar(100);
           
           
           p1.stts();
           p2.stts();
          
             
             
           
        
        
    }
    
}
