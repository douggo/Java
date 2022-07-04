package SRW.Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import HIP.Bytebank.Model.Cliente;

public class SerializandoCliente {

    private static String file = "/home/douglas/IdeaProjects/Java/SRW/files/cliente.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializando();
        desserializando();   
    }

    private static void serializando() throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas");
        cliente.setProfissao("Dev");
        cliente.setCPF("123.456.789-00");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(cliente);
        oos.close();
    }

    private static void desserializando() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());   
    }

}
