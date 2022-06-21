package Basics.Laços;

public class LacoEncadeado {
    
    public static void main(String[] args) {
        System.out.println();
        imprimeTabuada();
    }

    private static void imprimeTabuada() {
        for(int i = 1; i <= 10; i++) {
            System.out.print("Tabuada de " + i + ": ");
            for(int j = 0; j <= 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
