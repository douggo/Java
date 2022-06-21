package Basics.Laços;

public class DesafioMultiplosTres {
    
    public static void main(String[] args) {
        System.out.println();
        imprimeMultiplosDeTres();
    }

    private static void imprimeMultiplosDeTres() {
        System.out.println("Múltiplos de três:");
        for(int i = 0; i <= 100; i++) {
            if(i % 3 != 0) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

}
