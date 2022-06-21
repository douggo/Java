package Basics.Laços;

public class Whiles {
    
    public static void main(String[] args) {
        System.out.println();
        imprimeContador();
    }

    private static void imprimeContador() {
        int contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        System.out.println("Após o bloco while: contador = " + contador);
    }

}