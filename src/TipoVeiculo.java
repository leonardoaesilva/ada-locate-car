import java.math.BigDecimal;

public enum TipoVeiculo {
    Pequeno(new BigDecimal(100)),
    Médio(new BigDecimal(150)),
    SUV(new BigDecimal(200));

    public BigDecimal valorAluguelDiario;

    TipoVeiculo(BigDecimal valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public BigDecimal getValorAluguelDiario() {
        return valorAluguelDiario;
    }
}
