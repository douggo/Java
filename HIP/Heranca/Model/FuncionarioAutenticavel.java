package HIP.Heranca.Model;

public abstract class FuncionarioAutenticavel extends Funcionario {
    
    private int senha;

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

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return this.senha;
    }

}
