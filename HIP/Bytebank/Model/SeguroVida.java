package HIP.Bytebank.Model;

import HIP.Bytebank.Interface.Tributavel;

public class SeguroVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
    
}
