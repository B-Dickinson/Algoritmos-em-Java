package questao0007;

public class Resultado {
    
public static void main(String[] args) {
       Animais a[] = new Animais[5];
       Ferramenta f = new Ferramenta();
       a[0] = new Animais("Gato", "Felino");
       a[1] = new Animais("Arara", "Ave");
       a[2] = new Animais("Tubarão", "Peixe");
       a[3] = new Animais("Lagarto", "Réptil");
       a[4] = new Animais("Leão", "Felino");

       System.out.println("Filtrando espécies:");

       f.filtraEspecie(a, "Felino");     

       System.out.println();
       System.out.println("Classificação das Espécies:");
       
       f.classificaEspecie(a);

       

       
       
       
}    
}
