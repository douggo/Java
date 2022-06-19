package Basics.Conversões;

public class OutrosTiposNumericos {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Para números grandes, usar long: " + getLongNumber());
        System.out.println("Para valores pequenos, usar short: " + getShortNumber());
        System.out.println("Para valores muito pequenos, usar o byte: " + getByteNumber());
        System.out.println("Além de double, temos o float: " + getFloatNumber());
        System.out.println("Java usa a normalização IEEE 754: " + getSomaDouble());
    }

    private static long getLongNumber() {
        /*
         *  Mesma situação da divisão do double, devemos
         *  informar ao java que estamos utilizando um long (L)
         */
        long numeroGrande = 123456789123L;
        return numeroGrande;
    }

    private static short getShortNumber() {
        short numeroPequeno = 2131;
        return numeroPequeno;
    }

    private static byte getByteNumber() {
        byte numeroMuitoPequeno = 127;
        return numeroMuitoPequeno;
    }

    private static float getFloatNumber() {
        /**
         * Precisamos informar ao java que queremos um float
         * usando a letra 'f' ao final do valor
         */
        float numero = 3.14f;
        return numero;
    }

    private static double getSomaDouble() {
        return 0.2 + 0.1;
    }

}
