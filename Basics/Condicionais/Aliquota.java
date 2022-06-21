package Basics.Condicionais;

public class Aliquota {
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println(getSalarioLiquido());
    }

    public static String getSalarioLiquido() {
        double salario = 2800.01;
        if(salario >= 1900.0 && salario <= 2800.0) {
            return "R$" + (salario - 142.0) + "";
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            return "R$" + (salario - 350.0) + "";
        } else if (salario >= 3751.01 && salario <= 4664.0) {
            return "R$" + (salario - 636.0) + "";
        }
        return "regra ainda não implementada.";
    }

}
