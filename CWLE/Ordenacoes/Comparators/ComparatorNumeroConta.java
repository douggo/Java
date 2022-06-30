package CWLE.Ordenacoes.Comparators;

import java.util.Comparator;

import HIP.Bytebank.Model.Conta;

public class ComparatorNumeroConta implements Comparator<Conta> {

    @Override
    public int compare(Conta conta1, Conta conta2) {
        return Integer.compare(conta1.getNumero(), conta2.getNumero());
    }
    
}
