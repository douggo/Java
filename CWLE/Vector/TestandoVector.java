package CWLE.Vector;

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import HIP.Bytebank.Model.Conta;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.ContaPoupanca;

public class TestandoVector {

    public static void main(String[] args) {
        System.out.println();
        List<Conta> contas = inicializaVectorContas();
        System.out.println("Quantidade de Contas: " + contas.size());
        for (Conta conta : contas) {
            String tipoConta = "Conta Corrente ";
            if(conta.getAgencia() == 2) {
                tipoConta = "Conta Poupança ";
            }
            System.out.println(tipoConta + conta.getAgencia() + "." + conta.getNumero());
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
            System.out.println("----------------------");
        }
        testaVectorAsCollection();
    }

    /**
     * Vector é threadsafe, ou seja, é possível utilizar esta estrutura de dados
     * para verificar dados entre duas threads diferentes. List, ArrayList e Linkedlist
     * não são threadsafe.
     * 
     * @return Vector<Conta>
     */
    private static List<Conta> inicializaVectorContas() {
        List<Conta> contas = new Vector<Conta>();
        contas.add(new ContaCorrente(1,1,150));
        contas.add(new ContaCorrente(1, 2, 5200));
        contas.add(new ContaCorrente(1, 3, 19850));
        contas.add(new ContaPoupanca(2, 1, 80000));
        contas.add(new ContaPoupanca(2, 2, 4000));
        contas.add(new ContaPoupanca(2, 3, 340));
        return contas;
    }

    private static void testaVectorAsCollection() {
        Collection<Conta> contas = new Vector<Conta>();
        contas.add(new ContaCorrente(1,1,150));
        //contas.get(); 
        // -> método não existe na Collection
        //contas.remove(1);
        // -> método existe, mas não espera um índice, mas sim um Objeto
    }

}