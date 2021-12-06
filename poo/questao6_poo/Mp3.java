package questao6_poo;

public class Mp3 implements Tocador {

    @Override
    public void play(AudioBook audio) {
        System.out.println("Estamos tocando um arquivo do tipo Mp3");
    }

    @Override
    public void pause(AudioBook audio) {
        System.out.println("Mp3 pausado....");
        
    }

    @Override
    public void stop(AudioBook audio) {
        System.out.println("Execução de Mp3 interrompida");
        
    }
    
}
