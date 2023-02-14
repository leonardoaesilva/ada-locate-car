public class Veiculo implements Entidade {
    private Boolean locado;
    private String fabricante;
    private String modelo;
    private String pinturaCor;
    private String placa;
    private TipoVeiculo tipoVeiculo;

    public Veiculo(String fabricante, String modelo, String pinturaCor, String placa, TipoVeiculo tipoVeiculo) {
        this.locado = false;
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
                '}';
    }

    @Override
    public String getID() {
        return placa;
    }

    public Boolean getLocado() {
        return locado;
    }

    public void setLocado(Boolean locado) {
        this.locado = locado;
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
