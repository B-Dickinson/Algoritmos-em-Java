package aula11b2;

public class Professor extends Pessoa {
       private String especialidade;
       private float salario;
       
       public String status(){
           return "Nome: "+this.getNome()+"\nIdade: "+this.getIdade()+"\nSexo: "
                   +this.getSexo()+"\nSalário: "+this.getSalario();
       }
       
       public void receberAumento(float n){
             this.setSalario(this.getSalario() + n);
       }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
       
       
    
}
