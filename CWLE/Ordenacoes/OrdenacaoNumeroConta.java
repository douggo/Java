package CWLE.Ordenacoes;

import java.util.ArrayList;
import java.util.List;

import CWLE.Ordenacoes.Comparators.ComparatorNumeroConta;
import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;

public class OrdenacaoNumeroConta {
    
    public static void main(String[] args) {
        System.out.println();
        List<Conta> contas = criaListaContas();
        System.out.println("-- Ordem das Contas antes da Ordenação pelo Número da Conta --");
        imprimeContas(contas);
        contas.sort(new ComparatorNumeroConta());
        System.out.println();
        System.out.println("-- Ordem das Contas após a Ordenação pelo Número da Conta --");
        imprimeContas(contas);
    }

    private static List<Conta> criaListaContas() {
        Conta cc1 = new ContaCorrente(22, 33, 333.0);
        Conta cc2 = new ContaPoupanca(22, 44, 444.0);
        Conta cc3 = new ContaCorrente(22, 11, 111.0);
        Conta cc4 = new ContaPoupanca(22, 22, 222.0);
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cc4);
        return contas;
    }

    private static void imprimeContas(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

}