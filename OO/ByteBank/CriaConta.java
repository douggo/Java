package OO.ByteBank;

public class CriaConta {
    
    public static void main(String[] args) {
        System.out.println();
        Conta primeiraConta = criaConta(300);
        Conta segundaConta = criaConta(50);
        segundaConta.agencia = 146;
        imprimeDados(primeiraConta, "PrimeiraConta");
        imprimeDados(segundaConta, "SegundaConta");

    }

    private static Conta criaConta(double saldoInicial) {
        Conta conta = new Conta();
        conta.saldo = saldoInicial;
        return conta;
    }

    private static void imprimeDados(Conta conta, String titulo) {
        System.out.println("---- " + titulo + " ----");
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("Saldo: R$ " + conta.saldo);
        System.out.println();
    }

}
