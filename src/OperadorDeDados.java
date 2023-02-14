import java.util.ArrayList;
import java.util.List;

public class OperadorDeDados<T extends Entidade> implements BancoDeDados<T> {
    private final List<T> dados;

    public OperadorDeDados() {
        this.dados = new ArrayList<>();
    }

    private boolean existe(T entidade) {
        String id = entidade.getID();

        return existe(id);
    }

    private boolean existe(String id) {
        return consultar(id) != null;
    }

    @Override
    public T salvar(T entidade) {
        if (existe(entidade))
            throw new IllegalArgumentException("Entidade já existente com tal identificador.");

        dados.add(entidade);

        return entidade;
    }

    @Override
    public void atualizar(T entidade) {
        if (!existe(entidade))
            throw new IllegalArgumentException("Uma entidade com o identificador mencionado não existe.");

        deletar(entidade.getID());
        salvar(entidade);
    }

    @Override
    public boolean deletar(String id) {
        if (existe(id)) {
            T consultar = consultar(id);
            dados.remove(consultar);
            return true;
        }

        return false;
    }

    @Override
    public T consultar(String id) {
        for (T entidade : dados) {
            if (entidade.getID().equals(id))
                return entidade;
        }

        return null;
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(dados);
    }
}
