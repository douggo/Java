package Basics.Laços;

public class Contador {
    
    public static void main(String[] args) {
        System.out.println();
        somaContador();
    }

    private static void somaContador() {
        int contador = 0;
        int total = 0;
        while(contador <= 10) {
            // Variável `contador` inicia como 1, ao invés de 0
            total += ++contador;
            System.out.println(total);
        }
    }

}
