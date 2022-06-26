package HIP.Heranca.Model;

public class Gerente extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }

    /**
     * Overload para o método autentica(), recebendo novos parâmetros.
     * @param login
     * @param senha
     * @return boolean
     */
    public boolean autentica(String login, int senha) {
        return true;
    }

    @Override
    public double getBonificacao() {
        // `super` para definir que o método/atributo está na classe-mãe
        return super.getBonificacao() + super.getSalario();
    }

}