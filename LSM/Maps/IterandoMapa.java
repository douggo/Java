package LSM.Maps;

import java.util.HashMap;
import java.util.Map;

public class IterandoMapa {
    
    public static void main(String[] args) {
        Map<Integer, String> pessoas = new HashMap<>();
        
        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        /* Iterar o mapa usando o método keySet() para depois o forEach() */
        pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));
    }

}
