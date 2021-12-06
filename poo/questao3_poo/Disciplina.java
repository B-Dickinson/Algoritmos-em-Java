package questao3_poo;

public class Disciplina {

       // a questao pede uma unica disciplina

       private Aluno matricula;
       public String nome; 
       private String codigo;

       public Disciplina(String nome, String codigo){
              this.nome = nome;
              this.codigo = codigo;
       }

       public void stts(){
           System.out.println("Nome da disciplina: "+this.getNome());
           System.out.println("Codigo: "+this.getCodigo());
       }


    public Aluno getMatricula() {
        return matricula;
    }

    public void setMatricula(Aluno matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo(){
         return this.codigo;
    }

    public void setCodigo(String codigo){
         this.codigo = codigo;
    }

       

       
 }
