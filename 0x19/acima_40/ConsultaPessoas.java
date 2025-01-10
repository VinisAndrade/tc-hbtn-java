import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
  // Método para agrupar pessoas por cargo
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo));
    }

    // Método para obter idades das pessoas agrupadas por cargo
    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.mapping(Pessoa::getIdade, Collectors.toList())
                ));
    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoas) {
    return pessoas.stream()
            .collect(Collectors.groupingBy(
                    Pessoa::getCargo,  // Agrupa por cargo
                    Collectors.filtering(p -> p.getIdade() > 40, Collectors.toList())  // Filtra as pessoas com idade > 40
            ));
    }

}
