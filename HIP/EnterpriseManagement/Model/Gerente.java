package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    public double getBonificacao() {
        // `super` para definir que o método/atributo está na classe-mãe
        return super.getSalario();
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