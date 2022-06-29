package CWLE.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class Integers {

    public static void main(String[] args) {
        System.out.println();
        autoboxing();
        System.out.println();
        System.out.println();
        unboxing();
        System.out.println();
        System.out.println();
        parsing();
        System.out.println();
        System.out.println();
        integerUtils();
        /* 
         * WRAPPER: 
         * classes que contém funcionalidades e encapsulam variáveis de tipo primitivo
         */
    }

    private static void autoboxing() {
        System.out.println("Autoboxing:");
        /* Autoboxing */
        Integer inteiro = Integer.valueOf(29);
        Integer inteiroLiteral = Integer.valueOf("30");

        List<Integer> inteiros = new ArrayList<Integer>();
        inteiros.add(inteiro);
        inteiros.add(inteiroLiteral);

        inteiros.add(28); // -> Autoboxing

        for(Integer i : inteiros) {
            System.out.println(i);
        }
    }

    private static void unboxing() {
        System.out.println("Unboxing");
        Integer idade = Integer.valueOf(25);
        System.out.println(idade.doubleValue()); // -> Unboxing
        System.out.println(idade.intValue()); // -> Unboxing
        System.out.println(idade.shortValue()); // -> Unboxing
    }

    private static void parsing() {
        System.out.println("Parsing String(\"140\") to int: ");
        System.out.println(Integer.parseInt("140"));
    }

    private static void integerUtils() {
        System.out.println("Bytes: " + Integer.BYTES);
        System.out.println("Valor Máximo: " + Integer.MAX_VALUE);
        System.out.println("Valor Mínimo: " + Integer.MIN_VALUE);
        System.out.println("Tamanho: " + Integer.SIZE);
        System.out.println("Qual é o valor mínimo? (143, 2) => " + Integer.min(143, 2));
        System.out.println("Qual é o valor maior? (143, 2) => " + Integer.max(143, 2));
    }

}