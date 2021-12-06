package questao6_poo;

public class Wav implements Tocador  {

    @Override
    public void play(AudioBook audio) {
        System.out.println("Tocando um arquivo do tipo Wav");
        
    }

    @Override
    public void pause(AudioBook audio) {
        System.out.println("Arquivo Wav pausado");
        
    }

    @Override
    public void stop(AudioBook audio) {
        System.out.println("Execução de Arquivo Wav finalizada");
        
    }
    
}
