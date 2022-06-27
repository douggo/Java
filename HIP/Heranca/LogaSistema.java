package HIP.Heranca;

import HIP.Heranca.Model.Administrador;
import HIP.Heranca.Model.Gerente;
import HIP.Heranca.UseCase.SistemaInterno;

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
