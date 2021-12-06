package questao2_poo;

public class Aluno {
       private String matricula;
       private String nome;
       private String disciplina;
       private float nota1;
       private float nota2;
       private float nota3;
       private float media;

       public void status(){
             System.out.println("Nome do aluno: "+this.getNome());
             System.out.println("Matrícula: "+this.getMatricula());
             System.out.println("Disciplina: "+this.getDisciplina());
             System.out.println("Nota 1: "+this.getNota1());
             System.out.println("Nota 2: "+this.getNota2());
             System.out.println("Nota 3: "+this.getNota3());
             System.out.printf("Média: %.2f \n",this.getMedia());
       }

       public void lancarNota(float x, float y,float z){
             this.setNota1(x);
             this.setNota2(y);
             this.setNota3(z);
             this.setMedia((this.getNota1() + this.getNota2() + this.getNota3()) / 3);
       }

       public void situacao(){
             if(this.getMedia() >= 7){
                 System.out.println("Aluno: "+this.getNome()+" está aprovado");       
             } else if((this.getMedia() < 7) && getMedia() >= 5){
                System.out.println("Aluno: "+this.getNome()+" terá que fazer a recuperação");   
             } else {
                System.out.println("Aluno: "+this.getNome()+" está reprovado"); 
             }
       }

       public String getMatricula(){
             return this.matricula;
       }

       public void setMatricula(String matricula){
             this.matricula = matricula;
       }

       public String getNome(){
             return this.nome;
       }

       public void setNome(String nome){
             this.nome = nome;
       }

       public String getDisciplina(){
             return this.disciplina;
       }

       public void setDisciplina(String disciplina){
             this.disciplina = disciplina;
       }

       public float getNota1(){
             return this.nota1;
       }

       public void setNota1(float n1){
             this.nota1 = n1;
       }

       public float getNota2(){
             return this.nota2;
       }

       public void setNota2(float n2){
             this.nota2 = n2;
       }

       public float getNota3(){
             return this.nota3;
       }

       public void setNota3(float n3){
             this.nota3 = n3;
       }

       public float getMedia(){
             return this.media;
       }

       public void setMedia(float media){
             this.media = media;
       }
}
