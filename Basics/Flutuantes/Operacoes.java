package Basics.Flutuantes;

public class Operacoes {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("O resultado da soma (usando ponto flutuante) é: " + doubleSoma());
        System.out.println("O resultado da soma (usando inteiros) é: " + intSoma());
        System.out.println("O resultado da divisão de double (mas inteiro) é: " + doubleDivisao());
        System.out.println("Forçando a divisão como double, teremos o resultado: " + forceDoubleDivisao());
    }

    private static double doubleSoma() {
        double num1 = 5.24;
        double num2 = 6.76;
        return num1 + num2;
    }

    private static double intSoma() {
        // A tipagem aceita int (mas int não aceita double por questões de tamanho)
        double num1 = 5;
        double num2 = 6;
        return num1 + num2;
    }

    private static double doubleDivisao() {
        // Ao usar valores inteiros, o Java irá tratar o resultado como inteiro
        double resultado = 5 / 2;
        return resultado; // 2
    }

    private static double forceDoubleDivisao() {
        // Ao utilizar um valor flutuante, o Java irá tratar o resultado como double
        double resultado = 5.0 / 2;
        return resultado; // 2.5
    }

}
