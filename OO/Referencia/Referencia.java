package OO.Referencia;

import OO.ByteBank.Model.Conta;

public class Referencia {
    
    public static void main(String[] args) {
        System.out.println();
        atribuicaoPorReferencia();
        atribuicaoPorInstancia();
    }

    private static void atribuicaoPorReferencia() {
        Conta contaUm = new Conta();
        contaUm.setSaldo(450.99);
        contaUm.setNumero(2);
        Conta contaDois = contaUm;
        contaDois.setSaldo(1540.99);
        imprimeDados(contaUm, "ContaUm");
        imprimeDados(contaDois, "ContaDois");
    }

    private static void atribuicaoPorInstancia() {
        Conta contaUm = new Conta();
        contaUm.setSaldo(450.99);
        contaUm.setNumero(2);
        Conta contaDois = new Conta();
        contaDois.setSaldo(50);
        contaDois.setNumero(2);
        imprimeDados(contaUm, "ContaUm");
        imprimeDados(contaDois, "ContaDois");
    }

    private static void imprimeDados(Conta conta, String titulo) {
        System.out.println("---- " + titulo + " ----");
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Referência: " + conta);
        System.out.println();
    }

}
