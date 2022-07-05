package LSM.Recap;

import LSM.Recap.Model.Aula;
import LSM.Recap.Model.Curso;

public class CriandoCurso {
    
    public static void main(String[] args) {
        Curso javaCollections = criaCurso();
        javaCollections.getAulas().forEach(aula -> System.out.println(aula));
    }

    private static Curso criaCurso() {
        Curso javaCollections = new Curso("Java Collections", "Douglas da Silva");
        javaCollections.adicionaAula(new Aula("HashSet", 20));
        javaCollections.adicionaAula(new Aula("Mapas", 25));
        javaCollections.adicionaAula(new Aula("Set", 15));
        return javaCollections;
    }

}
