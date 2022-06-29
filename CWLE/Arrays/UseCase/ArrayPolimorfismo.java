package CWLE.Arrays.UseCase;

import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;
import HIP.EnterpriseManagement.Model.Gerente;
import HIP.EnterpriseManagement.Model.SuporteTecnico;

public class ArrayPolimorfismo {
    
    public static void main(String[] args) {
        System.out.println();
        manipulaArrayConta();
        manipulaArrayObject();
    }

    private static void manipulaArrayConta() {
        // Conta é abstrato e dela criam-se `ContaCorrente` e `ContePoupanca`
        Conta[] conta = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(1, 1, 120);
        ContaPoupanca cp1 = new ContaPoupanca(2, 1, 400);

        conta[0] = cc1;
        conta[1] = cp1;

        // Type Cast do mais abstrato pro mais concreto (Conta -> Conta Corrente)
        ContaCorrente refCc = (ContaCorrente) conta[0];
        // Type Cast do mais abstrato pro mais concreto (Conta -> Conta Poupança)
        ContaPoupanca refCp = (ContaPoupanca) conta[1];

        /*
         * Ao tentar trocar o tipo do cast para uma classe que não corresponda ao
         * índice do array, irá disparar uma exceção: ClassCastException
         */

        System.out.println("Conta Corrente: A" + refCc.getAgencia() + "-" + refCc.getNumero());
        System.out.println("Conta Poupança: B" + refCp.getAgencia() + "-" + refCp.getNumero());
    }

    private static void manipulaArrayObject() {
        Object[] mixed = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(1, 1, 140);
        ContaPoupanca cp1 = new ContaPoupanca(2, 1, 3250.99);
        Gerente grt = new Gerente();
        SuporteTecnico sto = new SuporteTecnico();

        mixed[0] = cc1;
        mixed[1] = cp1;
        mixed[2] = grt;
        mixed[3] = sto;

        ContaCorrente ref1 = (ContaCorrente) mixed[0];
        ContaPoupanca ref2 = (ContaPoupanca) mixed[1];
        Gerente ref3 = (Gerente) mixed[2];
        SuporteTecnico ref4 = (SuporteTecnico) mixed[3];

        // Essas referências...
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);
        System.out.println(ref4);

        // são as mesmas que essas
        System.out.println(mixed[0]);
        System.out.println(mixed[1]);
        System.out.println(mixed[2]);
        System.out.println(mixed[3]);

    }
    
}
