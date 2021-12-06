package aula11b2;

public class Tecnico extends Aluno {
       private String RegistroProfissional;
       
       public void praticar(){
             System.out.println("Uuhl");
       }
       
       public String getRegistroProfissional(){
             return this.RegistroProfissional;
       }
       
       public void setRegistroProfissional(String rp){
             this.RegistroProfissional = rp;
       }
       
       @Override
       public void pagarMensalidade(){
             System.out.println(this.getNome()+"Pagamento para Curso Técnico"); 
       }
}
