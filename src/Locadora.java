import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Locadora {
    public static void main(String[] args) {
        InterfaceDeDados<PessoaFisica> bancoDeClientesFisicos = new BancoDeDados<>();
        InterfaceDeDados<PessoaJuridica> bancoDeClientesJuridicos = new BancoDeDados<>();
        InterfaceDeDados<Veiculo> bancoDeVeiculos = new BancoDeDados<>();
        InterfaceDeDados<Aluguel> bancoDeAlugueis = new BancoDeDados<>();

        GerenciadorDeClientesFisicos clientesFisicos = new GerenciadorDeClientesFisicos(bancoDeClientesFisicos);
        GerenciadorDeClientesJuridicos clientesJuridicos = new GerenciadorDeClientesJuridicos(bancoDeClientesJuridicos);
        GerenciadorDeVeiculos veiculos = new GerenciadorDeVeiculos(bancoDeVeiculos);
        GerenciadorDeAlugueis alugueis = new GerenciadorDeAlugueis(bancoDeAlugueis);

        clientesFisicos.adcCliente("Leo", "123");

        veiculos.adcVeiculo("Ford", "KA", "Vermelho", "ASO9021", TipoVeiculo.Pequeno);
        veiculos.adcVeiculo("Ford", "Focus", "Preto", "ASO9022", TipoVeiculo.Pequeno);
        veiculos.adcVeiculo("Ford", "Focus", "Prata", "ASO9023", TipoVeiculo.Medio);

        alugueis.alugarVeiculo(clientesFisicos.buscarCliente("123"),
                LocalDateTime.of(1997, Month.MAY, 13, 18, 30),
                LocalDateTime.of(1997, Month.MAY, 18, 18, 30),
                veiculos.buscarVeiculoExato("ASO9021"));
        System.out.println();

//        veiculos.buscarModeloVeiculos("Fo").forEach(System.out::println);
        System.out.println("################# TODOS OS VEÍCULOS");
        veiculos.listarTodos().forEach(System.out::println);
        System.out.println("################# ALUGUÉIS VIGENTES");
        alugueis.listarTodos().forEach(System.out::println);
        System.out.println("################# TODOS OS VEÍCULOS");
        veiculos.listarTodos().forEach(System.out::println);
        System.out.println("################# VEÍCULOS DISPONÍVEIS PARA ALUGUEL");
        veiculos.listarDisponiveis().forEach(System.out::println);

        alugueis.devolverVeiculo(alugueis.listarTodos().get(0));

        System.out.println("################# VEÍCULOS DISPONÍVEIS PARA ALUGUEL");
        veiculos.listarDisponiveis().forEach(System.out::println);
    }
}