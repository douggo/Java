package LSM.Model;

public class Aluno {
    
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if(nome == null || matricula == 0) {
            throw new NullPointerException("As informações do Aluno não podem estar nulas!");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return String.format(" [Aluno: %s - %s] ", this.nome, this.matricula);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno) obj;
        return this.nome.equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        /* 
         * Ao fazer o override do método `equals`, obrigatoriamente precisamos
         * fazer o override do método hashCode()` também!
         */
        return this.nome.hashCode();
    }

}
