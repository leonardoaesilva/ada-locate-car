import java.io.Serializable;
import java.time.LocalDateTime;

public class Aluguel implements InterfaceEntidade, Serializable {
    private static final Long serialVersionUID = 1L;
    private Cliente cliente;
    private LocalDateTime dataAluguel;
    private LocalDateTime dataDevolucao;
    private Veiculo veiculo;

    public Aluguel(Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao, Veiculo veiculo) {
        this.cliente = cliente;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "cliente=" + cliente.getNome() +
                ", dataAluguel=" + dataAluguel +
                ", dataDevolucao=" + dataDevolucao +
                ", veiculo=" + veiculo +
                '}';
    }

    @Override
    public String getID() {
        return serialVersionUID.toString();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDateTime dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
