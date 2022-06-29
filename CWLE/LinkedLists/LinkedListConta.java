package CWLE.LinkedLists;

import java.util.LinkedList;

import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;

public class LinkedListConta {
    
    public static void main(String[] args) {
        System.out.println();
        LinkedList<Conta> array = criaLinkedListContas();
        System.out.println("Contas criadas:");
        System.out.println();
        for(Conta conta : array) {
            if(conta.getAgencia() == 1) {
                System.out.println("Conta Corrente: " + conta.getAgencia() + "." + conta.getNumero());
            } else {
                System.out.println("Conta Poupança: " + conta.getAgencia() + "." + conta.getNumero());
            }
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println();
        }
    }

    /**
     * Famosa lista duplamente encadeada, aprendida nas aulas de
     * Algoritmos e Estrutura de Dados III. Não recomendado utilizar caso seja
     * necessário iterar, já que a lista será iterada pelo encadeamento.
     * 
     * @return LinkedList<Conta>
     */
    private static LinkedList<Conta> criaLinkedListContas() {
        LinkedList<Conta> array = new LinkedList<Conta>();
        ContaCorrente cc1 = new ContaCorrente(1, 1, 150);
        ContaCorrente cc2 = new ContaCorrente(1, 2, 25);
        ContaCorrente cc3 = new ContaCorrente(1, 3, 5320.99);
        ContaPoupanca cp1 = new ContaPoupanca(2, 1, 2420);
        ContaPoupanca cp2 = new ContaPoupanca(2, 2, 6900);
        array.add(cc1);
        array.add(cc2);
        array.add(cc3);
        array.add(cp1);
        array.add(cp2);
        return array;
    }

}
