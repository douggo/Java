package LSM.Sets;

import LSM.Model.Aluno;
import LSM.Model.Aula;
import LSM.Model.Curso;

public class ComparandoAlunos {
    
    public static void main(String[] args) {
        System.out.println();
        Curso javaCollections = criaCurso();
        matriculaAlunos(javaCollections);
        comparaAlunos(javaCollections);
    }

    private static Curso criaCurso() {
        Curso curso = new Curso("Java Collections: Listas, Sets e Mapas", "Paulo Silveira");
        curso.adicionaAula(new Aula("ArrayLists", 25));
        curso.adicionaAula(new Aula("Sets", 15));
        curso.adicionaAula(new Aula("Mapas ", 9));
        return curso;
    }

    private static void matriculaAlunos(Curso curso) {
        curso.matriculaAluno(new Aluno("Guilherme", 32465));
        curso.matriculaAluno(new Aluno("Francisco", 100341));
        curso.matriculaAluno(new Aluno("Henrique", 97664));
    }

    private static void comparaAlunos(Curso curso) {
        Aluno a1 = new Aluno("Douglas", 134697);
        curso.matriculaAluno(a1);
        /* As informações vieram de um formulário e precisamos criar um novo objeto com os mesmos dados */
        Aluno alunoFromRequest = new Aluno("Douglas", 134697);
        System.out.format("a1 equals alunoFromRequest (%b)%n", a1.equals(alunoFromRequest));
        System.out.format(
            "alunos do curso contains alunoFromRequest (%b)%n", 
            curso.isAlunoMatriculado(alunoFromRequest)
        );
        //System.out.format();
        //System.out.format();
    }

}
