package atvpoo;

import java.util.Scanner;


public class AtvPoo {


    public static void main(String[] args) {
           Scanner teclado = new Scanner(System.in);
           Scanner sc = new Scanner(System.in);
           Guitarra guitar = new Guitarra();
           
           System.out.print("Marca: ");
           guitar.setMarca(teclado.nextLine());
           
           System.out.print("Modelo: ");
           guitar.setModelo(teclado.nextLine());
           
           System.out.print("Cor: ");
           guitar.setCor(teclado.nextLine());
           
           System.out.print("Quantidade de Cordas: ");
           guitar.setCordas(sc.nextInt());
           
           System.out.print("Tamanho das cordas: ");
           guitar.setTam_cordas(sc.nextFloat());
           
           System.out.print("Modelo de Captadores: ");
           guitar.setModelo_captador(teclado.nextLine());
           
           System.out.println("Quantidade de Captadores: ");
           guitar.setQtd_captador(sc.nextInt());
           
           System.out.println("Você ligou a guitarra ? [S/N] ");
           String r = teclado.next();
           
           if (r.equals("S") || r.equals("s")){
                   guitar.setLigada(true);
           } else {
                   guitar.setLigada(false); 
           }
           
           System.out.println("Você afinou sua guitarra? [S/N] ");
           String g = teclado.next();
           
           if(g.equals("S")|| g.equals("s")){
                   guitar.setAfinada(true);
           } else {
                   guitar.setAfinada(false);
           }
           
           System.out.println("");
           System.out.println("");
           
           guitar.status();
           
           System.out.println("");
           System.out.println("");
           
           if (guitar.getLigada() == true && guitar.getAfinada() == true){
               System.out.println("");
               guitar.ligada();
               guitar.afinar();
               guitar.tocar();
           } else if ( guitar.getLigada() == false && guitar.getLigada() == false ){
               System.out.println("");
               guitar.desligada();
               guitar.afinar();
           } else if (guitar.getLigada() == true && guitar.getAfinada() == false){
               System.out.println("");
               guitar.ligada();
               guitar.afinar();
           } else if (guitar.getLigada() == false && guitar.getAfinada() == true){
               System.out.println("");
               guitar.ligada();
               guitar.afinar();
           }
           
        
    } 
}
