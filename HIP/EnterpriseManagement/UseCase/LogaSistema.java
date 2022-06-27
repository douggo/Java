package HIP.EnterpriseManagement.UseCase;

import HIP.EnterpriseManagement.Model.Administrador;
import HIP.EnterpriseManagement.Model.Gerente;
import HIP.EnterpriseManagement.Model.SistemaInterno;

public class LogaSistema {
    
    public static void main(String[] args) {
        SistemaInterno sistemaInterno = new SistemaInterno();
        
        Administrador adm = new Administrador();
        adm.setSenha(1234);

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        sistemaInterno.autenticaFuncionario(adm);
        sistemaInterno.autenticaFuncionario(gerente);
    }
    
}
