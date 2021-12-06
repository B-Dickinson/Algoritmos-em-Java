package questao.pkg61;

import java.util.Scanner;

public class Questao61 {
    public static void status(float m){
          if( m > 6){
              System.out.println("Aprovado"); 
          } else if( m >= 4 && m <= 6){
              System.out.println("Verificação Suplementar");
          } else {
              System.out.println("Aluno Reprovado");
          }
    }
    
    public static float media(float n1,float n2, float n3){
        float x = n1;
        float y = n2;
        float z = n3;
            
        float m = (x + y + z) / 3;
        return m;
    }

    public static void main(String[] args){
        try{ 
           Scanner sc = new Scanner(System.in);   
           System.out.print("Digite a primeira nota: ");
           float n1 = sc.nextFloat();
           System.out.print("Digite a segunda nota: ");
           float n2 = sc.nextFloat();
           System.out.print("Digite a terceira nota: ");
           float n3 = sc.nextFloat();   
           
           float m = media(n1,n2,n3);
           System.out.printf("Media do aluno: %.1f",m);
           System.out.println("");
           status(m);
        }
        catch(Exception e){
             System.out.println("Erro na implementacao de notas");
        }
    }
    
}

/*

Faça um	método	que calcule a média de um aluno	de
acordo	com o Critério definido	neste curso.
Além disso, faça um outro método que informe o status do aluno de acordo com a	
tabela	a seguir:

Nota acima de 6 =   “Aprovado”

Nota entre 4 e 6 = Conceito  “Verificação Suplementar”
Nota abaixo 4 = Conceito  “Reprovado”



*/
