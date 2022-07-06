package LSM.Recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import LSM.Model.Aula;

public class ManipulandoArrayListObjetos {
    
    public static void main(String[] args) {
        System.out.println();
        List<Aula> aulas = criaListaAulas();
        System.out.println("Formato original das aulas: ");
        imprimeAulas(aulas);
        System.out.println();
        ordenaAulasPorTitulo(aulas);
        System.out.println();
        ordenaAulasPorDuracao(aulas);
    }

    private static ArrayList<Aula> criaListaAulas() {
        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(new Aula("Java OO", 30));
        aulas.add(new Aula("Java JDK", 20));
        aulas.add(new Aula("Git e Github", 15));
        return aulas;
    }

    private static void imprimeAulas(List<Aula> aulas) {
        aulas.forEach(aula -> System.out.println(aula));
    }

    private static void ordenaAulasPorTitulo(List<Aula> aulas) {
        System.out.println("Ordenação alfabética das Aulas: ");
        Collections.sort(aulas);
        imprimeAulas(aulas);
    }

    private static void ordenaAulasPorDuracao(List<Aula> aulas) {
        System.out.println("Ordenação por Duração:");
        //Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // ordenação em versões passadas do Java
        aulas.sort(Comparator.comparing(Aula::getTempo));
        //aulas.sort((aula1, aula2) -> Integer.compare(aula1.getTempo(), aula2.getTempo())); // usando Lambda Expression
        imprimeAulas(aulas);
    }

}
