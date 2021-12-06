package questao5_poo;

public class SeguroDeVida implements Tributavel {
       private double taxaFixa;
       
       
public SeguroDeVida(){
       
}    

public SeguroDeVida(double taxa){
      this.taxaFixa = taxa;  
}

    @Override
    public double calculaTributos() {
        return 0;
    }

    public double getTaxaFixa() {
        return taxaFixa;
    }

    public void setTaxaFixa(double x){
        this.taxaFixa = x;
    }


    

    
}
