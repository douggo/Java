package HIP.Bytebank.Model;

import HIP.Bytebank.Interface.Tributavel;

public class CalculadorImposto {
    
    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }

}
