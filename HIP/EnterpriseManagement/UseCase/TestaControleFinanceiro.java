package HIP.EnterpriseManagement.UseCase;

import HIP.EnterpriseManagement.Model.Funcionario;
import HIP.EnterpriseManagement.Model.Gerente;
import HIP.EnterpriseManagement.Model.SuporteTecnico;

public class TestaControleFinanceiro {
    
    private static double total;

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Guilherme");
        g1.setSalario(3540.99);
        
        SuporteTecnico st1 = new SuporteTecnico();
        st1.setNome("Matheus");
        st1.setSalario(1500.00);
        
        registra(g1);
        registra(st1);

        System.out.println("Soma da bonificação: R$ " + getTotal());
    }

    /**
     * Polimorfismo
     * 
     * `Gerente` e `Suporte Técnico` herdam a classe Funcionário, dessa forma podemos passá-los
     * e o Java irá entender que eles são da classe Funcionário.
     * 
     * Dessa forma, ao executar o método `getBonificacao()`, será redirecionado para o método
     * específico de cada classe.
     * 
     * Se o gerente tiver um método `getBonificacao()`, será executado este método.
     * Caso contrário, será executado o método na classe pai (Funcionario).
     */
    public static void registra(Funcionario f1) {
        double bonificacao = f1.getBonificacao();
        setTotal(bonificacao);
    }

    public static void setTotal(double bonificacao) {
        total += bonificacao;
    }

    public static double getTotal() {
        return total;
    }

}
