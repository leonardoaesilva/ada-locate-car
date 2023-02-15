import java.util.List;

public interface InterfaceDeDados<T> {
    T salvar(T entidade);
    void atualizar(T entidade);
    boolean deletar(String id);
    T consultar(String id);
    List<T> listarTodos();
}
