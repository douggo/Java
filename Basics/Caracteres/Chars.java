package Basics.Caracteres;

public class Chars {
    
    public static void main(String[] args) {
        int valor = 66;
        System.out.println();
        System.out.println("Trabalhando com char: " + getChar());
        System.out.println("Convertendo '" + valor + "' para char: " + valueToChar(valor));
        System.out.println("Qual é o próximo valor depois de (" + valueToChar(valor) + ")? " + nextValueToChar(valor));
    }

    private static char getChar() {
        // String utiliza " (aspas duplas), Char utiliza ' (aspas simples)
        char letra = 'a';
        return letra;
    }

    private static char valueToChar(int valor) {
        // Ao receber o `valor`, é um int. Realiza-se um cast para char.
        return (char) valor;
    }

    private static char nextValueToChar(int valor) {
        return (char) (valueToChar(valor) + 1);
    }

}
