import java.math.BigDecimal;

public enum TipoVeiculo {
    Pequeno(BigDecimal.valueOf(100.0)),
    Medio(BigDecimal.valueOf(150.0)),
    SUV(BigDecimal.valueOf(200.0));

    public BigDecimal valorAluguelDiario;

    TipoVeiculo(BigDecimal valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public BigDecimal getValorAluguelDiario() {
        return valorAluguelDiario;
    }
}
