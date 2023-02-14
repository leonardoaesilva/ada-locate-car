import java.util.List;

public class GerenciadorDeClientesFisicos {
    private final BancoDeDados<PessoaFisica> dadosDeClientesFisicos;

    public GerenciadorDeClientesFisicos(BancoDeDados<PessoaFisica> dadosDeClientesFisicos) {
        this.dadosDeClientesFisicos = dadosDeClientesFisicos;
    }

    public PessoaFisica adcCliente(String nome, String numeroCPF) {
        if (existeCliente(numeroCPF))
            throw new IllegalArgumentException("Um cliente com o mesmo número de CPF já está cadastrado na base.");

        PessoaFisica novoClienteFisico = new PessoaFisica(nome, numeroCPF);
        dadosDeClientesFisicos.salvar(novoClienteFisico);

        return novoClienteFisico;
    }

    public PessoaFisica editarCliente(String nome, String numeroCPF) {
        if (!existeCliente(numeroCPF))
            throw new IllegalArgumentException("Cliente não encontrado na base de dados.");

        PessoaFisica clienteEditado = buscarCliente(numeroCPF);
        clienteEditado.setNome(nome);
        dadosDeClientesFisicos.atualizar(clienteEditado);

        return clienteEditado;
    }

    public PessoaFisica buscarCliente(String numeroCPF) {
        return dadosDeClientesFisicos.consultar(numeroCPF);
    }

    public boolean existeCliente(String numeroCPF) {
        return dadosDeClientesFisicos.consultar(numeroCPF) != null;
    }

    public boolean removerVeiculo(String numeroCPF) {
        return dadosDeClientesFisicos.deletar(numeroCPF);
    }

    public List<PessoaFisica> listarTodos() {
        return dadosDeClientesFisicos.listarTodos();
    }
}
