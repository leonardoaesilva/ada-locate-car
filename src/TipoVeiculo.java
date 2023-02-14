import java.math.BigDecimal;

public enum TipoVeiculo {
    Pequeno(new BigDecimal("100.0")),
    Médio(new BigDecimal("150.0")),
    SUV(new BigDecimal("200.0"));

    public BigDecimal valorAluguelDiario;

    TipoVeiculo(BigDecimal valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public BigDecimal getValorAluguelDiario() {
        return valorAluguelDiario;
    }
}
