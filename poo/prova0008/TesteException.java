package prova0008;

public class TesteException {


static void metodo1(){
    System.out.println("Inicio do metodo 1");
    metodo2();
    System.out.println("Fim do Metodo 1");
}

static void metodo2(){

    try{

    
    System.out.println("Inicio do metodo 2");
    int[] array = new int[10];
    for(int i = 0; i <= 15; i++){
        array[i] = i;
        System.out.println(i);
    } 
        System.out.println("Fim do metodo2");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Limite de array atingido, posição inválida");
    }    
}

public static void main(String[] args) {

       System.out.println("Inicio do main");
       metodo1();
       System.out.println("Fim do main"); 
    
}    

    
}
