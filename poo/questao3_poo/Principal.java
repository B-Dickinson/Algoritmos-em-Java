package questao3_poo;

public class Principal {

      // a questao pede uma unica disciplina
      
      public static void main(String[] args) {
             
             Disciplina a = new Disciplina("Matemática I", "0001");
             Aluno b = new Aluno("Marcello Rodrigo", "123456", a, "ADS", "Noturno");
             a.stts(); 
             System.out.println();
             System.out.println();
             b.lancarNotas(10, 9, 8.5f);
             System.out.println(b.toString());
             b.situacao();
      }
}
