package OO.Referencia;

import OO.ByteBank.Conta;

public class Referencia {
    
    public static void main(String[] args) {
        System.out.println();
        atribuicaoPorReferencia();
        atribuicaoPorInstancia();
    }

    private static void atribuicaoPorReferencia() {
        Conta contaUm = new Conta();
        contaUm.saldo = 450.99;
        contaUm.numero = 2;
        contaUm.titular = "Douglas";
        Conta contaDois = contaUm;
        contaDois.saldo = 1540.99;
        imprimeDados(contaUm, "ContaUm");
        imprimeDados(contaDois, "ContaDois");
    }

    private static void atribuicaoPorInstancia() {
        Conta contaUm = new Conta();
        contaUm.saldo = 450.99;
        contaUm.numero = 2;
        contaUm.titular = "Douglas";
        Conta contaDois = new Conta();
        contaDois.saldo = 50;
        contaDois.numero = 2;
        contaDois.titular = "Fulano";
        imprimeDados(contaUm, "ContaUm");
        imprimeDados(contaDois, "ContaDois");
    }

    private static void imprimeDados(Conta conta, String titulo) {
        System.out.println("---- " + titulo + " ----");
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("Número: " + conta.numero);
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo: R$ " + conta.saldo);
        System.out.println("Referência: " + conta);
        System.out.println();
    }

}
