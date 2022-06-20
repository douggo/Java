package Basics.Condicionais;

public class ExpressoesBooleanas {
    
    public static void main(String[] args) {
        System.out.println();
        int idade = 18;
        int quantidadePessoas = 1;
        boolean isAcompanhado = quantidadePessoas > 1;
        if(idade >= 18 || isAcompanhado) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada proibida");
        }
    }

}
