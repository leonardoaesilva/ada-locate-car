public class PessoaFisica extends Cliente {
    private String numeroCPF;

    public PessoaFisica(String nome, String numeroCPF) {
        super(nome);
        this.numeroCPF = numeroCPF;
    }

    @Override
    public String getID() {
        return numeroCPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + this.getNome() + '\'' +
                "numeroCPF='" + numeroCPF + '\'' +
                '}';
    }
}
