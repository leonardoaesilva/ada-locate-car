public class Veiculo implements Entidade {
    private String fabricante;
    private String modelo;
    private String pinturaCor;
    private String placa;

    public Veiculo(String fabricante, String modelo, String pinturaCor, String placa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.pinturaCor = pinturaCor;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pinturaCor='" + pinturaCor + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }

    @Override
    public String getID() {
        return placa;
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
