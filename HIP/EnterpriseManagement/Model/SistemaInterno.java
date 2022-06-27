package HIP.EnterpriseManagement.Model;

import HIP.EnterpriseManagement.Interface.Autenticavel;

public class SistemaInterno {
    
    private int senha = 1234;

    public boolean autenticaFuncionario(Autenticavel user) {
        if(this.senha == user.getSenha()) {
            System.out.println("Usuário logado com sucesso!");
            return true;
        }
        System.out.println("Erro ao logar: senha inválida!");
        return false;
    }

}
