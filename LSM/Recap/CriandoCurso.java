package LSM.Recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import LSM.Recap.Model.Aula;
import LSM.Recap.Model.Curso;

public class CriandoCurso {
    
    public static void main(String[] args) {
        System.out.println();
        Curso javaCollections = criaCurso();
        imprimeAulas(javaCollections.getAulas());
        System.out.println();
        imprimeCurso(javaCollections);
    }

    private static Curso criaCurso() {
        Curso javaCollections = new Curso("Java Collections", "Douglas da Silva");
        javaCollections.adicionaAula(new Aula("Set", 15));        
        javaCollections.adicionaAula(new Aula("Mapas", 25));
        javaCollections.adicionaAula(new Aula("HashSet", 20));
        return javaCollections;
    }

    private static void imprimeAulas(List<Aula> aulas) {
        /* UnmodifiableList não dá pra ordernar, tem que criar uma lista separada */
        List<Aula> aulasOrdenadas = new ArrayList<Aula>(aulas);
        Collections.sort(aulasOrdenadas);
        aulasOrdenadas.forEach(aula -> System.out.println(aula));
    }

    private static void imprimeCurso(Curso curso) {
        System.out.println(curso);
    }

}
