package LSM.Sets;

import java.util.Iterator;

import LSM.Model.Aluno;
import LSM.Model.Curso;

public class Iterando {
    
    public static void main(String[] args) {
        Curso curso = criaCurso();
        Iterator<Aluno> alunoIterator = curso.getAlunos().iterator();
        while(alunoIterator.hasNext()) {
            Aluno aluno = (Aluno) alunoIterator.next();
            System.out.println(aluno);
        }
    }

    private static Curso criaCurso() {
        Curso curso = new Curso("Java Collections", "Paulo Silveira");
        curso.matriculaAluno(new Aluno("Douglas"  , 134697));
        curso.matriculaAluno(new Aluno("Guilherme", 32465));
        curso.matriculaAluno(new Aluno("Francisco", 100341));
        curso.matriculaAluno(new Aluno("Henrique" , 97664));
        return curso;
    }

}
