public class PessoaJuridica implements Entidade {
    private String nome;
    private String numeroCNPJ;

    public String getNome() {
        return nome;
    }

    @Override
    public String getID() {
        return numeroCNPJ;
    }
}
