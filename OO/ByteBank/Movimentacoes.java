package OO.ByteBank;

import OO.ByteBank.Model.Conta;

public class Movimentacoes {
    
    public static void main(String[] args) {
        System.out.println();
        Conta conta = new Conta(1337, 1234);
        realizaDeposito(conta, 300);
        System.out.println();
        System.out.println();
        realizaSaque(conta, 400);
        System.out.println();
        System.out.println();
        realizaTransferencia(conta);
    }

    private static void realizaDeposito(Conta conta, double valor) {
        conta.deposita(valor);
        System.out.println("Realizado um depósito de R$ " + valor);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }

    private static void realizaSaque(Conta conta, double valor) {
        boolean sucesso = conta.saca(valor);
        if (sucesso) {
            System.out.println("Realizado um saque de R$ " + valor);    
        } else {
            System.out.println("Valor (R$ " + valor + ") indisponível para saque!");
        }
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }

    private static void realizaTransferencia(Conta conta) {
        Conta contaDois = new Conta(1337, 5678);
        double valor = 50;
        boolean sucesso = conta.transfere(contaDois, valor);
        if(sucesso) {
            System.out.println("Transferido R$ " + valor + " da conta " + conta + " para a conta " + contaDois);
        } else {
            System.out.println("Não foi possível transferir R$ " + valor + " da conta " + conta + " para a conta " + contaDois);
        }
        System.out.println();
        imprimeDados(conta);
        imprimeDados(contaDois);
    }

    private static void imprimeDados(Conta conta) {
        System.out.println("---- " + conta + " ----");
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println();
    }

}