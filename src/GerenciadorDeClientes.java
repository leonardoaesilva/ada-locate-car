public class GerenciadorDeClientes {
    private final BancoDeDados<Cliente> dadosDeClientes;

    public GerenciadorDeClientes(BancoDeDados<Cliente> dadosDeClientes) {
        this.dadosDeClientes = dadosDeClientes;
    }
}
