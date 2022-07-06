package LSM.Sets;

import LSM.Model.Aluno;
import LSM.Model.Aula;
import LSM.Model.Curso;

public class MatriculaAlunoAoCurso {
    
    public static void main(String[] args) {
        System.out.println();
        Curso javaCollections = criaCurso();
        matriculaAlunos(javaCollections);
        imprimeInformacoes(javaCollections);
    }

    private static Curso criaCurso() {
        Curso curso = new Curso("Java Collections: Listas, Sets e Mapas", "Paulo Silveira");
        curso.adicionaAula(new Aula("ArrayLists", 25));
        curso.adicionaAula(new Aula("Sets", 15));
        curso.adicionaAula(new Aula("Mapas ", 9));
        return curso;
    }

    private static void matriculaAlunos(Curso curso) {
        curso.matriculaAluno(new Aluno("Douglas", 134697));
        curso.matriculaAluno(new Aluno("Guilherme", 32465));
        curso.matriculaAluno(new Aluno("Francisco", 100341));
        curso.matriculaAluno(new Aluno("Henrique", 97664));
    }

    private static void imprimeInformacoes(Curso curso) {
        System.out.println("--- Informações do curso ---");
        System.out.println(curso);
        System.out.println("--- Alunos matriculados ---");
        curso.getAlunos().forEach(aluno -> System.out.println(aluno));
    }

}
