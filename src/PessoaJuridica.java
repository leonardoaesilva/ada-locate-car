public class PessoaJuridica implements Entidade {
    private String numeroCNPJ;

    @Override
    public String getID() {
        return numeroCNPJ;
    }
}
