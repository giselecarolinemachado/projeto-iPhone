package aparelhotelefonico;

public abstract class telefoneAbstr implements telefoneInterface {

    public void ligar(int numero) {
        System.out.println("Ligando " + numero);
    }

    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.print("Iniciando o Correio de Voz");
    }
    
}
