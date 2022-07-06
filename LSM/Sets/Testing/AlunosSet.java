package LSM.Sets.Testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class AlunosSet {
    
    /*
     * Quando usar Collections (Sets/Hashsets) e Lists (ArrayLists/LinkedLists/Vectors)?
     * 
     * Devemos usar Collection somente quando a ordenação dos dados não for algo importante. 
     * Já que não temos mais como recuperar o índice exato de onde o nosso objeto foi inserido. 
     * Dessa forma, por não terem um índice, o percurso das informações e validações são feitas 
     * de um jeito muito mais rápido e menos custoso. Além disso, não podemos recuperar pelo índice.
     * Método get() não existe.
     * 
     * Collections não têm ordenação, pelo fato de não terem uma sequência!
     * 
     * Devemos usar List quando a ordenação dos dados for importante.
     * Por ser necessário usar a sequência de inclusão, o percurso do array é muito mais custoso
     * assim como as suas validações. Além disso, listas são ordenáveis.
     * 
     * É possível realizar a conversão de uma Collection para uma List!
     * 
     * COLLECTION != COLLECTIONS
     * 
     * COLLECTION > SET (CONJUNTO) > HASHSET
     * COLLECTION > LIST > ARRAYLIST
     * 
     */

    public static void main(String[] args) {
        System.out.println();
        Collection<String> alunos = criaHashSetAlunos();
        insereAlunos(alunos);
        imprimeAlunos(alunos);
        encontraAluno(alunos, "Douglas");
        encontraAluno(alunos, "Carlos");
        removeAluno(alunos, "Klaus");
        ordenaListaAlunos(alunos);
    }

    private static Collection<String> criaHashSetAlunos() {
        HashSet<String> alunos = new HashSet<>();
        return alunos;
    }

    private static void insereAlunos(Collection<String> alunos) {
        alunos.add("Douglas");
        alunos.add("Guilherme");
        alunos.add("Francisco");
        alunos.add("Henrique");
        alunos.add("Douglas");
        alunos.add("Klaus");
    }

    private static void imprimeAlunos(Collection<String> alunos) {
        System.out.format(new Locale("pt", "BR"), "%nAlunos cadastrado (%s):%n%n", alunos.size());
        alunos.forEach(aluno -> System.out.println(aluno));
    }

    private static void encontraAluno(Collection<String> alunos, String aluno) {
        System.out.println();
        System.out.format("O Aluno %s está cadastrado? (%b) %n", aluno, alunos.contains(aluno));
    }

    private static void removeAluno(Collection<String> alunos, String aluno) {
        System.out.format("%nRemovendo aluno %s%n", aluno);
        alunos.remove(aluno);
    }

    private static void ordenaListaAlunos(Collection<String> alunos) {
        System.out.format("%nOrdenando a Lista de Alunos por ordem alfabética: %n");
        List<String> alunosList = new ArrayList<>(alunos);
        Collections.sort(alunosList);
        imprimeAlunos(alunosList);
    }

}
