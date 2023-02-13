public enum TipoVeiculo {
    PEQUENO(100d), MEDIO(150d), SUV(200d);

    public Double valorAluguelDiario;

    TipoVeiculo(Double valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public Double getValorAluguelDiario() {
        return valorAluguelDiario;
    }
}
