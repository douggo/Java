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
    }

}