package questao65;

public class Emprestimo {
       private Pessoa dados;
       private Livro detalhes;
       private boolean emprestado;
       private int dias;
       private float multa;

    public Emprestimo(Pessoa dados, Livro detalhes) {
        this.dados = dados;
        this.detalhes = detalhes;
        this.emprestado = false;
    }
    
    public void emprestar(Pessoa x, Livro y){
          this.setEmprestado(true);
          this.setDias(7);
          this.setMulta(0);
          System.out.println("Nome: "+this.dados.getNome());
          System.out.println("Cpf: "+this.dados.getCpf());
          System.out.println("Livro: "+this.detalhes.getTitulo()+"\nCOD: "+this.detalhes.getCodigo());
          System.out.println("Livro Emprestado por "+this.getDias() + " dias");
          
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }
    
    public void devolver(int dias){
          this.setEmprestado(false);
          if(dias <= this.getDias()){
               this.setDias(dias); 
               this.setMulta(0);
          } else if (dias > this.getDias() && dias <= 15) {
               this.setMulta(getMulta() + 10f);
          } else if(dias > 15 ){
               this.setMulta(50);
          }
          System.out.println("Nome: "+this.dados.getNome());
          System.out.println("Cpf: "+this.dados.getCpf());
          System.out.println("Livro: "+this.detalhes.getTitulo()+" COD: "+this.detalhes.getCodigo());
          System.out.printf("Multa: %.2f \n",this.getMulta());
          System.out.println("Livro Recebido"); 
    }
    

    public Pessoa getDados() {
        return dados;
    }

    public void setDados(Pessoa dados) {
        this.dados = dados;
    }

    public Livro getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Livro detalhes) {
        this.detalhes = detalhes;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    
       
       
       
    
}
