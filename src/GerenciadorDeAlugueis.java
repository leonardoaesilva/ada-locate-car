import java.math.BigDecimal;
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

    public Aluguel devolverVeiculo(Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao, Veiculo veiculo) {
        if (!veiculo.getIsAlugado())
            throw new IllegalStateException("Veículo não alugado.");

        Aluguel veiculoADevolver = dadosVeiculosAlugados.consultar(veiculo.getID());
        veiculoADevolver.getVeiculo().setIsAlugado(false);
        dadosVeiculosAlugados.deletar(veiculoADevolver.getVeiculo().getID());
        calcularValorAluguel(cliente, dataAluguel, dataDevolucao, veiculo);

        return veiculoADevolver;
    }

    private BigDecimal calcularValorAluguel(Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao, Veiculo veiculo) {
        Integer diaAluguel = dataAluguel.getDayOfMonth();
        Integer diaDevolucao = dataDevolucao.getDayOfMonth();
        Integer qtdDias = diaDevolucao - diaAluguel;

        BigDecimal valorAluguel = veiculo.getTipoVeiculo().getValorAluguelDiario().multiply(BigDecimal.valueOf(qtdDias));

        if (cliente instanceof PessoaFisica)
            if (qtdDias >= 5) {
                BigDecimal valorDesconto = valorAluguel.multiply(BigDecimal.valueOf(0.05));
                valorAluguel = valorAluguel.subtract(valorDesconto);
            }
        if (cliente instanceof PessoaJuridica)
            if (qtdDias >= 3) {
                BigDecimal valorDesconto = valorAluguel.multiply(BigDecimal.valueOf(0.1));
                valorAluguel = valorAluguel.subtract(valorDesconto);
            }

        return valorAluguel;
    }

    public List<Aluguel> listarTodos() {
        return dadosVeiculosAlugados.listarTodos();
    }
}
