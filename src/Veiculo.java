public class Veiculo implements Entidade {
    private String fabricante;
    private String modelo;
    private String placa;

    public Veiculo(String fabricante, String modelo, String placa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
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
}
