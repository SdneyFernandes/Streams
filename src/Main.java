import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a lista de pessoas e generos separados por virgula: ");
        String input = scanner.nextLine();

        List<Pessoa> pessoas = new ArrayList<>();

        String[] pessoasArray = input.split(",");
        for(String pessoasString : pessoasArray) {
            String[] pessoaGenero = pessoasString.split("-");
            Pessoa pessoa = new Pessoa(pessoaGenero[0], pessoaGenero[1]);
            pessoas.add(pessoa);
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("F"))
                .collect(Collectors.toList());

        System.out.print("Mulheres: ");
        mulheres.forEach(pessoa -> System.out.print(pessoa.getNome()));
    }
}