package OO.ByteBank;

import OO.ByteBank.Model.Cliente;
import OO.ByteBank.Model.Conta;

public class CriaConta {
    
    public static void main(String[] args) {
        System.out.println();
        Conta primeiraConta = criaConta(300);
        Conta segundaConta = criaConta(50);
        criaCliente(primeiraConta);
        criaCliente(segundaConta);
        segundaConta.setAgencia(146);
        imprimeDados(primeiraConta, "PrimeiraConta");
        imprimeDados(segundaConta, "SegundaConta");
        System.out.println("Total de contas criadas: " + primeiraConta.getTotal());
    }

    private static Conta criaConta(double saldoInicial) {
        Conta conta = new Conta(1337, 1234);
        conta.setSaldo(saldoInicial);
        return conta;
    }

    private static void criaCliente(Conta conta) {
        Cliente cliente = new Cliente();
        cliente.setCpf("123.456.789-00");
        cliente.setNome("Douglas");
        cliente.setProfissao("Desenvolvedor");
        conta.setTitular(cliente);
    }

    private static void imprimeDados(Conta conta, String titulo) {
        System.out.println("---- " + titulo + " ----");
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Titular: " + conta.getTitular().getNome() + " - " + conta.getTitular().getCpf());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println();
    }

}
