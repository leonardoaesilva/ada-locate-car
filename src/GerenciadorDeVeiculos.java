import java.util.ArrayList;
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

        Veiculo veiculoEditado = buscarVeiculoExato(placa);
        veiculoEditado.setPinturaCor(pinturaCor);
        dadosDeLivros.atualizar(veiculoEditado);

        return veiculoEditado;
    }

    public Veiculo buscarVeiculoExato(String placa) {
        return dadosDeLivros.consultar(placa);
    }

    public List<Veiculo> buscarModeloVeiculos(String busca) {
        List<Veiculo> veiculosPorModelo = new ArrayList<>();

        for (Veiculo v : listarTodos())
            if (v.getModelo().contains(busca))
                veiculosPorModelo.add(v);

        return veiculosPorModelo;
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
