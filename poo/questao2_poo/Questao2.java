package questao2_poo;

public class Questao2{
     
       public static void main(String[]args){
             Aluno a1 = new Aluno();
             a1.setNome("Bruce Dickson");
             a1.setMatricula("123456789");
             a1.setDisciplina("Análise e Desenvolvimento de Sistemas");
             a1.lancarNota(7.5f,10f,10f);
             a1.status();
             a1.situacao();
    }
}