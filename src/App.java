public class App {
    public static void main(String[] args) throws Exception {
        iPhone iph1 = new iPhone();
        
        //Navegador na Internet
        iph1.adicionarNovaAba();
        iph1.atualizarPagina();
        iph1.exibirPagina("wwww.google.com");
        
        //Aparelho Telefônico
        iph1.ligar("0000000");
        iph1.iniciarConversaVoz();
        iph1.atender();

        //Repodutor Musicial
        iph1.tocar();
        iph1.pausar();
        iph1.selecionarMusica("musica 1");
    }
}
