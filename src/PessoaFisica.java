public class PessoaFisica implements Entidade {
    private String numeroCPF;

    @Override
    public String getID() {
        return numeroCPF;
    }
}
