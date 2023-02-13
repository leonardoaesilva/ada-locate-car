public class PessoaFisica implements Entidade {
    private String nome;
    private String numeroCPF;

    public PessoaFisica(String nome, String numeroCPF) {
        this.nome = nome;
        this.numeroCPF = numeroCPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", numeroCPF='" + numeroCPF + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getID() {
        return numeroCPF;
    }
}
