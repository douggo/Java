package CWLE.Ordenacoes;

import java.util.ArrayList;
import java.util.List;

import CWLE.Ordenacoes.Comparators.ComparatorTitularConta;
import HIP.Bytebank.Model.Cliente;
import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;

public class OrdenacaoTitularConta {

    public static void main(String[] args) {
        System.out.println();
        List<Conta> contas = criaListaContas();
        System.out.println("-- Ordem das Contas antes da Ordenação pelo Titular --");
        imprimeContas(contas);
        System.out.println();
        contas.sort(new ComparatorTitularConta());
        imprimeContas(contas);
    }

    private static List<Conta> criaListaContas() {
        Conta cc1 = new ContaCorrente(22, 33, 333.0);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);

        Conta cc2 = new ContaPoupanca(22, 44, 444.0);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);

        Conta cc3 = new ContaCorrente(22, 11, 111.0);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);

        Conta cc4 = new ContaPoupanca(22, 22, 222.0);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cc4);

        return contas;
    }

    private static void imprimeContas(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println(conta + " | " + conta.getTitular().getNome());
        }
    }

}
