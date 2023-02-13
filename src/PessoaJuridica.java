public class PessoaJuridica implements Entidade {
    private String nome;
    private String numeroCNPJ;

    public PessoaJuridica(String nome, String numeroCPNJ) {
        this.nome = nome;
        this.numeroCNPJ = numeroCPNJ;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getID() {
        return numeroCNPJ;
    }
}
