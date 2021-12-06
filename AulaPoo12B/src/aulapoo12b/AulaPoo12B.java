package aulapoo12b;

public class AulaPoo12B {

    public static void main(String[] args) {
           Mamifero m = new Mamifero();
           Reptil r = new Reptil();
           Peixe p = new Peixe();
           Ave a = new Ave();
           Cachorro c = new Cachorro();
           Canguru k = new Canguru();
           Cobra x = new Cobra();
           Tartaruga leo = new Tartaruga();
           Goldfish nemo = new Goldfish();
           Arara ar = new Arara();
           
           k.setIdade(8);
           k.setMembros(4);
           k.setCorDoPelo("Marrom");
           k.setPeso(40.5f);
           leo.locomover();
           
    }
}
