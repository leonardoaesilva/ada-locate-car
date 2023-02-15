import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeVeiculos {
    private final InterfaceDeDados<Veiculo> dadosDeVeiculos;

    public GerenciadorDeVeiculos(InterfaceDeDados<Veiculo> dadosDeVeiculos) {
        this.dadosDeVeiculos = dadosDeVeiculos;
    }

    public Veiculo adcVeiculo(String fabricante, String modelo, String pinturaCor, String placa, TipoVeiculo tipoVeiculo) {
        if (existeVeiculo(placa))
            throw new IllegalArgumentException("Um veículo com a mesma placa já está cadastrado na base.");

        Veiculo novoVeiculo = new Veiculo(fabricante, modelo, pinturaCor, placa, tipoVeiculo);
        dadosDeVeiculos.salvar(novoVeiculo);

        return novoVeiculo;
    }

    public Veiculo editarVeiculo(String pinturaCor, String placa) {
        if (!existeVeiculo(placa))
            throw new IllegalArgumentException("Veículo não encontrado na base de dados.");

        Veiculo veiculoEditado = buscarVeiculoExato(placa);
        veiculoEditado.setPinturaCor(pinturaCor);
        dadosDeVeiculos.atualizar(veiculoEditado);

        return veiculoEditado;
    }

    public Veiculo buscarVeiculoExato(String placa) {
        return dadosDeVeiculos.consultar(placa);
    }

    public List<Veiculo> buscarModeloVeiculos(String busca) {
        List<Veiculo> veiculosPorModelo = new ArrayList<>();

        for (Veiculo v : listarTodos())
            if (v.getModelo().contains(busca))
                veiculosPorModelo.add(v);

        return veiculosPorModelo;
    }

    public boolean existeVeiculo(String placa) {
        return dadosDeVeiculos.consultar(placa) != null;
    }

    public boolean removerVeiculo(String placa) {
        return dadosDeVeiculos.deletar(placa);
    }

    public List<Veiculo> listarDisponiveis() {
        List<Veiculo> veiculosDisponiveis = new ArrayList<>();

        for (Veiculo v : listarTodos())
            if (!v.getIsAlugado())
                veiculosDisponiveis.add(v);

        return veiculosDisponiveis;
    }

    public List<Veiculo> listarTodos() {
        return dadosDeVeiculos.listarTodos();
    }
}
