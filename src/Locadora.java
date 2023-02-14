public class Locadora {
    public static void main(String[] args) {
        BancoDeDados<PessoaFisica> bancoDeClientesFisicos = new OperadorDeDados<>();
        BancoDeDados<PessoaJuridica> bancoDeClientesJuridicos = new OperadorDeDados<>();
        BancoDeDados<Veiculo> bancoDeVeiculos = new OperadorDeDados<>();

        System.out.println("Hello world!");
    }
}