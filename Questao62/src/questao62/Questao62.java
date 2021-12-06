package questao62;

import java.util.Scanner;

public class Questao62 {
    
    public static void escrita(){
          System.out.println("Digite um valor em segundos: ");     
    }
    
    public static int leitura(int segundos ){
          Scanner sc = new Scanner(System.in);
          segundos = sc.nextInt();
          return segundos;
    }
    
    public static int horas(int segundos){
        int h = 0;
        h = segundos / 3600;
        return h;
    }
    
    public static int minutos(int segundos){
        int m = 0;
        m = segundos / 60;
        return m;
    }
    
    public static int segundos(int sec){
        int s = 0;
        s = sec;
        return s;
    }
    

    public static void main(String[] args) {
           int sec = 0;
           int h = 0;
           int m = 0;
           int s = 0;
           
    escrita();
    sec = leitura(sec);
    h = horas(sec);
    m = minutos(sec);
    s = segundos(sec);
    
        System.out.println("Horas: "+h);
        System.out.println("Minutos: "+m);
        System.out.println("Segundos: "+sec);
    
           
                           
           
    }
}


/*

Leia do	usuário	o tempo	em segundos e escreva em horas, minutos e segundos. Utilize cinco métodos,
para a leitura e escrita de dados e para obtenção de horas, minutos e segundos a partir	do
tempo em segundos.	


*/
