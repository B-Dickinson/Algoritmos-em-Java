package questao3_poo;

public class Aluno {
      private String nome;
      private String matricula;
      private Disciplina disciplina;
      private float nota1;
      private float nota2;
      private float nota3;
      private String curso;
      private String turno;
      private float media;
      
      public Aluno(String nome, String matricula, Disciplina disciplina, String curso, String turno){
             this.nome = nome;
             this.matricula = matricula;
             this.disciplina = disciplina;
             this.curso = curso;
             this.turno = turno;
             
      }

      @Override
      public String toString(){
          return "Aluno: "+this.getNome()+"\nMatricula: "+this.getMatricula()+"\nDisciplina: "+this.disciplina.getNome()
          +"\nCurso: "+this.getCurso()+"\nTurno: "+this.getTurno();
      } 
      


      public void situacao(){
          if(media >= 5){
               System.out.println("Aluno Aprovado"); 
          } else {
               System.out.println("Aluno Reprovado");
          }
      }

      public void lancarNotas(float x, float y, float z){
             this.nota1 = x;
             this.nota2 = y;
             this.nota3 = z;
             this.setMedia((this.getNota1()*3) + (this.getNota2()*3) + (this.getNota3()*3) /10);
      }

          

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
   
     

      

}