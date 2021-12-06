// integrantes do grupo: Bruce Dickson & Thcylla Sá

package hotel_app;

public class Hospede {
       private String cpf;
       private String nomeHospede;
 
public Hospede(){

}   

public Hospede(String nomeHospede, String cpf){
      this.nomeHospede = nomeHospede;
      this.cpf = cpf;  
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getNomeHospede() {
    return nomeHospede;
}

public void setNomeHospede(String nomeHospede) {
    this.nomeHospede = nomeHospede;
}

@Override
public String toString(){
    return "nomeHospede do Hóspede: "+this.getNomeHospede()+"\nCpf: "+this.getCpf();
}

}
