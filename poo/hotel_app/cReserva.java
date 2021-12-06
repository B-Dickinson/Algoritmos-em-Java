// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class cReserva {
       private Reserva reservas;
       private Apartamento apartamentos;
       private Hospede hospedes;
       
public cReserva(){

}   

public cReserva(Reserva r, Apartamento a, Hospede h){
      this.reservas = r;
      this.apartamentos = a;
      this.hospedes = h;  
}

public Reserva getReservas() {
    return reservas;
}

public void setReservas(Reserva reservas) {
    this.reservas = reservas;
}

public Apartamento getApartamentos() {
    return apartamentos;
}

public void setApartamentos(Apartamento apartamentos) {
    this.apartamentos = apartamentos;
}

public Hospede getHospedes() {
    return hospedes;
}

public void setHospedes(Hospede hospedes) {
    this.hospedes = hospedes;
}



    
public void consultaReservas(Reserva reserva){
       this.setReservas(reserva);
       System.out.println(this.getReservas().toString()); 
}


public void efetuarReserva(Hospede h, Reserva r){
       this.setHospedes(h);
       this.setReservas(r);
       this.reservas.setEfetivada(true);
       System.out.println("Reserva efetuada com Sucesso!");
}

public void consultaReservas(Hospede h){
       this.setHospedes(h); 
       System.out.println(this.getHospedes().getNomeHospede()+
       "\nCpf: "+this.getHospedes().getCpf());
}


public void checkin(Hospede hospede, Reserva reserva){
       if(this.getReservas().getEfetivada()){
          System.out.println(this.getReservas().toString()); 
          System.out.println("Reserva válida!");  
       } else {
          System.out.println("Reserva inválida"); 
       }
}

public void checkout(Hospede hospede, Reserva reserva){
        this.setHospedes(hospede);
        this.hospedes.setCpf(null);
        this.hospedes.setNomeHospede(null);
        this.setReservas(reserva);
        this.reservas.setNumero(0);
        this.reservas.setEfetivada(false);
        this.reservas.setAnoFin(0);
        this.reservas.setMesFin(0);
        this.reservas.setDiaFin(0);
        this.reservas.setAnoIni(0);
        this.reservas.setMesIni(0);
        this.reservas.setDiaIni(0);
        this.reservas.setApartamento(null);
        System.out.println("Check-out Realizado!");
}

public void verDisponibilidade(){

}

}
