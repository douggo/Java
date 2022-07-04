package HIP.Bytebank.Model;

import java.io.Serializable;

public abstract class Conta implements Comparable<Conta>, Serializable {
    private /* transient */ Cliente titular; // transient torna o Cliente como não obrigatório na serialização
    private int agencia;
    private int numero;
    private double saldo;
    private static int total;

    public Conta(int agencia, int numero, double valor) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = valor;
        total++;
    }

    public boolean saca(double valor) {
        if(valor <=0 || this.saldo < valor) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean deposita(double valor) {
        if(valor <= 0) {
            return false;
        }
        this.saldo += valor;
        return true;
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
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

    public double getSaldo() {
        return this.saldo;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Conta: " + this.agencia + " | Número: " + this.numero + " | Saldo: " + this.saldo;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            return true;
        }
        Conta conta = (Conta) obj;
        if(this.agencia != conta.agencia) {
            return false;
        }
        if(this.numero != conta.numero) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.saldo, conta.saldo);
    }

}
