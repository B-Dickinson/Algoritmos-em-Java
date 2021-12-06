/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import java.util.Scanner;

/**
 *
 * @author Bruce
 */
public class Questao8 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        float peso,altura;
        String nome,sexo,profissao,cep,telefone,rua,bairro,cidade,estado;
        System.out.print("Nome: ");
              nome = sc.nextLine();
        System.out.println("");
        
        System.out.print("Idade: ");
              idade = sc.nextInt();
        System.out.println("");
        
        System.out.print("Sexo: ");
              sexo = sc.next();
        System.out.println("");
        
        System.out.print("Peso: ");
              peso = sc.nextFloat();
        System.out.println("");
        
        System.out.print("Altura: ");
              altura = sc.nextFloat();
        System.out.println("");
        
        System.out.print("Profissão: ");
        Scanner teclado = new Scanner(System.in);
              profissao = teclado.nextLine();
        System.out.println("");
        
        System.out.print("Rua: ");
              rua = teclado.nextLine();
        System.out.println("");
        
        System.out.print("Bairro: ");
        bairro = teclado.nextLine();
        System.out.println("");
        
        System.out.print("Cidade: ");
        cidade = teclado.nextLine();
        System.out.println("");
        
        System.out.print("Estado: ");
        estado = teclado.next();
        System.out.println("");
        
        System.out.print("Cep: ");
        cep = sc.next();
        System.out.println("");
        
        System.out.print("Telefone: ");
        telefone = sc.next();
        System.out.println("");
        
        System.out.println("-------------------------------------------------");
        System.out.println("                  Ficha de Dados                 ");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Nome: "+nome);
        System.out.println("-");
        System.out.println("Idade: "+idade+" anos.");
        System.out.println("-");
        System.out.println("Sexo: "+sexo);
        System.out.println("-");
        System.out.println("Peso: "+peso+"kg");
        System.out.println("-");
        System.out.println("Altura: "+altura+"m");
        System.out.println("-");
        System.out.println("Profissão: "+profissao);
        System.out.println("-");
        System.out.println("Rua: "+rua);
        System.out.println("-");
        System.out.println("Bairro: "+bairro);
        System.out.println("-");
        System.out.println("Cidade: "+cidade);
        System.out.println("-");
        System.out.println("Estado: "+estado);
        System.out.println("-");
        System.out.println("Cep: "+cep);
        System.out.println("-");
        System.out.println("Telefone: (98)"+telefone);
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
    }
    
}

/*  Faça um algoritmo que leia as seguintes informações de uma pessoa: Nome, Idade,
Sexo, Peso, Altura, Profissão, Rua, Bairro, Cidade, Estado, CEP, Telefone. E em
seguida imprima os dados da pessoa. */
