package testeenum;

public class TesteEnum { 
    
    public enum Meses{
          JAN,FEV,MAR,ABR,MAI,JUN,JUL,AGO,SET,OUT,NOV,DEZ
    }

    public static void main(String[] args) {
           Meses jan = Meses.JAN;
           Meses fev = Meses.FEV;
           Meses mar = Meses.MAR;
           Meses abr = Meses.ABR;
           Meses mai = Meses.MAI;
           Meses jun = Meses.JUN;
           Meses jul = Meses.JUL;
           Meses ago = Meses.AGO;
           Meses set = Meses.SET;
           Meses out = Meses.OUT;
           Meses nov = Meses.NOV;
           Meses dez = Meses.DEZ;
           
    ImprimeMeses m = new ImprimeMeses();  
           m.imprime(jan);
           m.imprime(fev);
           m.imprime(mar);
           m.imprime(abr);
           m.imprime(mai);
           m.imprime(jun);
           m.imprime(jul);
           m.imprime(ago);
           m.imprime(set);
           m.imprime(out);
           m.imprime(nov);
           m.imprime(dez);
        
        
        
    }    
}
