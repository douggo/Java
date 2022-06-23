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
        segundaConta.agencia = 146;
        imprimeDados(primeiraConta, "PrimeiraConta");
        imprimeDados(segundaConta, "SegundaConta");

    }

    private static Conta criaConta(double saldoInicial) {
        Conta conta = new Conta();
        conta.saldo = saldoInicial;
        return conta;
    }

    private static void criaCliente(Conta conta) {
        Cliente cliente = new Cliente();
        cliente.cpf = "123.456.789-00";
        cliente.nome = "Douglas";
        cliente.profissao = "Desenvolvedor";
        conta.titular = cliente;
    }

    private static void imprimeDados(Conta conta, String titulo) {
        System.out.println("---- " + titulo + " ----");
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("Titular: " + conta.titular.nome + " - " + conta.titular.cpf);
        System.out.println("Saldo: R$ " + conta.saldo);
        System.out.println();
    }

}
