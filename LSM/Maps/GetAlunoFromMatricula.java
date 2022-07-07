package LSM.Maps;

import LSM.Model.Aluno;
import LSM.Model.Curso;

public class GetAlunoFromMatricula {
    
    public static void main(String[] args) {
        Curso curso = new Curso("Java Collections", "Paulo Silveira");
        curso.matriculaAluno(new Aluno("Douglas", 316497));
        curso.matriculaAluno(new Aluno("Guilherme", 976431));
        curso.matriculaAluno(new Aluno("Francisco", 649731));
        
        int matricula = 316494;
        Aluno aluno = curso.getAlunoFromMatricula(matricula);
        System.out.format(
            "Existe um aluno com a matricula %s?%n%s%n", 
            matricula,
            aluno
        );
    }

}
