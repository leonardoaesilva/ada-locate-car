import java.time.LocalDateTime;
import java.util.List;

public class GerenciadorDeAlugueis {
    private final InterfaceDeDados<Aluguel> dadosVeiculosAlugados;

    public GerenciadorDeAlugueis(InterfaceDeDados<Aluguel> dadosVeiculosAlugados) {
        this.dadosVeiculosAlugados = dadosVeiculosAlugados;
    }

    public Aluguel alugarVeiculo(Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao, Veiculo veiculo) {
        if (veiculo.getIsAlugado())
            throw new IllegalStateException("Veículo indisponível");

        veiculo.setIsAlugado(true);
        Aluguel novoAluguel = new Aluguel(cliente, dataAluguel, dataDevolucao, veiculo);
        dadosVeiculosAlugados.salvar(novoAluguel);

        return novoAluguel;
    }

    public List<Aluguel> listarTodos() {
        return dadosVeiculosAlugados.listarTodos();
    }
}
