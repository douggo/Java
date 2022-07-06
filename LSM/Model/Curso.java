package LSM.Model;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<Aluno>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(this.alunos);
    }

    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public boolean isAlunoMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    
    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.getNome());
    }

    @Override
    public String toString() {
        return String.format("Curso: %s - Duração: %d minutos -> %s", this.nome, this.getTempoTotal(), this.aulas);
    }

}
