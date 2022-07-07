package LSM.Sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import LSM.Model.Recibo;

public class TreeSets {
    
    public static void main(String[] args) {
        // Se não for possível implementar a interface comparable, é possível passar um
        // comparator parâmetro ao instanciar o TreeSet.
        Comparator<Recibo> comparator = (recibo1, recibo3) -> {
            return 1;
        };
        Set<Recibo> recibos = new TreeSet<>(comparator);
        recibos.add(new Recibo());
        recibos.add(new Recibo());
        recibos.add(new Recibo());
    }

}