import java.util.List;

public class GerenciadorDeClientesJuridicos {
    private final BancoDeDados<PessoaJuridica> dadosDeClientesJuridicos;

    public GerenciadorDeClientesJuridicos(BancoDeDados<PessoaJuridica> dadosDeClientesJuridicos) {
        this.dadosDeClientesJuridicos = dadosDeClientesJuridicos;
    }

    public PessoaJuridica adcCliente(String nome, String numeroCNPJ) {
        if (existeCliente(numeroCNPJ))
            throw new IllegalArgumentException("Um cliente com o mesmo número de CPF já está cadastrado na base.");

        PessoaJuridica novoClienteJuridico = new PessoaJuridica(nome, numeroCNPJ);
        dadosDeClientesJuridicos.salvar(novoClienteJuridico);

        return novoClienteJuridico;
    }

    public PessoaJuridica editarCliente(String nome, String numeroCNPJ) {
        if (!existeCliente(numeroCNPJ))
            throw new IllegalArgumentException("Cliente não encontrado na base de dados.");

        PessoaJuridica clienteEditado = buscarCliente(numeroCNPJ);
        clienteEditado.setNome(nome);
        dadosDeClientesJuridicos.atualizar(clienteEditado);

        return clienteEditado;
    }

    public PessoaJuridica buscarCliente(String numeroCNPJ) {
        return dadosDeClientesJuridicos.consultar(numeroCNPJ);
    }

    public boolean existeCliente(String numeroCNPJ) {
        return dadosDeClientesJuridicos.consultar(numeroCNPJ) != null;
    }

    public boolean removerVeiculo(String numeroCNPJ) {
        return dadosDeClientesJuridicos.deletar(numeroCNPJ);
    }

    public List<PessoaJuridica> listarTodos() {
        return dadosDeClientesJuridicos.listarTodos();
    }
}
