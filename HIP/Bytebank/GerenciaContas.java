package HIP.Bytebank;

import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;

public class GerenciaContas {

    public static void main(String[] args) {
        System.out.println();
        ContaCorrente contaCorrente = new ContaCorrente(1, 1, 150.50);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 1, 1500.0);
        processaTransferencia(contaCorrente, contaPoupanca);
    }

    /**
     * Realiza a transferência de um valor da `contaCorrente` para a `contaPoupanca`
     */
    private static void processaTransferencia(Conta origem, Conta destino) {
        double valor = 50.3;
        System.out.println("Conta Origem: " + origem.getAgencia() + " - " + origem.getNumero());
        System.out.println("Saldo: R$" + origem.getSaldo());
        origem.transfere(valor, destino);
        System.out.println(
            "Realizando transferência de R$" + valor + " para Conta: " + destino.getAgencia() + " - " + destino.getNumero()
        );
        System.out.println("Saldo após transferência: R$ " + origem.getSaldo());
        System.out.println();
        System.out.println("Conta Destino: " + destino.getAgencia() + " - " + destino.getNumero());
        System.out.println("Saldo: R$" + destino.getSaldo());
    }

}
