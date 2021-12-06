package aula11b2;

public abstract class Pessoa {
       private String nome;
       private int idade;
       private String sexo;
       
       public void fazerAniversario(){
             this.setIdade(this.getIdade() + 1);
       }
       
       public String getNome(){
           return this.nome;
       }
       
       public void setNome(String name){
             this.nome = name;
       }
       
       public int getIdade(){
             return this.idade;
       }
       
       public void setIdade(int years){
             this.idade = years;
       }
       
       public String getSexo(){
            return this.sexo;
       }
       
       public void setSexo(String s){
             this.sexo = s;
       }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
        
}
