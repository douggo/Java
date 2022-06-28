package CWLE;

import HIP.Bytebank.Model.ContaCorrente;

public class ArrayReferencia {
    
    public static void main(String[] args) {
        System.out.println();
        inicializaArrayContas();
    }

    private static void inicializaArrayContas() {
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(1, 1, 100);
        ContaCorrente cc2 = new ContaCorrente(1, 2, 120);
        contas[0] = cc1;
        contas[1] = cc2;
        ContaCorrente ref = contas[0];
        System.out.println("Acesso direto pelo objeto: ");
        System.out.println("Conta Corrente - " + cc1.getAgencia() + "-" + cc1.getNumero());
        System.out.println();
        System.out.println("Acesso direto pelo array de contas: ");
        System.out.println("Conta Corrente - " + contas[0].getAgencia() + "-" + contas[0].getNumero());
        System.out.println();
        System.out.println("Acesso pela referência: ");
        System.out.println("Conta Corrente - " + ref.getAgencia() + "-" + ref.getNumero());
    }

}
