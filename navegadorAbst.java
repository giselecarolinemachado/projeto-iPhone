package navegadorinternet;

public class navegadorAbst implements navegadorIntf {

    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    public void novaAba() {
        System.out.println("Nova Aba");
    }
    
    public void atualizarPagina() {
        System.out.println("Atualizando a página!");
    }
}
