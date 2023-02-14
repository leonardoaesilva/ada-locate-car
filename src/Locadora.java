public class Locadora {
    public static void main(String[] args) {
        BancoDeDados<PessoaFisica> bancoDeClientesFisicos = new OperadorDeDados<>();
        BancoDeDados<PessoaJuridica> bancoDeClientesJuridicos = new OperadorDeDados<>();
        BancoDeDados<Veiculo> bancoDeVeiculos = new OperadorDeDados<>();

        GerenciadorDeClientesFisicos clientesFisicos = new GerenciadorDeClientesFisicos(bancoDeClientesFisicos);
        GerenciadorDeClientesJuridicos clientesJuridicos = new GerenciadorDeClientesJuridicos(bancoDeClientesJuridicos);
        GerenciadorDeVeiculos veiculos = new GerenciadorDeVeiculos(bancoDeVeiculos);

        clientesFisicos.adcCliente("Leo", "123");
        System.out.println(clientesFisicos.listarTodos());

        System.out.println("Hello world!");
    }
}