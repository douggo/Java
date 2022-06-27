package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

    private Autenticador autenticador;

    public Gerente() {
        this.autenticador = new Autenticador();
    }

    @Override
    public double getBonificacao() {
        // `super` para definir que o método/atributo está na classe-mãe
        return super.getSalario();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}