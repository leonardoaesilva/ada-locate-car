# ADA LocateCar - Locadora de veículos
Criar uma aplicação que gerencie o aluguel de veículos, onde cada item abaixo seja considerado:

### Itens obrigatórios
- [x] Cadastrar os veículos;
- [x] Alterar um veículo cadastrado;
- [x] Buscar um veículo por parte do nome;
- [x] Cadastrar o cliente (pessoa física e jurídica)
- [x] Alterar o cliente (pessoa física e jurídica)
- [x] Alugar um veículo para pessoa física e jurídica;
- [ ] Devolver um veículo para pessoa física e jurídica;

### Regras de negócio
1. RN1: Os veículos não podem ser repetidos; Pode utilizar a placa como identificador de unicidade;
2. RN2: Tipos de veículos que serão considerados: Pequeno, Médio e SUV;
3. RN3: Os aluguéis e devoluções terão o local, data e horário;
4. RN4: Considere aluguel em horas quebradas como uma diária completa. Exemplo: uma devolução de um veículo alugado no dia 25 de janeiro às 15h30 será cobrado uma (1) diária até dia 26 de janeiro às 15h30, a partir desse horário já serão cobradas duas (2) diárias e assim por diante.
5. RN5: Os veículos que estiverem alugados não poderão estar disponíveis;
6. RN6: Clientes não podem estar duplicados; Considerar CPF (Pessoa Física) e CNPJ (Pessoa Jurídica) como identificadores de unicidade;
7. RN7: Regras de devolução:
    1. Caso o cliente pessoa física tenha ficado com o carro mais que 5 diárias terá direito a 5% de desconto.
    2. Caso o cliente pessoa jurídica tenha ficado com o carro mais que 3 diárias terá direito a 10% de desconto.

**Valores base da diária por tipo de veículo:**
| Tipo de Veículo | Valor por dia |
|:---------------:|:-------------:|
| Pequeno | R$ 100,00 |
| Médio |	R$ 150,00 |
| SUV |	R$ 200,00 |

### Considerações
> Da lista de conceitos abordados em aula, para mim _**interfaces**_ foi o mais tranquilo de se entender e aplicar, muito pelo conhecimento prévio que já possuía.
> _**Generics**_ por sua vez foi um conceito que, apesar de fazer bastante sentido, levou um tempo para compreender e colocar em prática.
> Por fim, os _**Princípios SOLID**_, além de demandarem muita prática, muitas vezes não fazem sentido para mim, o que dificultou a prática no projeto, ainda que muito do código seja copiado do próprio professor.
> Porém o fator decisivo que dificultou minha aprendizagem nesse módulo, foi minha baixa participação e má organização de tempo, para essa atividade principalmente.
