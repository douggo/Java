package CWLE.Arrays.UseCase;

public class ArrayPrimitivo {

    public static void main(String[] args) {
        System.out.println();
        manipulaArray();
    }

    private static void manipulaArray() {
        int[] idades = new int[5];
        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * (2 * 5);
        }
        for(int i : idades) {
            System.out.println(i);
        }
    }

}