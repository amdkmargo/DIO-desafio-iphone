public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical {

    private String numeroAtual;
    private String paginaAtual;
    private String musicaAtual;

    @Override
    public void ligar(String numero) {
        numeroAtual = numero;
        System.out.println("Ligando para: " + numeroAtual);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    @Override
    public void exibirPagina(String url) {
        paginaAtual = url;
        System.out.println("Exibindo Página: " + paginaAtual);
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada: " + paginaAtual);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("http://exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica("...");
        iphone.tocar();
        iphone.pausar();
    }
}
