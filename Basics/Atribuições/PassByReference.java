package Basics.Atribuições;

public class PassByReference {
    
    public static void main(String[] args) {
        System.out.println();
        Pessoa doug = new Pessoa("Douglas", "19/03/1997", "123.456.789-00", 'M');
        Pessoa doug2 = doug;
        doug.setDataNascimento("18/03/1997");
        System.out.println("Data de nascimento de Doug2 é: " + doug2.getDataNascimento());
        /*
         * Já que não estamos mais trabalhando com tipos primitivos, o Java passa a
         * atribuir os valores através da referência. Dessa forma, se mudarmos alguma
         * informação do objeto `doug`, `doug2` irá mostrar a mesma informação.
         */
    }

}

class Pessoa {
    
    String nome;
    String dataNascimento;
    String CPF;
    char sexo;

    public Pessoa(String nome, String dataNascimento, String CPF, char sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

}