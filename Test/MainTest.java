import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class MainTest {

    @Test
    public void testFilterMulheres() {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", "M"));
        pessoas.add(new Pessoa("Maria", "F"));
        pessoas.add(new Pessoa("José", "M"));
        pessoas.add(new Pessoa("Ana", "F"));
        pessoas.add(new Pessoa("Pedro", "M"));

        List<Pessoa> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equals("F"))
                .collect(Collectors.toList());

        for (Pessoa pessoa : mulheres) {
            assertTrue(pessoa.getGenero().equals("F"));
        }
    }
}

