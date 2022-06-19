package Basics.Atribuições;

public class PassByValue {
    
    public static void main(String[] args) {
        System.out.println();
        int valor1 = 5;
        int valor2 = 10;
        System.out.println("Variável `valor1` = " + valor1);
        System.out.println("Variável `valor2` = " + valor2);
        System.out.println("---");
        valor2 = valor1;
        valor1 = 37;
        System.out.println("Variável `valor1` = " + valor1);
        System.out.println("Variável `valor2` = " + valor2);
        /*
         * Como estamos trabalhando com tipos primitivos de dados, a atribuição sempre
         * será feita por valor. Dessa forma, a variável `valor2` ainda terá como valor
         * `5` mesmo após a mudança de valor da variável `valor1`
         */
    }

}
