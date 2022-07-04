package SRW.Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializando {

    private static String file = "/home/douglas/IdeaProjects/Java/SRW/files/serializacao.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializando();
        desserializando();
        
    }

    private static void serializando() throws IOException {
        String nome = "Douglas";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(nome);
        oos.close();
    }

    private static void desserializando() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
        
    }

}