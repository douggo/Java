package Basics.Conversões;

public class Conversao {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("A conversão de double para int: " + doubleToInt());
    }

    private static int doubleToInt() {
        double salario = 1250.76;
        return (int) salario;
    }

}
