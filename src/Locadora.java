public class Locadora {
    public static void main(String[] args) {
        BancoDeDados<PessoaFisica> bancoDeClientesFisicos = new OperadorDeDados<>();
        BancoDeDados<PessoaJuridica> bancoDeClientesJuridicos = new OperadorDeDados<>();
        BancoDeDados<Veiculo> bancoDeVeiculos = new OperadorDeDados<>();

        GerenciadorDeClientesFisicos clientesFisicos = new GerenciadorDeClientesFisicos(bancoDeClientesFisicos);
        GerenciadorDeClientesJuridicos clientesJuridicos = new GerenciadorDeClientesJuridicos(bancoDeClientesJuridicos);
        GerenciadorDeVeiculos veiculos = new GerenciadorDeVeiculos(bancoDeVeiculos);

        veiculos.adcVeiculo("Ford", "KA", "Vermelho", "ASO9021", TipoVeiculo.Pequeno);
        System.out.println(veiculos.listarTodos());
    }
}