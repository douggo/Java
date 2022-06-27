package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;   
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
    
}
