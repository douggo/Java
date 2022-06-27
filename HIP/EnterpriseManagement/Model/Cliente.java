package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class Cliente implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
    
}
