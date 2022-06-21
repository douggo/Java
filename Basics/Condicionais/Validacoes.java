package Basics.Condicionais;

public class Validacoes {

    public static void main(String[] args) {
        System.out.println();
        int idade = 15;
        boolean isAcompanhado = false;
        if(idade > 18) {
            System.out.println("Entrada permitida.");
        } else {
            if(isAcompanhado) {
                System.out.println("Menor de idade, porém entrada permitida");
            } else {
                System.out.println("Entrada proibida");
            }
        }
        System.out.println(getValidacao());
    }

    private static String getValidacao() {
        /*
         * Variáveis estão vinculadas ao escopo do bloco. Nunca são globais.
         * Ao criar uma variável dentro de um if ou else, ela não estará
         * disponível para o restante do método.
         * 
         * Para conseguir utilizar o seu valor no restante do escopo, é necessário
         * instanciá-la no início do método;
         */
        //boolean isValido;
        boolean isTrue = true;
        if(isTrue) {
            boolean isValido = true;
            // Não existe no else e nem no restante do método.
            return "" + isValido + "";
        } else {
            boolean isValido = false;
            // Não existe (obviamente) no if e nem no restante do método.
            return "" + isValido + "";
        }
    }

}