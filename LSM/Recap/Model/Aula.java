package LSM.Recap.Model;

public class Aula implements Comparable<Aula> {
    
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return String.format(" [Aula: %s - %d minutos] ", this.titulo, this.tempo);
    }

    @Override
    public int compareTo(Aula aula) {
        return this.titulo.compareTo(aula.titulo);
    }

    

}
