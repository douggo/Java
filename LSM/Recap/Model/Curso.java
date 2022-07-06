package LSM.Recap.Model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

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

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return String.format("Curso: %s - Duração: %d minutos -> %s", this.nome, this.getTempoTotal(), this.aulas);
    }

}
