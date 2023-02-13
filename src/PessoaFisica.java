public class PessoaFisica implements Entidade {
    private String nome;
    private String numeroCPF;

    public String getNome() {
        return nome;
    }

    @Override
    public String getID() {
        return numeroCPF;
    }
}
