package Basics.Laços;

public class DesafioFatorial {

    public static void main(String[] args) {
        System.out.println();
        imprimeFatorialComplexo();
        System.out.println();
        System.out.println();
        imprimeFatorialSimples();
    }

    private static void imprimeFatorialComplexo() {
        for(int n = 1; n <= 10; n++) {
            int fatorial = 1;
            System.out.println("Fatorial de " + n + ": ");
            for (int i = n; i != 0; i--) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(i + " X ");
                }    
                fatorial *= i;
            }
            System.out.print(" = " + fatorial);
            System.out.println();
            System.out.println();
        }
    }

    private static void imprimeFatorialSimples() {
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }

}
