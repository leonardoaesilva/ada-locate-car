public class PessoaJuridica extends Cliente {
    private String numeroCNPJ;

    public PessoaJuridica(String nome, String numeroCNPJ) {
        super(nome);
        this.numeroCNPJ = numeroCNPJ;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + super.getNome() + '\'' +
                ", numeroCNPJ='" + numeroCNPJ + '\'' +
                '}';
    }

    @Override
    public String getID() {
        return numeroCNPJ;
    }
}
