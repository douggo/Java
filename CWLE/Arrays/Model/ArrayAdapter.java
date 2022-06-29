package CWLE.Arrays.Model;

public class ArrayAdapter {

    private Object[] coisos;
    private int tamanho;

    public ArrayAdapter() {
        this.coisos = new Object[5];
        this.tamanho = 0;
    }

    public void adiciona(Object coiso) {
        this.coisos[tamanho] = coiso;
        this.tamanho++;
    }

    public Object recupera(int posicao) {
        return this.coisos[posicao];
    }

    public int getTamanho() {
        return this.tamanho;
    }

}