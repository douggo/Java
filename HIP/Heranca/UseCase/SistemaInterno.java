package HIP.Heranca.UseCase;

import HIP.Heranca.Model.FuncionarioAutenticavel;

public class SistemaInterno {
    
    private int senha = 1234;

    public boolean autenticaFuncionario(FuncionarioAutenticavel funcionario) {
        if(this.senha == funcionario.getSenha()) {
            System.out.println("Usuário logado com sucesso!");
            return true;
        }
        System.out.println("Erro ao logar: senha inválida!");
        return false;
    }

}
