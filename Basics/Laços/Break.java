package Basics.Laços;

public class Break {
 
    public static void main(String[] args) {
        System.out.println();
        imprimeForBreak();
        imprimeForSemBreak();
    }

    public static void imprimeForBreak() {
        for(int i = 0; i <= 10; i++) {
            for(int j = 0; j <= 10; j++) {
                if(j > i) {
                    break;
                }
                System.out.print('*');
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void imprimeForSemBreak() {
        for(int linha = 0; linha <= 10; linha++) {
            for(int coluna = 0; linha >= coluna; coluna++) {
                if(coluna > linha) {
                    break;
                }
                System.out.print('*');
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
