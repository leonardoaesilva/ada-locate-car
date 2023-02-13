public class PessoaJuridica implements Entidade {
    private String nome;
    private String numeroCNPJ;

    public PessoaJuridica(String nome, String numeroCPNJ) {
        this.nome = nome;
        this.numeroCNPJ = numeroCPNJ;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", numeroCNPJ='" + numeroCNPJ + '\'' +
                '}';
    }

    @Override
    public String getID() {
        return numeroCNPJ;
    }

    public String getNome() {
        return nome;
    }
}
