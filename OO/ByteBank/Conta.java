package OO.ByteBank;

public class Conta {
    public double saldo;
    public int agencia;
    public int numero;
    public String titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if(this.saldo <= 0 || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transfere(Conta conta, double valor) {
        if(this.saldo <= 0 || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        conta.deposita(valor);
        return true;
    }

}