package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Administrador() {
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    
}
