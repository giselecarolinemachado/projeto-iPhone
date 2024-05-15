package reprodutormusical;

public abstract class reprodutorAbst implements reprodutorIntf {

    protected String nome;

    public reprodutorAbst(String nome) {
        this.nome = nome;
    }
    public void tocarMusica() {
        System.out.println("Está tocando a música " + nome);
    }
    public void pausar(){
        System.out.println("Música pausada " + nome);
    }
    public void selecionarMusica() {
        System.out.println("Música selecionada: " + nome);
    }
    public String getNome() {
        return nome;
    }
}


