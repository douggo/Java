package CWLE.ClassesAnonimas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import HIP.Bytebank.Model.Cliente;
import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;

public class OrdenacaoTitularConta {

    public static void main(String[] args) {
        System.out.println();
        List<Conta> contas = criaListaContas();
        System.out.println("-- Ordem Original --");
        imprimeContas(contas);
        System.out.println();
        ordenaContaPorNumero(contas);
        System.out.println("-- Ordem das Contas após da Ordenação pelo Número da Conta --");
        imprimeContas(contas);
        System.out.println();
        ordenaContaPorTitular(contas);
        System.out.println("-- Ordem das Contas após a Ordenação pelo Titular --");
        imprimeContas(contas);
    }

    private static void ordenaContaPorNumero(List<Conta> contas) {
        /* Classe Anônima para ordenar pelo Número da Conta */
        contas.sort(new Comparator<Conta>() {
            @Override
            public int compare(Conta conta1, Conta conta2) {
                return Integer.compare(conta1.getNumero(), conta2.getNumero());
            }
        });
    }

    private static void ordenaContaPorTitular(List<Conta> contas) {
        /* Classe anônima para ordenar as contas pelo saldo */
        Comparator<Conta> comparator = new Comparator<Conta>() {
            @Override
            public int compare(Conta conta1, Conta conta2) {
                String titularC1 = conta1.getTitular().getNome();
                String titularC2 = conta2.getTitular().getNome();
                return titularC1.compareTo(titularC2);
            }
        };
        contas.sort(comparator);
    }
    
    private static ContaCorrente criaContaCorrente(int agencia, int numero, double saldo, String nome) {
        ContaCorrente cc1 = new ContaCorrente(agencia, numero, saldo);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome(nome);
        cc1.setTitular(clienteCC1);
        return cc1;
    }

    private static ContaPoupanca criaContaPoupanca(int agencia, int numero, double saldo, String nome) {
        ContaPoupanca cp1 = new ContaPoupanca(agencia, numero, saldo);
        Cliente clienteCP1 = new Cliente();
        clienteCP1.setNome(nome);
        cp1.setTitular(clienteCP1);
        return cp1;
    }

    private static List<Conta> criaListaContas() {
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(criaContaCorrente(22, 33, 333.0, "Nico"));
        contas.add(criaContaPoupanca(22, 44, 444.0, "Guilherme"));
        contas.add(criaContaCorrente(22, 11, 111.0, "Paulo"));
        contas.add(criaContaPoupanca(22, 22, 222.0, "Ana"));
        return contas;
    }

    private static void imprimeContas(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println(conta + " | " + conta.getTitular().getNome());
        }
    }

}
