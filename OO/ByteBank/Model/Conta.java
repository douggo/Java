package OO.ByteBank.Model;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public int getTotal() {
        return total;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


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