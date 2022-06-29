package CWLE.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class IntList {
    
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<Integer>();
        idades.add(12);
        idades.add(32);
        idades.add(17);
        idades.add(3);
        for (Integer idade : idades) {
            System.out.println(idade);
        }
        /**
         * Autoboxing & Unboxing:
         * 
         * Ato da conversão automática de um Int para Integer e vice-versa.
         * 
         * Int é primitivo
         * Integer é uma referência
         * 
         * Listas precisam sempre de uma referência, portanto não podemos utilizar
         * primitivos como Generics. Dessa forma, sempre ao realizar a adição de uma
         * informação do tipo int à um List, ArrayList, LinkedList, o Java irá criar
         * um objeto do tipo Integer.
         * 
         * Ao recuperar estes valores, o Java faz a conversão do Integer para Int
         * 
         * Essa prática se chama Autoboxing (int -> Integer) e Unboxing (Integer -> int).
         */
    }

}
