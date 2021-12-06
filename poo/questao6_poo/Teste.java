package questao6_poo;

public class Teste {
 
public static void main(String[] args) {
       Autor a1 = new Autor("J.K","Rowling");
       Livro l1 = new Livro("Cálice de Fogo", 40, a1);
       AudioBook a0 = new AudioBook("Enigma do Principe", 50 , a1, 30);

       System.out.println(l1.toString());

       System.out.println();
       System.out.println();
       System.out.println();

       System.out.println(a0.toString());



       
}    
}
