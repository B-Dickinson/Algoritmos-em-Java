package aulapoo;

import java.util.Scanner;


public class AulaPoo {

 
    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           String r = "S";
           Caneta c1 = new Caneta();
           c1.modelo = "Bic";
           c1.cor = "Azul";
           c1.ponta = 0.5f;
           c1.carga = 80; 
           
           System.out.print("Deseja tampar a caneta? [S/N]  ");
           r = teclado.next();
           
           if (r.equals("S")||r.equals("s")){
               c1.tampada = true;
               c1.tampar();
           } else {
               c1.tampada = false;
               c1.destampar();   
           }
           c1.status();
           c1.rabiscar();
        
    }   
}
