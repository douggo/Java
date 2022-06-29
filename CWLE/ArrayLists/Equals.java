package CWLE.ArrayLists;

import java.util.ArrayList;

import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;

public class Equals {

    public static void main(String[] args) {
        ArrayList<Conta> contas = criaArrayListContas();
        Conta cc3 = new ContaCorrente(1, 1, 4320);
        // Foi sobrescrito o método `equals` do Model Conta em HIP/ByteBank/Model!
        System.out.println("Conta já existe?" + contas.contains(cc3));
    }

    private static ArrayList<Conta> criaArrayListContas() {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        Conta cc1 = new ContaCorrente(1, 1, 4320);
        Conta cc2 = new ContaCorrente(1, 2, 25);
        contas.add(cc1);
        contas.add(cc2);
        return contas;
    }

}