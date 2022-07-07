package LSM.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PropriedadesDoMap {
    
    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        System.out.println("Nomes: ");
        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome : chaves) {
            System.out.println(nome);
        }

        System.out.println();

        System.out.println("Idades: ");
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }

        System.out.println();

        System.out.println("Associações: ");
        Set<Entry<String, Integer>> associations = nomesParaIdade.entrySet();
        for (Entry<String,Integer> association : associations) {
            System.out.println(association.getKey() + " - " + association.getValue());
        }
    }

}
