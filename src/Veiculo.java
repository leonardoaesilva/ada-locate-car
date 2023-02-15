public class Veiculo implements InterfaceEntidade {
    private Boolean isAlugado;
    private String fabricante;
    private String modelo;
    private String pinturaCor;
    private String placa;
    private TipoVeiculo tipoVeiculo;

    public Veiculo(String fabricante, String modelo, String pinturaCor, String placa, TipoVeiculo tipoVeiculo) {
        this.isAlugado = false;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pinturaCor = pinturaCor;
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pinturaCor='" + pinturaCor + '\'' +
                ", placa='" + placa + '\'' +
                ", tipoVeiculo='" + tipoVeiculo + '\'' +
                ", valorAluguelDiario='R$" + tipoVeiculo.getValorAluguelDiario() + '\'' +
                ", alugado='" + isAlugado + '\'' +
                '}';
    }

    @Override
    public String getID() {
        return placa;
    }

    public Boolean getIsAlugado() {
        return isAlugado;
    }

    public void setIsAlugado(Boolean isAlugado) {
        this.isAlugado = isAlugado;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPinturaCor() {
        return pinturaCor;
    }

    public void setPinturaCor(String pinturaCor) {
        this.pinturaCor = pinturaCor;
    }
}
