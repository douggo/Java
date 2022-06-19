package Basics.Inteiros;

public class Operacoes {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("A idade de Douglas é " + getIdade());
    }

    /**
     * Método para retornar a idade do Douglas
     * @return int
     */
    private static int getIdade() {
        int number = 20;
        int idade = (number / 2) * 2 + 5;
        return idade;
    }
    
}