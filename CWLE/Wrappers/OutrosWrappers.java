package CWLE.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class OutrosWrappers {
    
    public static void main(String[] args) {
        System.out.println();

        Double dValor = Double.valueOf(3.1415); // Autoboxing
        System.out.println(dValor.doubleValue()); // Unboxing

        Boolean bValor = Boolean.valueOf("true"); // Autoboxing
        System.out.println(bValor.booleanValue()); // Unboxing

        Number floatNumber = Float.valueOf(29.9f); // Autoboxing
        System.out.println(floatNumber.floatValue()); // Unboxing

        System.out.println();
        System.out.println();

        List<Number> numbers = new ArrayList<Number>();
        numbers.add(1);
        numbers.add(1234324324123123L);
        numbers.add(3.1415f);
        numbers.add(-500);

        for (Number number : numbers) {
            System.out.println(number.toString());
        }
    }

}
