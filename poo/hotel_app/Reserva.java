// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class Reserva extends cReserva {

       private int diaIni;
       private int mesIni;
       private int anoIni; 
       private int diaFin;
       private int mesFin;
       private int anoFin;
       private Apartamento apartamento;
       private boolean efetivada;
       private int numero;
       private Hospede hospede;
       

public Reserva(){
      this.efetivada = false;  
}


public Reserva(Hospede hospede,int diaIni, int mesIni,int anoIni,
              int diaFin, int mesFin, int anoFin, Apartamento apartamento){
       this.hospede = hospede; 
       this.diaIni = diaIni; 
       this.mesIni = mesIni; 
       this.anoIni = anoIni; 
       this.diaFin = diaFin;
       this.mesFin = diaFin;
       this.anoFin = anoFin;
       this.apartamento = apartamento; 
       this.efetivada = false;
       this.numero = (int)(0 + (Math.random()) * (1000001 - 1));
}

public int getDiaIni() {
    return diaIni;
}

public void setDiaIni(int diaIni) {
    this.diaIni = diaIni;
}

public int getMesIni() {
    return mesIni;
}

public void setMesIni(int mesIni) {
    this.mesIni = mesIni;
}

public int getAnoIni() {
    return anoIni;
}

public void setAnoIni(int anoIni) {
    this.anoIni = anoIni;
}

public int getDiaFin() {
    return diaFin;
}

public void setDiaFin(int diaFin) {
    this.diaFin = diaFin;
}

public int getMesFin() {
    return mesFin;
}

public void setMesFin(int mesFin) {
    this.mesFin = mesFin;
}

public int getAnoFin() {
    return anoFin;
}

public void setAnoFin(int anoFin) {
    this.anoFin = anoFin;
}

public Hospede getHospede() {
    return hospede;
}

public void setHospede(Hospede hospede) {
    this.hospede = hospede;
}

public Apartamento getApartamento() {
    return apartamento;
}

public void setApartamento(Apartamento apartamento) {
    this.apartamento = apartamento;
}

public boolean getEfetivada() {
    return efetivada;
}

public void setEfetivada(boolean efetivada) {
    this.efetivada = efetivada;
}

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}


@Override
public String toString(){
      return "Hospede: "+this.getHospede().getNomeHospede()+"\nCpf: "+this.getHospede().getCpf()+
      "\nData Inicial: "+this.getDiaIni()+"/"+this.getMesIni()+"/"+this.getAnoIni()+
      "\nData final: "+this.getDiaFin()+"/"+this.getMesFin()+"/"+this.getAnoFin()+
      "\nApartamento: "+this.apartamento.getNumero()+"\nNúmero da Reserva: "+this.getNumero()+
      "\nSituação da Reserva: "+this.getEfetivada();  
}


}
