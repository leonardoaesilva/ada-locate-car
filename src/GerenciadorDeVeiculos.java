import java.util.List;

public class GerenciadorDeVeiculos {
    private final BancoDeDados<Veiculo> dadosDeLivros;

    public GerenciadorDeVeiculos(BancoDeDados<Veiculo> dadosDeLivros) {
        this.dadosDeLivros = dadosDeLivros;
    }

    public Veiculo adcVeiculo(String fabricante, String modelo, String pinturaCor, String placa, TipoVeiculo tipoVeiculo) {
        if (existeVeiculo(placa))
            throw new IllegalArgumentException("Um veículo com a mesma placa já está cadastrado na base.");

        Veiculo novoVeiculo = new Veiculo(fabricante, modelo, pinturaCor, placa, tipoVeiculo);
        dadosDeLivros.salvar(novoVeiculo);

        return novoVeiculo;
    }

    public Veiculo editarVeiculo(String pinturaCor, String placa) {
        if (!existeVeiculo(placa))
            throw new IllegalArgumentException("Veículo não encontrado na base de dados.");

        Veiculo veiculoEditado = buscarVeiculo(placa);
        veiculoEditado.setPinturaCor(pinturaCor);
        dadosDeLivros.atualizar(veiculoEditado);

        return veiculoEditado;
    }

    public Veiculo buscarVeiculo(String placa) {
        return dadosDeLivros.consultar(placa);
    }

    public boolean existeVeiculo(String placa) {
        return dadosDeLivros.consultar(placa) != null;
    }

    public boolean removerVeiculo(String placa) {
        return dadosDeLivros.deletar(placa);
    }

    public List<Veiculo> listarTodos() {
        return dadosDeLivros.listarTodos();
    }
}
