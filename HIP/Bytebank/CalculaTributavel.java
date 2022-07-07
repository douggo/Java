package HIP.Bytebank;

import HIP.Bytebank.Model.CalculadorImposto;
import HIP.Bytebank.Model.ContaCorrente;
import HIP.Bytebank.Model.SeguroVida;

public class CalculaTributavel {
    
    public static void main(String[] args) { 
        ContaCorrente cc = new ContaCorrente(1, 1, 0);
        cc.deposita(100);

        SeguroVida sv = new SeguroVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(cc);
        ci.registra(sv);

        System.out.println("Total de Imposto: R$ " + ci.getTotalImposto());
    }

}
