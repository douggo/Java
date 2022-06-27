package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class Cliente implements Autenticavel {

    private Autenticador autenticador;

    public Cliente() {
        this.autenticador = new Autenticador();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    
}
