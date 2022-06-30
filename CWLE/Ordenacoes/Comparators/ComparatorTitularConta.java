package CWLE.Ordenacoes.Comparators;

import java.util.Comparator;

import HIP.Bytebank.Model.Conta;

public class ComparatorTitularConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        String titularC1 = conta1.getTitular().getNome();
        String titularC2 = conta2.getTitular().getNome();
        return titularC1.compareTo(titularC2);
    }
    
}
