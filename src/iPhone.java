public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar(String numero) {
        System.out.println("Lingando para: "+ numero);
        
    }

    @Override
    public void atender() {
        
        System.out.println("Atendeu!");
    }

    @Override
    public void iniciarConversaVoz() {
        
        System.out.println("Iniciar Conversa de Voz!");
    }

    @Override
    public void exibirPagina(String url) {
        
       System.out.println("Exibir pagina!'");
    }

    @Override
    public void adicionarNovaAba() {
        
       System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        
       System.out.println("Atualizando pagina");
    }


    @Override
    public void tocar() {
        
       System.out.println("Tocar Música!");
    }

    @Override
    public void pausar() {
        
       System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        
       System.out.println("selecione uma musica");
    }

    
}
