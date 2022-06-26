package HIP.Bytebank.Model;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(int agencia, int numero, double valor) {
        super(agencia, numero, valor);
    }

    @Override
    public boolean saca(double valor) {
        /* Saques de Contas Correntes deverão ter uma taxa de R$ 0,20 em cima do valor */
        valor += 0.20;
        return super.saca(valor);
    }

}
