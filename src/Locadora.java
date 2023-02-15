public class Locadora {
    public static void main(String[] args) {
        BancoDeDadosInterface<PessoaFisica> bancoDeClientesFisicos = new BancoDeDados<>();
        BancoDeDadosInterface<PessoaJuridica> bancoDeClientesJuridicos = new BancoDeDados<>();
        BancoDeDadosInterface<Veiculo> bancoDeVeiculos = new BancoDeDados<>();

        GerenciadorDeClientesFisicos clientesFisicos = new GerenciadorDeClientesFisicos(bancoDeClientesFisicos);
        GerenciadorDeClientesJuridicos clientesJuridicos = new GerenciadorDeClientesJuridicos(bancoDeClientesJuridicos);
        GerenciadorDeVeiculos veiculos = new GerenciadorDeVeiculos(bancoDeVeiculos);

        veiculos.adcVeiculo("Ford", "KA", "Vermelho", "ASO9021", TipoVeiculo.Pequeno);
        veiculos.adcVeiculo("Ford", "Focus", "Preto", "ASO9022", TipoVeiculo.Pequeno);
        veiculos.adcVeiculo("Ford", "Focus", "Prata", "ASO9023", TipoVeiculo.Medio);

//        System.out.println(veiculos.buscarModeloVeiculos("Fo"));
        veiculos.buscarModeloVeiculos("Fo").forEach(System.out::println);
    }
}