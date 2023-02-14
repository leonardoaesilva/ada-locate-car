public class PessoaFisica extends Cliente {
    private String numeroCPF;

    public PessoaFisica(String nome, String numeroCPF) {
        super(nome);
        this.numeroCPF = numeroCPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + super.getNome() + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                '}';
    }

    @Override
    public String getID() {
        return numeroCPF;
    }
}
