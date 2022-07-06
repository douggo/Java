package LSM.Sets.Testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Performance {
    

    public static void main(String[] args) {
        Collection<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Teste de performance utilizando uma Lista: ");
        testaPerformanceLista(numeros);
        System.out.println();
        numeros = null;
        numeros = new HashSet<>();
        System.out.println("Teste de formance utilizando um HashSet: ");
        testaPerformanceLista(numeros);
    }

    private static void testaPerformanceLista(Collection<Integer> numeros) {
        long inicio = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fim = System.currentTimeMillis();
        long tempoDeExecucao = fim - inicio;
        System.out.println("Tempo gasto: " + tempoDeExecucao);
    }

}
