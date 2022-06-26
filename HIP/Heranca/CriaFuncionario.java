package HIP.Heranca;

import HIP.Heranca.Model.SuporteTecnico;
import HIP.Heranca.Model.Gerente;

public class CriaFuncionario {
    
    public static void main(String[] args) {
        System.out.println();
        criaFuncionario();
        criaGerente();
    }

    private static void criaFuncionario() {
        SuporteTecnico f1 = new SuporteTecnico();
        f1.setNome("Douglas");
        f1.setCPF("123.123.123-00");
        f1.setSalario(2600.00);
        System.out.println("Funcionário: " + f1.getNome() + " - CPF: " + f1.getCPF());
        System.out.println("Salário: " + f1.getSalario());
        System.out.println("Bonus: " + f1.getBonificacao());
        System.out.println();
    }

    private static void criaGerente() {
        Gerente g1 = new Gerente();
        g1.setNome("Guilherme");
        g1.setCPF("123.456.678-99");
        g1.setSalario(4250.55);
        g1.setSenha(2222);
        g1.getBonificacao();
        System.out.println("Gerente: " + g1.getNome() + " - CPF: " + g1.getCPF());
        System.out.println("Autenticado: " + g1.autentica(2222));
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Bonus: " + g1.getBonificacao());
        System.out.println();
    }

}
